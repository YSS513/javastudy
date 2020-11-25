package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class MemberDAO {
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";

	public MemberDAO() {
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}

	public void delete(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM member WHERE mid = ?";

		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("커넥션 연결 성공");
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getMid());

			pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		} finally {
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

	public void update(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE member SET name = ?, job = ?, birth = ? WHERE mid = ?";

		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getJob());
			pstmt.setDate(3, dto.getBirth());
			pstmt.setString(4, dto.getMid());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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

	public MemberDTO selectByMid(String mid) {
		MemberDTO dto = null;

		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM member WHERE mid = ?";
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("커넥션 연결 성공");
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, mid);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				String name = rs.getString("name");
				String job = rs.getString("job");
				Date birth = rs.getDate("birth");

				dto = new MemberDTO(mid, name, job, birth);

				System.out.println(dto);
			}

		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return dto;
	}

	public List<MemberDTO> select() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM member";
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("커넥션 연결 성공");
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String mid = rs.getString("mid");
				String name = rs.getString("name");
				String job = rs.getString("job");
				Date birth = rs.getDate("birth");

				MemberDTO dto = new MemberDTO(mid, name, job, birth);
				list.add(dto);
				System.out.println(dto);
			}

		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return list;

	}

	public void insert(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO member VALUES (?, ?, ?, ?)";

		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("커넥션 연결 성공");
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getMid());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getJob());
			pstmt.setDate(4, dto.getBirth());

			pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		} finally {
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
