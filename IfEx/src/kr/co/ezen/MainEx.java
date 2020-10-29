package kr.co.ezen;

import com.naver.TV;
import com.naver.Test;

public class MainEx {
	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		t1.me1();
		t1.me2(60);
		t1.me3(5);
		String msg = t1.me4(8);
		System.out.println(msg);
		
		t1.me6(6);
	
		char score = t1.me7(100);
		System.out.println(score);
		
		System.out.println("=====================================");
		
		TV tv1 = new TV(10, 15, false);
		
		tv1.powerOn();
		System.out.println(tv1.getVol());
		tv1.volUp();
		System.out.println(tv1.getVol());
		tv1.powerOff();
		tv1.volUp();
		System.out.println(tv1.getVol());
		tv1.volUp();
		System.out.println(tv1.getVol());
		tv1.volUp();
		System.out.println(tv1.getVol());
	}

}
