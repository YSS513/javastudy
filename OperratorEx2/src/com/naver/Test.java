package com.naver;

public class Test {
	
	public void me51(boolean a, boolean b) {
		boolean result = a == b;
		System.out.println(result);
	}
	
	public void me5(short a, short b) {
		System.out.println(a == b);
	}
	
	public boolean me4(byte a, byte b) {
		return a <= b;
	}
	
	public char me31(int a, int b) {
		boolean result = a > b;
		
		if(result) {
			return 'a';
		}else
			return 'z';
	}

}
