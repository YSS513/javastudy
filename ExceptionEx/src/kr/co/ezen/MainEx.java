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
		t1.me7("��");
		// t1.me7("������");
		// t1.me71("������");
		
		try {
			t1.me72("������");
		} catch (Exception e) {
			System.out.println("�弳 ����");
		}
	}

}
