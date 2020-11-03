package com.naver;

public class Training {
	
	public void me1() {
		// 배열의 크기가 10이고, 피보나치수열을 이용하여 값을 넣어주고 출력한다.
		// 단, 인덱스 또는 요소값이 홀수인 경우 출력하지 않는다.
		int[] pibo = new int[10];
		
		int a = 1;
		int b = 1;
		
		for (int i=0; i < pibo.length; i++) {
			int c = a + b;
			pibo[i] = c;
			a = b;
			b = c;
			if (i % 2 == 0 && pibo[i] % 2 == 0) {
				System.out.println(pibo[i]);
			}

		}
	}

}
