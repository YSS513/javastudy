package kr.co.ezen;

import java.util.List;

import com.naver.MemberDTO;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.me2();
		System.out.println(">>>>>>>>>>>>>>>>>");
		List<MemberDTO> list = t1.me7();
		
		MemberDTO dto = list.get(1);
		String name = dto.getName();
		System.out.println(name);
		System.out.println("<<<<<<<<<<<<<<<<<<<<");
		t1.me8();

	}

}
