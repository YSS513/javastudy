package com.naver;

public class Test {

	public void me1() {
		// 플러스 연산
		int a = 4;
		int b = 3;
		int c = a + b;
		System.out.println(c);
	}

	public void me2() {
		// 마이너스 연산
		int a = 10;
		int b = 1;
		int c = a - b;
		System.out.println(c);
	}

	public void me3() {
		// 곱하기 연산
		int a = 4;
		int b = 5;
		int c = a * b;
		System.out.println(c);
	}

	public void me4() {
		// 나누기(몫) 연산 (정수만 표현함)
		int a = 3;
		int b = 4;
		int c = a / b;
		System.out.println(c);
	}

	public void me5() {
		// 나머지 연산
		int a = 4;
		int b = 3;
		System.out.println(a % b);
	}

	public void me11() {
		// 숫자 + 문자열은 스트링만 가능하다.
		String msg = "너는 몇 살이냐?";
		System.out.println(msg);
		String answer = 10 + "살입니다.";
		System.out.println(answer);
	}

	public void me41(int a, int b) {
		// 몫 연산
		System.out.println(a / b);
	}

	public void me51(int a, int b) {
		// 나머지 연산
		System.out.println(a % b);
	}

	public void me52(int a, int b) {
		System.out.println(a + "는 " + b + "의 배수입니다.");
	}
}
