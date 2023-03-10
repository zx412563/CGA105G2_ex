package com.emp.model.EmployeeRoot.dao.impl;

import com.core.common.Common;
import com.emp.model.EmployeeRoot.dao.EmployeeRootDAO_interface;
import com.emp.model.EmployeeRoot.pojo.EmployeeRoot;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.core.common.Common.PASSWORD;
import static com.core.common.Common.USER;


public class EmployeeRootJDBCDAO implements EmployeeRootDAO_interface {

	@Override
	public void insert(EmployeeRoot EmployeeRootVO) {
		String INSERT_STMT = "INSERT INTO cga105g2.employee_root (EMP_ID,ROOT_ID) VALUES (?, ?)";

		try (Connection con = DriverManager.getConnection(Common.URL, USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(INSERT_STMT, ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY)) {

			pstmt.setInt(1, EmployeeRootVO.getEmpId());
			pstmt.setInt(2, EmployeeRootVO.getRootId());
			pstmt.executeUpdate();

		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
		}
	}

	@Override
	public List<EmployeeRoot> getAll() {
		String GET_ALL_STMT = "SELECT * FROM cga105g2.employee_root order by EMP_ID";
		List<EmployeeRoot> list = new ArrayList<EmployeeRoot>();

		try (Connection con = DriverManager.getConnection(Common.URL, USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(GET_ALL_STMT, ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY)) {
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				EmployeeRoot employeeRootVO = new EmployeeRoot();
				employeeRootVO.setRootId(rs.getInt("ROOT_ID"));
				employeeRootVO.setEmpId(rs.getInt("EMP_ID"));
				list.add(employeeRootVO);
			}

		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
		}

		return list;
	}

	@Override
	public List<EmployeeRoot> findByEMP_ID(Integer EMP_ID) {
		String GET_ONE_EMP_ID = "SELECT * FROM cga105g2.employee_root where EMP_ID =  ? ";
		List<EmployeeRoot> list = new ArrayList<EmployeeRoot>();

		try (Connection con = DriverManager.getConnection(Common.URL, USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(GET_ONE_EMP_ID, ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY)) {
			pstmt.setInt(1, EMP_ID);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				EmployeeRoot employeeRootVO = new EmployeeRoot();
				employeeRootVO.setRootId(rs.getInt("ROOT_ID"));
				employeeRootVO.setEmpId(rs.getInt("EMP_ID"));
				list.add(employeeRootVO);
			}

		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
		}

		return list;
	}

	@Override
	public void delete(Integer EMP_ID, Integer ROOT_ID) {
		String DELETE = "DELETE FROM  cga105g2.employee_root where EMP_ID = ? and ROOT_ID = ?";

		try (Connection con = DriverManager.getConnection(Common.URL, USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(DELETE, ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY)) {

			pstmt.setInt(1, EMP_ID);
			pstmt.setInt(2, ROOT_ID);
			pstmt.executeUpdate();

		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
		}

	}

	@Override
	public List<EmployeeRoot> findByROOT_ID(Integer ROOT_ID) {
		String GET_ONE_ROOT_ID = "SELECT * FROM cga105g2.employee_root where ROOT_ID =  ? ";
		List<EmployeeRoot> list = new ArrayList<EmployeeRoot>();

		try (Connection con = DriverManager.getConnection(Common.URL, USER, PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(GET_ONE_ROOT_ID, ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY)) {
			pstmt.setInt(1, ROOT_ID);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				EmployeeRoot employeeRootVO = new EmployeeRoot();
				employeeRootVO.setRootId(rs.getInt("ROOT_ID"));
				employeeRootVO.setEmpId(rs.getInt("EMP_ID"));
				list.add(employeeRootVO);
			}

		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
		}

		return list;
	}



	public static void main(String[] args) {

		EmployeeRootJDBCDAO dao = new EmployeeRootJDBCDAO();
		// ??????
//		EmployeeRootVO employeeRootVO = new EmployeeRootVO();
//		employeeRootVO.setEmpId(1);
//		employeeRootVO.setRootId(2);
//		dao.insert(employeeRootVO);

		// ????????????
//		List<EmployeeRootVO> list = dao.getAll();
//		for (EmployeeRootVO i : list) {
//			System.out.print(i.getEmpId() + ",");
//			System.out.print(i.getRootId() + "
//		");
//		}
		// ???????????????
//		List<EmployeeRootVO> emp = dao.findByEMP_ID(1);
//		for (EmployeeRootVO i : emp) {
//			System.out.print(i.getEmpId() + ",");
//			System.out.print(i.getRootId() + "
//		");
//		}
		// ??????
//		dao.delete(1, 1);
		// ???????????????
//		List<EmployeeRoot> emp = dao.findByROOT_ID(3);
//		for (EmployeeRoot i : emp) {
//			System.out.print(i.getEmpId() + ",");
//			System.out.print(i.getRootId() + "
//		");
//		}

	}

}
