package com.naver;

public class Test {
	
	
	public void me6(boolean a, boolean b) {
		boolean result = a != b;
		System.out.println(result);
	}
	
	
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
			// if 만약에 result가 참이라면 'a' 반환해라.
			return 'a';
		}else
			// else(아니면) result가 참이 아니면 'z' 반환해라.
			return 'z';
	}

}
