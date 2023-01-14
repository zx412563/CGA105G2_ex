package com.code.contorller;


import com.code.model.Code.pojo.Code;
import com.code.model.service.CodeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@WebServlet("/CodeServlet")
public class CodeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doPost(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        CodeService codeSvc=new CodeService();
        String action = req.getParameter("action");
//        final Integer storeid = (Integer) req.getSession().getAttribute("storeid");
        Integer storeid=47;

        if("addCode".equals(action)){
            List<String> errorMsgs = new LinkedList<String>();
            req.setAttribute("errorMsgs", errorMsgs);
            /***********************1.接收請求參數 - 輸入格式的錯誤處理*************************/
            String codeNum = req.getParameter("codeNum");
            String codeNumReg =  "^[(a-zA-Z0-9)]{4,8}$";
            if(!codeNum.trim().matches(codeNumReg)) {
                errorMsgs.add("優惠券碼: 只能是4~8碼英文及數字的組合");};
                Integer codeOff = null;
            try {
                codeOff=Integer.valueOf(req.getParameter("codeOff").trim());
            } catch (NumberFormatException e) {
                errorMsgs.add("折扣金額請輸入數字");
            }
            java.sql.Date codeNtime = java.sql.Date.valueOf(req.getParameter("codeNtime").trim());
            String codeText = req.getParameter("codeText");

            Code code=codeSvc.todao(codeNum,codeOff,codeNtime,codeText);
            String url = "/front-end/store/code/addCode.jsp";
            if (!errorMsgs.isEmpty()) {
                req.setAttribute("Code",code); // 含有輸入格式錯誤的empVO物件,也存入req
                req.setAttribute("toResult",false);
                RequestDispatcher failureView = req.getRequestDispatcher(url);
                failureView.forward(req, res);
                return;
            }
            codeSvc.addEmp(storeid, codeNum, codeOff, codeNtime, codeText);
            if (errorMsgs.isEmpty()){
                req.setAttribute("toResult",true);
                RequestDispatcher successView = req.getRequestDispatcher(url);
                successView.forward(req, res);
            }
        }


    }












}


