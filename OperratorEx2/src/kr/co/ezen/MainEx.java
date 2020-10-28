package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;

public class MainEx {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		Test2 t2 = new Test2();
		
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
		
	}

}
