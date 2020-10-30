package com.naver;

public class Training {
	
	public void sosu(int n) {
		for (int i = 2; i < n+1; i++) {
			if (n % i ==0) {
			if (i == n) {
				System.out.println("소수입니다.");
			}else {
				System.out.println("소수가 아닙니다.");
				break;
			}
		}
	}
	}
	
	public void gugudan() {
		for (int i = 2; i < 9; i++) {
			System.out.println(i+"단");
			dan(i);
		}
	}
	
	public void dan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan+"X"+i+"="+(dan*i));
		}
	}
	
	public void me6() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}
	
	public void me4(int n) {
		for (int i = 0; i < n; i++) {
			int a = i*2+1;
			System.out.println(a);
		}
	}
	
	public void me4() {
		for (int i = 0; i < 51; i++) {
			int a = i*2+1;
			System.out.println(a);
		}
	}
	
	public void me3() {
		for (int i = 0; i < 51; i++) {
			int a = i*2;
			System.out.println(a);
		}
	}
	
	public void me2() {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
	}
	
	public void me1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello world");
		}
	}
	
	
}
	
