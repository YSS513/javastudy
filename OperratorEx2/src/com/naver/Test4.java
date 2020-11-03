package com.naver;

public class Test4 {
	private int a;
	private int b;

	public Test4() {
		a = 4;
		b = 11;
		int c = a == b ? 44 : 33;
		System.out.println(c);
	}

	public void con1() {
		char c = a >= b ? 'a' : 'z';
	}

	public void con2() {
		String c = a != b ? new String("hello") : new String("no");
	}

	public void con3() {
		StringBuffer c = a <= b ? new StringBuffer("hello") : new StringBuffer("no");
	}

	public int me1() {
		return 3;
	}

	public void me2() {
		System.out.println(44);
	}

	public void con4() {
		int c = a > b * 2 ? me1() : a;
	}

	public void con5(int score) {
		char c = score >= 90 ? 'A' : score >= 80 ? 'B' : score >= 70 ? 'C' : score >= 60 ? 'D' : 'F';
		System.out.println(c);
	}
}
