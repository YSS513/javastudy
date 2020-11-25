package kr.co.ezen;

import java.sql.Date;
import java.util.Calendar;

import com.naver.MemberDAO;
import com.naver.MemberDTO;

public class MainEx {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
//		MemberDTO dto = new MemberDTO("t001", "test", "t", 
//				new Date(Calendar.getInstance().getTimeInMillis()));
//		dao.insert(dto);

//		dao.select();

//		MemberDTO dto = dao.selectByMid("t001");
//		
//		dao.update(new MemberDTO("t001", "test2", dto.getJob(), dto.getBirth()));
		
//		dao.delete(new MemberDTO("t001", null, null, null));

	}

}
