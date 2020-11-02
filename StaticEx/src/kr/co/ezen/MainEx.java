package kr.co.ezen;

import com.naver.Test;

public class MainEx {
	public static void main(String[] args) {
		
		Test t1 = new Test();
		Test t2 = new Test();
		
		t1.a++;
		Test.b++;
		
		System.out.println(t2.a);
		System.out.println(Test.b);
		
		Test.me1();
		
	}
}
