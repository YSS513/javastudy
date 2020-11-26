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
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("����̹� �ε� ����");
		}
	}
	
	public void transter(String fromId, String toId, int howmuch) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE account SET balance = balance + ? WHERE id = ?";
		String sql2 = "UPDATE account SET balance = balance - ? WHERE id = ?";
		ResultSet rs = null;
		// Ʈ����� �۾��� boolean�� ������ ����
		boolean isOk = false;
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			// JDBC�� ����Ʈ�� �����̱⶧���� �������� �ٲ��ִ� �۾�.
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, howmuch);
			pstmt.setString(2, toId);
			pstmt.executeUpdate();
			
			// �����۾� ������ �ݵ�� close�� �̿��ؼ� �ݾ�����Ѵ�.
			if (pstmt != null) {
				pstmt.close();
			}
			
			System.out.println("�� ������ �����ϴ�.");
			System.out.println(4/0);
			
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, howmuch);
			pstmt.setString(2, fromId);
			pstmt.executeUpdate();
			
			// �� �ٱ��� �Դٸ�, �۾��� ���������� ��ģ ���̹Ƿ� true�� �ʱ�ȭ��.
			isOk = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �� if���� �׻� finally�� �־�� �ϸ�, close���� ���� �־�� �Ѵ�.
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
