package kr.co.ezen;

import java.sql.Date;
import java.util.Calendar;

import com.naver.MemberDAO;
import com.naver.MemberDTO;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		// �Ϲ������� daoŬ������ ���̺�� 1�� �����ȴٰ� ���� �˴ϴ�.
		// dao��? �ڹٿ� db�� �̾��ִ� �ٸ�
		// ���ذ��� >> �ڹ� : dao : prepareStatement
		
//		Test dao = new Test();
//		
//		dao.me1();
		
		MemberDAO dao2 = new MemberDAO();
//�Է�	MemberDTO dto = new MemberDTO("m006", "jin", "a", 
// ~		new Date(Calendar.getInstance().getTimeInMillis()));
//�Է�	dao2.insert(dto);
		
//����	dao2.delete(new MemberDTO("m006", null, null, null)); 
		
//��ȸ   MemberDTO odto = dao2.selectByMid("m005");
// >> mid�� m005�� ���ڵ常 ��ȸ�ߴµ�, �ؿ� �������� �� ������ Ȱ���Ͽ�, ��ȸ������ �ҷ��� (�Ϻθ� ������ �� �ֵ���)
//����   MemberDTO dto = new MemberDTO("m005", "lee", odto.getJob(), odto.getBirth());
// ~		
//����   dao2.update(dto);

/*		
��ü��ȸ	dao2.select(); 		
*/
	}

}
