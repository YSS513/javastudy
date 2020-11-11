package kr.co.ezen;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.me1();
		t1.me2();
		t1.me3();
		t1.me4(100);
		t1.me6(0);
		t1.me61();
		t1.me7("°ª");
		// t1.me7("°³»õ³¢");
		// t1.me71("°³»õ³¢");
		
		try {
			t1.me72("°³»õ³¢");
		} catch (Exception e) {
			System.out.println("¿å¼³ ±ÝÁö");
		}
	}

}
