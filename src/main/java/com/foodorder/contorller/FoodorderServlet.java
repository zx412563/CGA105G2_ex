package com.foodorder.contorller;

import com.foodorder.model.Meal.pojo.Meal;
import com.foodorder.model.service.FoodorderService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FoodorderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		// 取得按鈕來的請求
		String action = req.getParameter("action");
		System.out.println(action);

		if ("order_button".equals(action)) {
			// 取得店家id，這邊照理來說應該要在session可以取到，因為最前面進入店家
			// 現在先模擬自己set進去 再get出來 之後前面頁面有set過 *這邊set要移除*
			HttpSession session = req.getSession();
			session.setAttribute("storeId", 6);
			Integer storeid = (Integer) session.getAttribute("storeId");

			// 利用service取資料
			// 1.清單資料
			FoodorderService foodorderSvc = new FoodorderService();
			List<Meal> list = foodorderSvc.getAllStatusOk(storeid);
			// 2.訂位設定資料
			// 盧逸臣dao
			String timestr = "11:00, 12:00, 13:00";
			Integer tablecount =10;
			Integer orderlimit =20;
			// 測試json
//		    Meal meal1 = new Meal(2,2);
//		    Meal meal2 = new Meal(3,3);
//		    List<Meal> list2 = new ArrayList<Meal>();
//		    list2.add(meal1);
//		    list2.add(meal2);
//		    String jsonString = JSON.toJSONString(list2);
			// 轉交資料
			req.setAttribute("list", list); // 資料庫取出的list物件,存入req
			req.setAttribute("timestr", timestr);//尚未寫邏輯
			req.setAttribute("tablecount", tablecount);//尚未寫邏輯
			req.setAttribute("orderlimit", orderlimit);//尚未寫邏輯
//			req.setAttribute("testjsonstring", jsonString);// 測試json字串到前面
			// Send the Success view
			String url = "/front-end/foodorder/listAllMeal.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);// 成功轉交listAllEmp2_getFromSession.jsp
			successView.forward(req, res);
		}

		if ("getOne_For_Update".equals(action)) {
			Map<String, String> errorMsgs = new LinkedHashMap<String, String>();
			req.setAttribute("errorMsgs", errorMsgs);
			System.out.println("zzzzzzzzzzz");
			Integer mealId = Integer.valueOf(req.getParameter("mealId").trim());
			/*************************** 2.開始查詢資料 ****************************************/
			FoodorderService foodorderSvc = new FoodorderService();
			Meal meal = foodorderSvc.getOneMeal(mealId);
			/*************************** 3.查詢完成,準備轉交(Send the Success view) ************/
			req.setAttribute("mealVO", meal); // 資料庫取出的empVO物件,存入req
			String url = "/front-end/foodorder/update_meal_input.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);// 成功轉交 update_emp_input.jsp
			successView.forward(req, res);
		}

		if ("update".equals(action)) { // 來自update_emp_input.jsp的請求

			List<String> errorMsgs = new LinkedList<String>();
			// Store this set in the request scope, in case we need to
			// send the ErrorPage view.
			req.setAttribute("errorMsgs", errorMsgs);

			/*************************** 1.接收請求參數 - 輸入格式的錯誤處理 **********************/
			Integer mealId = Integer.valueOf(req.getParameter("mealId").trim());

			String mealName = req.getParameter("mealName");
			String mealnameReg = "^[(\u4e00-\u9fa5)(a-zA-Z0-9_)]{2,10}$";
			if (mealName == null || mealName.trim().length() == 0) {
				errorMsgs.add("餐點名稱: 請勿空白");
			} else if (!mealName.trim().matches(mealnameReg)) { // 以下練習正則(規)表示式(regular-expression)
				errorMsgs.add("餐點名稱: 只能是中、英文字母、數字和_ , 且長度必需在2到10之間");
			}

			String mealPrice = req.getParameter("mealPrice").trim();

			if (mealPrice == null || mealPrice.trim().length() == 0) {
				errorMsgs.add("金額請勿空白");
			}
			try {
				if (Integer.parseInt(mealPrice) <= 0) {
					errorMsgs.add("金額請填大於0的整數");
				}
			} catch (NumberFormatException e) {
				errorMsgs.add("金額請填整數");
			}

			if (!errorMsgs.isEmpty()) {
				// 撈出該id資料再回傳 因為輸入錯誤
				FoodorderService foodorderSvc = new FoodorderService();
				Meal oldmeal = foodorderSvc.getOneMeal(mealId);
				req.setAttribute("mealVO", oldmeal);
				RequestDispatcher failureView = req.getRequestDispatcher("/front-end/foodorder/update_meal_input.jsp");
				failureView.forward(req, res);
				return; // 程式中斷
			}

			/*************************** 2.開始修改資料 *****************************************/
			// 利用service
			FoodorderService foodorderSvc = new FoodorderService();
			// 取得店家id，這邊照理來說應該要在session可以取到，因為最前面進入店家
			HttpSession session = req.getSession();
			Integer storeid = (Integer) session.getAttribute("storeId");
			// 整理新的vo
			Meal meal = new Meal();
			meal.setMealId(mealId);
			meal.setStoreId(storeid);
			meal.setMealName(mealName);
			meal.setMealPrice(Integer.parseInt(mealPrice));
			meal.setMealStatus(1);
			Meal oldmeal = foodorderSvc.getOneMeal(mealId);
			// 資料處理
			// 新的不等於舊的
			if (!meal.equals(oldmeal)) {
				foodorderSvc.updateMeal(mealId, meal);
			}
			// 把要跳轉的的資料也要準備好 不然都沒有資料
			List<Meal> list = foodorderSvc.getAllStatusOk(storeid);
			/*************************** 3.修改完成,準備轉交(Send the Success view) *************/
			req.setAttribute("list", list); // 資料庫update成功後,正確的的empVO物件,存入req
			String url = "/front-end/foodorder/listAllMeal.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url); // 修改成功後,轉交listOneEmp.jsp
			successView.forward(req, res);
		}

		if ("delete".equals(action)) { // 來自listAllEmp.jsp

			List<String> errorMsgs = new LinkedList<String>();
			// Store this set in the request scope, in case we need to
			// send the ErrorPage view.
			req.setAttribute("errorMsgs", errorMsgs);

			/*************************** 1.接收請求參數 ***************************************/
			Integer mealid = Integer.valueOf(req.getParameter("mealId"));

			/*************************** 2.開始刪除資料 ***************************************/
			// 取得店家id，這邊照理來說應該要在session可以取到，因為最前面進入店家
			HttpSession session = req.getSession();
			Integer storeid = (Integer) session.getAttribute("storeId");
			
			FoodorderService foodorderSvc = new FoodorderService();
			foodorderSvc.deleteMeal(mealid);
			// 把要跳轉的的資料也要準備好 不然都沒有資料
			List<Meal> list = foodorderSvc.getAllStatusOk(storeid);
			/*************************** 3.刪除完成,準備轉交(Send the Success view) ***********/
			req.setAttribute("list", list); // 資料庫update成功後,正確的的empVO物件,存入req
			String url = "/front-end/foodorder/listAllMeal.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);// 刪除成功後,轉交回送出刪除的來源網頁
			successView.forward(req, res);
		}
		
		
		
		if ("insert".equals(action)) { // 來自update_emp_input.jsp的請求

			List<String> errorMsgs = new LinkedList<String>();
			// Store this set in the request scope, in case we need to
			// send the ErrorPage view.
			req.setAttribute("errorMsgs", errorMsgs);

			/*************************** 1.接收請求參數 - 輸入格式的錯誤處理 **********************/
			String mealName = req.getParameter("mealName");
			String mealnameReg = "^[(\u4e00-\u9fa5)(a-zA-Z0-9_)]{2,10}$";
			if (mealName == null || mealName.trim().length() == 0) {
				errorMsgs.add("餐點名稱: 請勿空白");
			} else if (!mealName.trim().matches(mealnameReg)) { // 以下練習正則(規)表示式(regular-expression)
				errorMsgs.add("餐點名稱: 只能是中、英文字母、數字和_ , 且長度必需在2到10之間");
			}

			String mealPrice = req.getParameter("mealPrice").trim();

			if (mealPrice == null || mealPrice.trim().length() == 0) {
				errorMsgs.add("金額請勿空白");
				Integer price = 0;
			}
			Integer price = null;
			try {
				if (Integer.parseInt(mealPrice) <= 0) {
					errorMsgs.add("金額請填大於0的整數");
					price = 0;
				}else {
					price = Integer.parseInt(mealPrice);
				}
			} catch (NumberFormatException e) {
				errorMsgs.add("金額請填整數");
				price = 0;
			}

			if (!errorMsgs.isEmpty()) {
				// 因為輸入錯誤 old資料往回傳
				Meal oldmeal = new Meal();
				oldmeal.setMealName(mealName);
				oldmeal.setMealPrice(price);
				req.setAttribute("mealVO", oldmeal);
				RequestDispatcher failureView = req.getRequestDispatcher("/front-end/foodorder/addMeal.jsp");
				failureView.forward(req, res);
				return; // 程式中斷
			}

			/*************************** 2.開始修改資料 *****************************************/
			// 利用service
			FoodorderService foodorderSvc = new FoodorderService();
			// 取得店家id，這邊照理來說應該要在session可以取到，因為最前面進入店家
			HttpSession session = req.getSession();
			Integer storeid = (Integer) session.getAttribute("storeId");
			// 整理新的vo
			Meal meal = new Meal();
			meal.setStoreId(storeid);
			meal.setMealName(mealName);
			meal.setMealPrice(Integer.parseInt(mealPrice));
			meal.setMealStatus(1);
			// 資料處理
			foodorderSvc.insertMeal(meal);
			// 把要跳轉的的資料也要準備好 不然都沒有資料
			List<Meal> list = foodorderSvc.getAllStatusOk(storeid);
			/*************************** 3.修改完成,準備轉交(Send the Success view) *************/
			req.setAttribute("list", list); // 資料庫update成功後,正確的的empVO物件,存入req
			String url = "/front-end/foodorder/listAllMeal.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url); // 修改成功後,轉交listOneEmp.jsp
			successView.forward(req, res);
		}

	}

}
