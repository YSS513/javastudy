package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;

public class Test {
	// �ǹ������� ����� �����ؼ� ����մϴ�.
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	public Test() { // ����̹� �ε��� �Ϲ������� �����ڿ��� ��. �׸��� �ε��� �� 1���� ��.
		// full package: ��Ű��.Ŭ������
		// >> kr.co.ezen.Test
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // ����̹� �ε�
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}
	}
	
	
	
	public void me1() {
		Connection conn = null; // Ŀ�ؼ� ����
		PreparedStatement pstmt = null; // ����������Ʈ��Ʈ ����
		// �������� �޴� �����ʹ� ?�� ó���Ѵ�.
		String sql = "INSERT INTO member (mid, name, job, birth) VALUES (?, ?, ?, ?)"; // sql��ɹ�
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ezen", "ezen"); // Ŀ�ؼ� ����
			System.out.println("Ŀ�ؼ� ���� ����");
			
			pstmt = conn.prepareStatement(sql); // ����������Ʈ��Ʈ ����
			System.out.println("prepareStatement ���� ����");
			
			pstmt.setString(1, "m005"); // 1�� �ε���(mid)�� �� �־��ֱ�
			pstmt.setString(2, "kim"); // 2�� �ε���(name)�� �� �־��ֱ�
			pstmt.setString(3, "c"); // 3�� �ε���(job)�� �� �־��ֱ�
			
			pstmt.setDate(4, new Date(Calendar.getInstance().getTimeInMillis())); // ����ð� �־��ֱ�
			
			pstmt.executeUpdate(); // ���������� �� �Ѱ��ֱ�
			
		} catch (Exception e) {
			System.out.println("prepareStatement ���� ����");
			
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close(); // �޸� ����
				}
				if (conn != null) {
					conn.close(); // �޸� ����
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
