package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	public final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	public final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public final String USER_NAME = "ezen";
	public final String PASSWORD = "ezen";
	
	public MemberDAO() {
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	public void member(String oid, String menu, String mid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO oder (oid, menu, mid) VALUES (?, ?, ?)";
		String sql2 = "UPDATE member10 SET point = point + 10 WHERE mid = ?";
		boolean isOk = false;
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, oid);
			pstmt.setString(2, menu);
			pstmt.setString(3, mid);
			pstmt.executeUpdate();
			
			if (pstmt != null) {
				pstmt.close();
			}
			
			System.out.println("트랜잭션 테스트");
			System.out.println(4/0);
			
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, mid);
			pstmt.executeUpdate();
			
			isOk = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (isOk) {
					conn.commit();
				} else {
					conn.rollback();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
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
