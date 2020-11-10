package com.naver;

public interface Inter1 {
	
	// 모두 같은 의미이다. 실무에서는 짧게 사용함
	// public final static이 보이지 않아도 존재함
	int A = 10;
	static int B = 20;
	final static int C = 30;
	public final static int AA_BB = 33;
	
	// 모두 같은 의미
	// public abstract가 보이지 않아도 존재함
	void me1();
	abstract void me2();
	public abstract void me3();
}
