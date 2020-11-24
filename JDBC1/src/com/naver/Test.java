package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;

public class Test {
	// 실무에서는 상수를 선언해서 사용합니다.
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	public Test() { // 드라이버 로딩은 일반적으로 생성자에서 함. 그리고 로딩은 단 1번만 함.
		// full package: 패키지.클래스명
		// >> kr.co.ezen.Test
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // 드라이버 로딩
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	
	
	public void me1() {
		Connection conn = null; // 커넥션 선언
		PreparedStatement pstmt = null; // 프리페어스테이트먼트 선언
		// 동적으로 받는 데이터는 ?로 처리한다.
		String sql = "INSERT INTO member (mid, name, job, birth) VALUES (?, ?, ?, ?)"; // sql명령문
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ezen", "ezen"); // 커넥션 연결
			System.out.println("커넥션 연결 성공");
			
			pstmt = conn.prepareStatement(sql); // 프리페어스테이트먼트 생성
			System.out.println("prepareStatement 생성 성공");
			
			pstmt.setString(1, "m005"); // 1번 인덱스(mid)에 값 넣어주기
			pstmt.setString(2, "kim"); // 2번 인덱스(name)에 값 넣어주기
			pstmt.setString(3, "c"); // 3번 인덱스(job)에 값 넣어주기
			
			pstmt.setDate(4, new Date(Calendar.getInstance().getTimeInMillis())); // 현재시간 넣어주기
			
			pstmt.executeUpdate(); // 최종적으로 값 넘겨주기
			
		} catch (Exception e) {
			System.out.println("prepareStatement 생성 실패");
			
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close(); // 메모리 종료
				}
				if (conn != null) {
					conn.close(); // 메모리 종료
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
