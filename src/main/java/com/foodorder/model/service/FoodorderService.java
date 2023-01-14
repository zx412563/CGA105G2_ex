package com.foodorder.model.service;

import com.foodorder.model.Meal.dao.MealDAO_interface;
import com.foodorder.model.Meal.dao.impl.MealJDBCDAO;
import com.foodorder.model.Meal.pojo.Meal;

import java.util.List;

public class FoodorderService {
	private MealDAO_interface dao;

	public FoodorderService() {
		dao = new MealJDBCDAO();
	}
	// 取出所有餐點 且 狀態是上架的
	public List<Meal> getAllStatusOk(Integer storeid) {
		return dao.getByStoreIdStatus(storeid, 1);
	}
	
	// 按下修改 先取出 該筆資料
	public Meal getOneMeal(Integer mealid) {
		return dao.getByMealId(mealid);
	}
	
	// 修改送出按鈕  就是 下架該套餐 且 上架修改套餐的那一筆
	public void updateMeal(Integer mealid, Meal meal) {
		dao.getByStoreIdStatus(mealid, 1);
		Meal oldmeal = dao.getByMealId(mealid);
		
		dao.update(mealid, 0);
		dao.insert(meal);

	}
	
	// 刪除按鈕
	public void deleteMeal(Integer mealid) {
		dao.update(mealid, 0);
	}
	
	// 新增按鈕
	public void insertMeal(Meal meal) {
		dao.insert(meal);
	}

}
