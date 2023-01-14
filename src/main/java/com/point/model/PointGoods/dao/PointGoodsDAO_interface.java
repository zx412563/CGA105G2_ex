package com.point.model.PointGoods.dao;

import com.point.model.PointGoods.pojo.PointGoods;

import java.util.List;

public interface PointGoodsDAO_interface {

	void insert(PointGoods pointgoods);

	void update(PointGoods pointgoods);

	void delete(Integer pd_id);

	PointGoods getByPK(Integer pd_idS);

	List<PointGoods> getAll();

}