package kr.co.ezen;

import com.naver.Test1;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test5;
import com.naver.Test6;

public class MainEx {

	public static void main(String[] args) {
		// ����Ŭ���� ȣ����
		Test2.MemberClass mc1 = new Test2().new MemberClass();
		mc1.mc1();
		
		// ���� ����ƽŬ���� ȣ����
		Test3.StaticInnerClass sic1 = new Test3.StaticInnerClass();
		sic1.sic();
		
		Test1.a=10;
		
		Test5 t1 = new Test5();
		t1.ano.me1();
		
		Test6 t2 = new Test6();
		
	}

}
