package com.member.model.Member.dao.impl;

import com.core.common.Common;
import com.member.model.Member.dao.MemberDAO_interface;
import com.member.model.Member.pojo.Member;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MemberDAO implements MemberDAO_interface {
	
	
	@Override
	public void insert(Member member) {
		String sql = "INSERT INTO cga105g2.member (MEM_ACC,MEM_PWD,MEM_MAIL,MEM_NAME,MEM_RECIPIENT,MEM_TW_ID,MEM_BIRTHDAY,MEM_PHONE,MEM_POSTAL_CODE,MEM_CITY,MEM_DISTRICT,MEM_ADDRESS) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection con = DriverManager.getConnection(Common.URL, Common.USER, Common.PASSWORD);
				 PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
							ResultSet.CONCUR_READ_ONLY)){
		pstmt.setString(1, member.getMemAcc());
		pstmt.setString(2, member.getMemPwd());
		pstmt.setString(3, member.getMemMail());	
		pstmt.setString(4, member.getMemName());
		pstmt.setString(5, member.getMemRecipient());
		pstmt.setString(6, member.getMemTwId());
		pstmt.setDate(7, member.getMemBirthday());
		pstmt.setString(8, member.getMemPhone());
		pstmt.setInt(9, member.getMemPostalCode());
		pstmt.setString(10, member.getMemCity());
		pstmt.setString(11, member.getMemDistrict());
		pstmt.setString(12, member.getMemAddress());
		
		pstmt.executeUpdate();

		}
		catch (SQLException se) {
			throw new RuntimeException("A database error occured. "
					+ se.getMessage());
		}
		
	}

	@Override
	public void update(Member member) {
		String sql = 
				"UPDATE cga105g2.member set MEM_ACC=?,MEM_PWD=?,MEM_MAIL=?,MEM_PIC=?,MEM_NAME=?,MEM_RECIPIENT=?,MEM_TW_ID=?,MEM_BIRTHDAY=?,MEM_PHONE=?,MEM_POSTAL_CODE=?,MEM_CITY=?,MEM_DISTRICT=?,MEM_ADDRESS=?,MEM_TEXT=? where MEM_ID = ?";
		try (Connection con = DriverManager.getConnection(Common.URL, Common.USER, Common.PASSWORD);
			    PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
			    	      ResultSet.CONCUR_READ_ONLY)){
	
		
		pstmt.setString(1, member.getMemAcc());
		pstmt.setString(2, member.getMemPwd());
		pstmt.setString(3, member.getMemMail());
		pstmt.setBytes(4, member.getMemPic());
		pstmt.setString(5, member.getMemName());
		pstmt.setString(6, member.getMemRecipient());
		pstmt.setString(7, member.getMemTwId());
		pstmt.setDate(8, member.getMemBirthday());
		pstmt.setString(9, member.getMemPhone());
		pstmt.setInt(10, member.getMemPostalCode());
		pstmt.setString(11, member.getMemCity());
		pstmt.setString(12, member.getMemDistrict());
		pstmt.setString(13, member.getMemAddress());
		pstmt.setString(14, member.getMemText());
		pstmt.setInt(15, member.getMemId());

		pstmt.executeUpdate();
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. "
					+ se.getMessage());
		}
		
	}

	@Override
	public void delete(Integer memId) {

		String sql = 
				"DELETE FROM cga105g2.member where MEM_ID = ?";
		try (Connection con = DriverManager.getConnection(Common.URL, Common.USER, Common.PASSWORD);
			    PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
			    	      ResultSet.CONCUR_READ_ONLY)){

			pstmt.setInt(1, memId);
			pstmt.executeUpdate();

			// Handle any driver errors
		
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. "
					+ se.getMessage());
		}

		
	}

	@Override
	public Member getById(Integer memId) {

		String sql = "SELECT MEM_ID,MEM_STATUS,MEM_ACC,MEM_PWD,MEM_MAIL,MEM_PIC,MEM_NAME,MEM_RECIPIENT,MEM_TW_ID,MEM_BIRTHDAY,MEM_PHONE,MEM_POSTAL_CODE,MEM_CITY,MEM_DISTRICT,MEM_ADDRESS,MEM_TEXT,MEM_TIME,MEM_POINT FROM cga105g2.member where MEM_ID = ?";
		
		Member member = null;
		try (Connection con = DriverManager.getConnection(Common.URL, Common.USER, Common.PASSWORD);
			    PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
			    	      ResultSet.CONCUR_READ_ONLY)){

			pstmt.setInt(1, memId);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				// memberVO 也稱為 Domain objects
				member = new Member();
				member.setMemId(rs.getInt("MEM_ID"));
				member.setMemStatus(rs.getInt("MEM_STATUS"));
				member.setMemAcc(rs.getString("MEM_ACC"));
				member.setMemPwd(rs.getString("MEM_PWD"));
				member.setMemMail(rs.getString("MEM_MAIL"));
				member.setMemPic(rs.getBytes("MEM_PIC"));
				member.setMemName(rs.getString("MEM_NAME"));
				member.setMemRecipient(rs.getString("MEM_RECIPIENT"));
				member.setMemTwId(rs.getString("MEM_TW_ID"));
				member.setMemBirthday(rs.getDate("MEM_BIRTHDAY"));
				member.setMemPhone(rs.getString("MEM_PHONE"));
				member.setMemPostalCode(rs.getInt("MEM_POSTAL_CODE"));
				member.setMemCity(rs.getString("MEM_CITY"));
				member.setMemDistrict(rs.getString("MEM_DISTRICT"));
				member.setMemAddress(rs.getString("MEM_ADDRESS"));
				member.setMemText(rs.getString("MEM_TEXT"));
				member.setMemTime(rs.getTimestamp("MEM_TIME"));
				member.setMemPoint(rs.getInt("MEM_POINT"));
			}

			// Handle any driver errors
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. "
					+ se.getMessage());
			// Clean up JDBC resources
		}
		return member;
	}

	@Override
	public List<Member> getAll() {
		List<Member> list = new ArrayList<Member>();
		Member member = null;
		String sql = 
				"SELECT MEM_ID,MEM_STATUS,MEM_ACC,MEM_PWD,MEM_MAIL,MEM_PIC,MEM_NAME,MEM_RECIPIENT,MEM_TW_ID,MEM_BIRTHDAY,MEM_PHONE,MEM_POSTAL_CODE,MEM_CITY,MEM_DISTRICT,MEM_ADDRESS,MEM_TEXT,MEM_TIME,MEM_POINT FROM cga105g2.member order by MEM_ID";
		try (Connection con = DriverManager.getConnection(Common.URL, Common.USER, Common.PASSWORD);
			    PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
			    	      ResultSet.CONCUR_READ_ONLY)){

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				// memberVO 也稱為 Domain objects
				member = new Member();
				member.setMemId(rs.getInt("MEM_ID"));
				member.setMemStatus(rs.getInt("MEM_STATUS"));
				member.setMemAcc(rs.getString("MEM_ACC"));
				member.setMemPwd(rs.getString("MEM_PWD"));
				member.setMemMail(rs.getString("MEM_MAIL"));
				member.setMemPic(rs.getBytes("MEM_PIC"));
				member.setMemName(rs.getString("MEM_NAME"));
				member.setMemRecipient(rs.getString("MEM_RECIPIENT"));
				member.setMemTwId(rs.getString("MEM_TW_ID"));
				member.setMemBirthday(rs.getDate("MEM_BIRTHDAY"));
				member.setMemPhone(rs.getString("MEM_PHONE"));
				member.setMemPostalCode(rs.getInt("MEM_POSTAL_CODE"));
				member.setMemCity(rs.getString("MEM_CITY"));
				member.setMemDistrict(rs.getString("MEM_DISTRICT"));
				member.setMemAddress(rs.getString("MEM_ADDRESS"));
				member.setMemText(rs.getString("MEM_TEXT"));
				member.setMemTime(rs.getTimestamp("MEM_TIME"));
				member.setMemPoint(rs.getInt("MEM_POINT"));
				list.add(member); // Store the row in the list
			}
		
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. "
					+ se.getMessage());
			// Clean up JDBC resources
		}
		return list;
	}
	
	@Override
	public void update(Integer id, Integer status) {
		String sql = "UPDATE cga105g2.member set MEM_STATUS = ? where MEM_ID = ?";
		try (Connection con = DriverManager.getConnection(Common.URL, Common.USER, Common.PASSWORD);
			    PreparedStatement pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
			    	      ResultSet.CONCUR_READ_ONLY)){
		pstmt.setInt(1, status);
		pstmt.setInt(2, id);
		pstmt.executeUpdate();
		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. "
					+ se.getMessage());
		}
	}
	
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
//
//		 //新增
//		Member memberVO1 = new Member();
//		
//		memberVO1.setMemAcc("louie975416");
//		memberVO1.setMemPwd("975416lu");
//		memberVO1.setMemMail("louie975416@gmail.com");
//		memberVO1.setMemName("good good");
//		memberVO1.setMemRecipient("Louie");
//		memberVO1.setMemTwId("F129671333");
//		memberVO1.setMemBirthday(java.sql.Date.valueOf("1996-03-28"));
//		memberVO1.setMemPhone("0916515328");
//		memberVO1.setMemPostalCode(112);
//		memberVO1.setMemCity("台北市");
//		memberVO1.setMemDistrict("北投區");
//		memberVO1.setMemAddress("泉源路35巷4號二樓");
//		dao.insert(memberVO1);
//		System.out.println("HI");

		// 修改
//		Member memberVO2 = new Member();
//		
//		memberVO2.setMemAcc("louie975416");
//		memberVO2.setMemPwd("975416lu");
//		memberVO2.setMemMail("louie975416@gmail.com");
//		memberVO2.setMemPic(null);
//		memberVO2.setMemName("bad bad");
//		memberVO2.setMemRecipient("Louie123");
//		memberVO2.setMemTwId("F129671333");
//		memberVO2.setMemBirthday(java.sql.Date.valueOf("1996-03-28"));
//		memberVO2.setMemPhone("0916515328");
//		memberVO2.setMemPostalCode(119);
//		memberVO2.setMemCity("宜蘭縣");
//		memberVO2.setMemDistrict("礁溪");
//		memberVO2.setMemAddress("我忘了");
//		memberVO2.setMemText("99999");
//		memberVO2.setMemId(11);
//		
//		System.out.println("HI");
//
//		dao.update(memberVO2);
//
//		// 刪除
//		dao.delete(9);//?

//		// 查詢
//		Member memberVO3 = dao.getById(11);//?
//		System.out.print(memberVO3.getMemId() + ",");
//		System.out.print(memberVO3.getMemStatus() + ",");
//		System.out.print(memberVO3.getMemAcc() + ",");
//		System.out.print(memberVO3.getMemPwd() + ",");
//		System.out.print(memberVO3.getMemMail() + ",");
//		System.out.print(memberVO3.getMemPic() + ",");
//		System.out.print(memberVO3.getMemName());
//		System.out.print(memberVO3.getMemRecipient() + ",");
//		System.out.print(memberVO3.getMemTwId() + ",");
//		System.out.print(memberVO3.getMemBirthday() + ",");
//		System.out.print(memberVO3.getMemPhone() + ",");
//		System.out.print(memberVO3.getMemPostalCode() + ",");
//		System.out.print(memberVO3.getMemCity() + ",");
//		System.out.print(memberVO3.getMemDistrict() + ",");
//		System.out.print(memberVO3.getMemAddress() + ",");
//		System.out.print(memberVO3.getMemText() + ",");
//		System.out.print(memberVO3.getMemTime() + ",");
//		System.out.print(memberVO3.getMemPoint() + ",");
//		System.out.println("---------------------");
//
//
		// 查詢
		List<Member> list = dao.getAll();
		for (Member amem : list) {
			System.out.print(amem.getMemId() + ",");
			System.out.print(amem.getMemStatus() + ",");
			System.out.print(amem.getMemAcc() + ",");
			System.out.print(amem.getMemPwd() + ",");
			System.out.print(amem.getMemMail() + ",");
			System.out.print(amem.getMemPic() + ",");
			System.out.print(amem.getMemName() + ",");
			System.out.print(amem.getMemRecipient() + ",");
			System.out.print(amem.getMemTwId() + ",");
			System.out.print(amem.getMemBirthday() + ",");
			System.out.print(amem.getMemPhone() + ",");
			System.out.print(amem.getMemPostalCode() + ",");
			System.out.print(amem.getMemCity() + ",");
			System.out.print(amem.getMemDistrict() + ",");
			System.out.print(amem.getMemAddress() + ",");
			System.out.print(amem.getMemText() + ",");
			System.out.print(amem.getMemTime() + ",");
			System.out.print(amem.getMemPoint());
			System.out.println();
		}
//		
//		// 用memid修改status
//		dao.update(5, 0);
		
	}


}
