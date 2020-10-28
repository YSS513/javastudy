package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;

public class MainEx {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test2 t2 = new Test2();
		
		System.out.println("=============");
		
		t1.me51(0, 3);
		t1.me51(1, 3);
		t1.me51(2, 3);
		
		System.out.println("=============");
		
		t1.me52(1, 4);
		System.out.println("=============");
		t2.s1();
		System.out.println("=============");
		t2.s12();
		System.out.println("=============");
		t2.s2();
		System.out.println("=============");
		t2.s3();
		System.out.println("=============");
		t2.s4();
	}

}
