package kr.co.ezen;

import java.sql.Date;
import java.util.Calendar;

import com.naver.MemberDAO;
import com.naver.MemberDTO;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		// 일반적으로 dao클래스는 테이블당 1개 생성된다고 보면 됩니다.
		// dao란? 자바와 db를 이어주는 다리
		// 이해관계 >> 자바 : dao : prepareStatement
		
//		Test dao = new Test();
//		
//		dao.me1();
		
		MemberDAO dao2 = new MemberDAO();
//입력	MemberDTO dto = new MemberDTO("m006", "jin", "a", 
// ~		new Date(Calendar.getInstance().getTimeInMillis()));
//입력	dao2.insert(dto);
		
//삭제	dao2.delete(new MemberDTO("m006", null, null, null)); 
		
//조회   MemberDTO odto = dao2.selectByMid("m005");
// >> mid가 m005인 레코드만 조회했는데, 밑에 수정에서 이 변수를 활용하여, 조회정보를 불러옴 (일부만 수정할 수 있도록)
//수정   MemberDTO dto = new MemberDTO("m005", "lee", odto.getJob(), odto.getBirth());
// ~		
//수정   dao2.update(dto);

/*		
전체조회	dao2.select(); 		
*/
	}

}
