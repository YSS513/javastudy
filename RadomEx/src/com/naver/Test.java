package com.naver;

import java.util.Random;

public class Test {
	public void me6() {
		Random rnd1 = new Random(3);
		Random rnd2 = new Random(3);
		
		
		int num1 = rnd1.nextInt(100000);
		int num2 = rnd2.nextInt(100000);
		
		System.out.println(num1 == num2);
		
	}
	
	
	public void me5(int start, int end) {
		//start~end ������ �ִ� ���ڰ� ���Ƿ� �������� ���α׷����ϼ���.
		Random rnd = new Random();
		int num = rnd.nextInt(end-start+1) +  start;
		
		System.out.println(num);
		
	}
	
	public void me4() {
		//������ ���� ������ 3 ~ 10������ ���ڰ� �ǵ��� ���α׷����ϼ���.
		Random rnd = new Random();
		int num = rnd.nextInt(8) + 3;//0+3 ~ n-1+3
		                             //3 ~ 10
		                             //n-1+3 = 10
							      	// n = 10-3+1
		System.out.println(num);
	}
	
	
	public void me3() {
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(2);
			System.out.println(num);
		}
		
	}
	
	public void me2() {
		Random rnd = new Random(System.currentTimeMillis());
	}
	
	public void me1() {
		Random rnd = new Random();
	}

}
