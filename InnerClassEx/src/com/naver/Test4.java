package com.naver;

public class Test4 {

	public void me1() {
		int a = 10;
		
		class LocalInnerClass {
			public void Lic() {
				System.out.println(a);
			}
		}
		
		LocalInnerClass lic1 = new LocalInnerClass();
		lic1.Lic();
	}
	
}
