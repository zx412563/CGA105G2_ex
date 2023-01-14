package com.point.model.PointGoods.dao.impl;

import com.core.common.Common;
import com.point.model.PointGoods.dao.PointGoodsDAO_interface;
import com.point.model.PointGoods.pojo.PointGoods;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static com.core.common.Common.PASSWORD;
import static com.core.common.Common.USER;

public class PointGoodsDAO implements PointGoodsDAO_interface {

	@Override
	public void insert(PointGoods pointgoods) {
		String sql = "INSERT INTO cga105g2.point_goods (PD_IMG, PD_NAME, PD_PRICE, PD_TEXT, PD_TIME, PD_RTIME, PD_STATUS) VALUES (?, ?, ?, ?, ?, ?, ?)";
		try (Connection con = DriverManager.getConnection(Common.URL, USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY);
				InputStream in = Files.newInputStream(Path.of("Product.jpg"))) {
			pstmt.setBinaryStream(1, in, in.available());
			pstmt.setString(2, pointgoods.getPdName());
			pstmt.setInt(3, pointgoods.getPdPrice());
			pstmt.setString(4, pointgoods.getPdText());
			java.util.Date utilDate = new java.util.Date();
			java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(utilDate.getTime());
			pstmt.setTimestamp(5, sqlTimestamp);
			pstmt.setTimestamp(6, sqlTimestamp);
			pstmt.setInt(7, pointgoods.getPdStatus());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(PointGoods pointgoods) {
		String sql = "UPDATE cga105g2.point_goods set PD_IMG=?, PD_NAME=?, PD_PRICE=?, PD_TEXT=?, PD_RTIME=?, PD_STATUS=? where PD_ID = ?";
		try (Connection con = DriverManager.getConnection(Common.URL, USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY);
				InputStream in = Files.newInputStream(Path.of("Product2.jpg"))) {
			pstmt.setBinaryStream(1, in, in.available());
			pstmt.setString(2, pointgoods.getPdName());
			pstmt.setInt(3, pointgoods.getPdPrice());
			pstmt.setString(4, pointgoods.getPdText());
			java.util.Date utilDate = new java.util.Date();
			java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(utilDate.getTime());
			pstmt.setTimestamp(5, sqlTimestamp);
			pstmt.setInt(6, pointgoods.getPdStatus());
			pstmt.setInt(7, pointgoods.getPdId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Integer pd_id) {
		String sql = "DELETE FROM cga105g2.point_goods where PD_ID = ?";
		try (Connection con = DriverManager.getConnection(Common.URL, USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY)) {
			pstmt.setInt(1, pd_id);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public PointGoods getByPK(Integer pd_id) {
		PointGoods pointgoods = null;
		String sql = "SELECT PD_ID, PD_NAME, PD_PRICE, PD_TEXT, PD_TIME, PD_RTIME, PD_STATUS FROM cga105g2.point_goods WHERE PD_ID = ? ";
		try (Connection con = DriverManager.getConnection(Common.URL, USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY)) {
			pstmt.setInt(1, pd_id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				pointgoods = new PointGoods();
				pointgoods.setPdId(rs.getInt("PD_ID"));
				pointgoods.setPdName(rs.getString("PD_NAME"));
				pointgoods.setPdPrice(rs.getInt("PD_PRICE"));
				pointgoods.setPdText(rs.getString("PD_TEXT"));
				pointgoods.setPdTime(rs.getTimestamp("PD_TIME"));
				pointgoods.setPdRtime(rs.getTimestamp("PD_RTIME"));
				pointgoods.setPdStatus(rs.getInt("PD_STATUS"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pointgoods;
	}

	@Override
	public List<PointGoods> getAll() {
		List<PointGoods> list = new ArrayList<PointGoods>();
		String sql = "SELECT PD_ID, PD_NAME, PD_PRICE, PD_TEXT, PD_TIME, PD_RTIME, PD_STATUS FROM cga105g2.point_goods order by PD_ID";
		try (Connection con = DriverManager.getConnection(Common.URL, USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY)) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				PointGoods pointgoods = new PointGoods();
				pointgoods.setPdId(rs.getInt("PD_ID"));
				pointgoods.setPdName(rs.getString("PD_NAME"));
				pointgoods.setPdPrice(rs.getInt("PD_PRICE"));
				pointgoods.setPdText(rs.getString("PD_TEXT"));
				pointgoods.setPdTime(rs.getTimestamp("PD_TIME"));
				pointgoods.setPdRtime(rs.getTimestamp("PD_RTIME"));
				pointgoods.setPdStatus(rs.getInt("PD_STATUS"));
				list.add(pointgoods);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void main(String[] args) {

		PointGoodsDAO_interface dao = new PointGoodsDAO();

		// 新增
//		PointGoods pointgoods = new PointGoods();
//		pointgoods.setPdImg(null);
//		pointgoods.setPdName("保溫杯");
//		pointgoods.setPdPrice(200);
//		pointgoods.setPdText("TEST");
//		pointgoods.setPdTime(null);
//		pointgoods.setPdRtime(null);
//		pointgoods.setPdStatus(1);
//		dao.insert(pointgoods);

		// 修改
//		PointGoods pointgoods2 = new PointGoods();
//		pointgoods2.setPdImg(null);
//		pointgoods2.setPdName("保溫杯2");
//		pointgoods2.setPdPrice(400);
//		pointgoods2.setPdText("TEST2");
//		pointgoods2.setPdRtime(null);
//		pointgoods2.setPdStatus(0);
//		pointgoods2.setPdId(3);
//		dao.update(pointgoods2);

		// 刪除
//		dao.delete(3);
		
		// 查詢
//		PointGoods pointgoods3 = dao.getByPK(1);
//		System.out.print(pointgoods3.getPdId() + ",");
//		System.out.print(pointgoods3.getPdName() + ",");
//		System.out.print(pointgoods3.getPdPrice() + ",");
//		System.out.print(pointgoods3.getPdText() + ",");
//		System.out.print(pointgoods3.getPdTime() + ",");
//		System.out.print(pointgoods3.getPdRtime() + ",");
//		System.out.println(pointgoods3.getPdStatus());

		// 查詢
//		List<PointGoods> list = dao.getAll();
//		for (PointGoods PGs : list) {
//			System.out.print(PGs.getPdId() + ",");
//			System.out.print(PGs.getPdName() + ",");
//			System.out.print(PGs.getPdPrice() + ",");
//			System.out.print(PGs.getPdText() + ",");
//			System.out.print(PGs.getPdTime() + ",");
//			System.out.print(PGs.getPdRtime() + ",");
//			System.out.print(PGs.getPdStatus());
//			System.out.println();
//		}

	}
}
