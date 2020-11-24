package kr.co.ezen;

import java.sql.Date;
import java.util.Calendar;

import com.naver.MemberDAO;
import com.naver.MemberDTO;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		// 일반적으로 dao클래스는 테이블당 1개 생성된다고 보면 됩니다.
		// dao란? 자바와 db를 이어주는 것
		// 이해관계 >> 자바 : dao : prepareStatement
		
//		Test dao = new Test();
//		
//		dao.me1();
		
		MemberDAO dao2 = new MemberDAO();
//		MemberDTO dto = new MemberDTO("m006", "jin", "a", 
//				new Date(Calendar.getInstance().getTimeInMillis()));
//		dao2.insert(dto);
		
		dao2.delete(new MemberDTO("m006", null, null, null));
		
	}

}
