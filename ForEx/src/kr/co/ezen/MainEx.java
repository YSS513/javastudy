package kr.co.ezen;

import com.naver.Test;
import com.naver.Training;

public class MainEx {

	public static void main(String[] args) {
		Test t1 = new Test();
		Training t2 = new Training();
		
		t1.sosu(3);
		t1.me5();
		t1.me5(1);
		
		System.out.println("=========================");
		
		t1.gugudan();
		
		System.out.println("=========================");
		
		t1.nPrintStar(6);
		
		System.out.println("=========================");
		
		t1.halfDiamond();
		
		System.out.println("=========================");

		
	}

}
