package com.emp.model.Root.dao.impl;

import com.core.common.Common;
import com.emp.model.Root.dao.RootDAO_interface;
import com.emp.model.Root.pojo.Root;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.core.common.Common.PASSWORD;
import static com.core.common.Common.USER;

public class RootJDBCDAO implements RootDAO_interface {

	public List<Root> findByROOT_TEXT(String ROOT_TEXT) {
		String GET_ONE_STMT = "SELECT * FROM cga105g2.root where ROOT_TEXT LIKE  ? ";
		List<Root> list = new ArrayList<Root>();
		Root rootvo = null;
		ResultSet rs = null;

		try (Connection con = DriverManager.getConnection(Common.URL, USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(GET_ONE_STMT, ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY)) {

			pstmt.setString(1, ROOT_TEXT);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				rootvo = new Root();
				rootvo.setRootId(rs.getInt("ROOT_ID"));
				rootvo.setRootText(rs.getString("ROOT_TEXT"));
				list.add(rootvo);

			}

		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
		}
		return list;

	}

	@Override
	public List<Root> getAll() {
		String GET_ALL_STMT = "SELECT * FROM cga105g2.root order by ROOT_ID";
		List<Root> list = new ArrayList<Root>();

		ResultSet rs = null;

		try (Connection con = DriverManager.getConnection(Common.URL, USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(GET_ALL_STMT, ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY)) {

			rs = pstmt.executeQuery();

			while (rs.next()) {
				Root rootVO = new Root();
				rootVO.setRootId(rs.getInt("ROOT_ID"));
				rootVO.setRootText(rs.getString("ROOT_TEXT"));
				list.add(rootVO);
			}

		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
		}
		return list;
	}


	public static void main(String[] args) {

		RootJDBCDAO dao = new RootJDBCDAO();
		// 關鍵字查詢
		List<Root> rootVO3 = dao.findByROOT_TEXT("%網站%");
		for (Root aEmp : rootVO3) {
			System.out.print(aEmp.getRootId() + ",");
			System.out.print(aEmp.getRootText() + " ");
		}

		System.out.println("---------------------");

		// 查詢全部
		List<Root> list = dao.getAll();
		for (Root aEmp : list) {
			System.out.print(aEmp.getRootId() + ",");
			System.out.print(aEmp.getRootText() + " ");
		}

	}
}
