package com.naver;

import kr.co.ezen.Test12;

public class MethodTest3 {

	public Test12 getTest12() {
		return new Test12();
	}

	public Test12 getTest13() {
		return new Test12();
	}

	public int getTest15(String name, int s) {
		System.out.println(name + " " + s);
		return 10;
	}

	public boolean getTest1() {
		return 3 > 4;
	}

	public char getTest2() {
		return '³É';
	}

	public byte getTest3() {
		return 1;
	}

	public short getTest4() {
		return 2;
	}

	public int getTest5() {
		return 3;
	}

	public long getTest6() {
		return 4;
	}

	public float getTest7() {
		return 1.1f;
	}

	public double getTest8() {
		return 1.2;
	}
}
