package com.naver;

public class Test {
	
	public void halfDiamond() {
		int n = 10;
		
		for (int i = 0; i < n; i++) {
			if(i < n/2) {
				me5(i+1);
			}else {
				me5(n-i-1);
			}
		}
	}
	
	public void me6() {
		// --일때는 >= 써라!!
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}
	
	public void nPrintStar(int n) {
		// 별 n개 줄 바꾸고 찍기
		for (int i = 0; i < n; i++) {
			me5(i+1);
		}
	}
	
	public void printStar() {
		// 5줄까지 별 찍기
		// 단, 해당 줄과 별의 개수는 같음.
		for (int i = 0; i < 5; i++) {
			me5(i+1);
		}
	}
	
	public void gugudan() {
		// for문에 이미 있는 dan메서드 이용하여 구구단 모두 출력
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			dan(i);
		}
	}
	
	public void me5(int n) {
//		별 n개 줄 바꾸지 않고 찍기
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public void me5() {
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public void sosu(int num) {
//		n이 소수면 sysout("소수입니다");
//		n이 소수가 아니면 sysout("소수가 아닙니다");
		for(int i = 2; i < num+1; i++) {
			if(num % i == 0) {
				// i가 n의 약수이지만 n은 아닌 상황
				// i == n
			if(i == num) {
				System.out.println("소수입니다.");
			}else {
				System.out.println("소수가 아닙니다.");
				break;
			}
		}
	}
	}
	
	public void dan(int dan) {
//		구구단 메서드
		for(int i=1; i<10; i++) {
			System.out.println(dan+"X"+i+"="+(dan*i));
		}
	}
	
	public void me4(int n) {
//		n개의 숫자를 찍어내는 me4() 메서드
		for(int i=0; i<n; i++) {
			int a = i*2+1;
			System.out.println(a);
		}
	}
	
	public void me4() {
//		1부터 2씩 더해지는 51개의 숫자를 찍어내는 메서드
		for(int i=0; i<51; i++) {
			int a = i*2+1;
			System.out.println(a);
		}
	}
	
	public void me3() {
//		 0부터 2씩 더해지는 51개의 숫자를 찍어내는 메서드
		for(int i=0; i<51; i++) {
			int a = i*2;
			System.out.println(a);
		}
	}
	
	public void me2() {
//		0 ~ 100 출력하기
		for(int i=0; i<101; i++) {
			System.out.println(i);
		}
	}
	
	
	public void me1() {
		for(int i=0; i<10; i++) {
			System.out.println("hello world");
		}
	}
	

}
