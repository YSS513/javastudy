package kr.co.ezen;

import com.naver.Person;
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
		tv1.volUp();
		System.out.println(tv1.getVol());
		tv1.volUp();
		System.out.println(tv1.getVol());
		tv1.volUp();
		System.out.println(tv1.getVol());
		tv1.volDown();
		System.out.println(tv1.getVol());
		
		System.out.println("=====================================");
		
		Person kim = new Person(tv1);
		// kim�� tv�� �Ҵ�.
		kim.tvOn();
		//tv�� ���ϴ�.
		kim.tvOff();
		
		// kim�� tv�� �մϴ�.
		kim.tvOn();
		
		// kim�� ä���� +1 ��Ű�ÿ�.
		kim.chUp();
		System.out.println(tv1.getCh());
		
		// kim�� ������ -1 ��Ű�ÿ�.
		kim.volDown();
		System.out.println(tv1.getCh());
		
		//kim�� ������ 50���� �����Ͻÿ�.
		kim.getTv1().setVol(50);
		System.out.println(tv1.getVol());
	}

}
