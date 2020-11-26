package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
	public final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	public final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public final String USER_NAME = "ezen";
	public final String PASSWORD = "ezen";
	
	public AccountDAO() {
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		}
	}
	
	public void transter(String fromId, String toId, int howmuch) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE account SET balance = balance + ? WHERE id = ?";
		String sql2 = "UPDATE account SET balance = balance - ? WHERE id = ?";
		ResultSet rs = null;
		// 트랜잭션 작업용 boolean형 변수를 만듦
		boolean isOk = false;
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			// JDBC는 디폴트가 오토이기때문에 수동으로 바꿔주는 작업.
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, howmuch);
			pstmt.setString(2, toId);
			pstmt.executeUpdate();
			
			// 다중작업 이전에 반드시 close를 이용해서 닫아줘야한다.
			if (pstmt != null) {
				pstmt.close();
			}
			
			System.out.println("곧 전원이 나갑니다.");
			System.out.println(4/0);
			
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, howmuch);
			pstmt.setString(2, fromId);
			pstmt.executeUpdate();
			
			// 이 줄까지 왔다면, 작업을 성공적으로 마친 것이므로 true로 초기화함.
			isOk = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 이 if문은 항상 finally에 있어야 하며, close보다 위에 있어야 한다.
			try {
				if (isOk) {
					conn.commit();
				} else {
					conn.rollback();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if (rs != null) {
					rs.close();
				}
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
