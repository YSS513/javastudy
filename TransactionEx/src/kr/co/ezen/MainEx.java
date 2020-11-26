package kr.co.ezen;

import com.naver.AccountDAO;
import com.naver.MemberDAO;

public class MainEx {

	public static void main(String[] args) {
//		AccountDAO dao = new AccountDAO();
//		dao.transter("kim", "lee", 10000);
		
		MemberDAO dao = new MemberDAO();
		dao.member("3", "pasta", "kim");
	}

}
