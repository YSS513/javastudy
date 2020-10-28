package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;
import com.naver.Test5;

public class MainEx {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		Test2 t2 = new Test2();
		Test3 t3 = new Test3();
		Test4 t4 = new Test4();
		Test5 t5 = new Test5();
		
		System.out.println("==========================");
		
		t2.k1(true, true);
		t2.k1(true, false);
		t2.k1(false, true);
		t2.k1(false, false);
		
		System.out.println("==========================");
		
		t2.k2(true, true);
		t2.k2(true, false);
		t2.k2(false, true);
		t2.k2(false, false);
		
		System.out.println("==========================");
		
		t2.k3(true);
		
		boolean a = false;
		t2.k3(a);
		
		System.out.println("==========================");
		
		t2.swichInt();
		t2.swichInt();
		
		System.out.println("==========================");
		
		t2.swichBoolean();
		t2.swichBoolean();
		
		System.out.println("==========================");
		
		t3.plus1();
		t3.plus11();
		
		System.out.println("==========================");
		
		t3.plus2();
		t3.plus21();
		System.out.println(t3.getB());
		
		System.out.println("==========================");
		
		t3.minus1();
		
		System.out.println("==========================");
		
		t4.con5(90);
		
		System.out.println("==========================");
		
		t5.h1();
		t5.h2();
		t5.h3();
		t5.h4();
		
		System.out.println("==========================");
		
		t5.h5(1);
		t5.h5(2);
		t5.h5(3);
		
		System.out.println("==========================");
		
		t5.h6(0);
		t5.h6(1);
		t5.h6(2);
		
		System.out.println("==========================");
	}

}
