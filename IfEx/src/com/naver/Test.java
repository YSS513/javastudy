package com.naver;

public class Test {

	public void me1() {
		int a = 10;

		if (a % 5 == 0) {
			System.out.println(5);
			// a가 5의 배수이면, sysout(a) 실행하라
			// 해석 : a를 5로 나눴을 때, 나머지가 0이라면, sysout(a) 실행된다.
		}
	}

	public void me2(int a) {
		// a가 5의 배수이고 6의 배수이면 sysout(30)
		if (a % 5 == 0 && a % 6 == 0) {
			System.out.println(30);
		}
	}

	public void me3(int a) {
		// a가 4가 아니면 sysout(true);
		if (a != 4) {
			System.out.println(true);
		}
	}

	public String me4(int a) {
		// a가 10보다 작거나 같으면 리턴OK, 아니라면 리턴NO
		if (a <= 10) {
			return "ok";
		} else
			return "no";
	}

	public void me5(int x) {
		/*
		 * x가 0보다 작으면 sysout(3); 그렇지 않으면 sysout(-3);
		 */
		if (x < 0) {
			System.out.println(3);
		} else
			System.out.println(-3);
	}

	public void me6(int a) {
		// a가 2의 배수이면 sysout(2);
		// 그렇지 않고 3의 배수이면 sysout(3);
		// 그렇지 않고 5의 배수이면 sysout(5);
		// 해당 안되면 sysout(0);
		if (a % 2 == 0) {
			System.out.println(2);
		} else if (a % 3 == 0) {
			System.out.println(3);
		} else if (a % 5 == 0) {
			System.out.println(5);
		} else {
			System.out.println(0);
		}
	}

	public char me7(int score) {
		// score '수', '우', '미', '양' 순서로 90, 80, 70, 60, 이도저도 아니면 '가' 반환하여라.
		char result = '수';
		if (score >= 90) {

		} else if (score >= 80) {
			result = '우';
		} else if (score >= 70) {
			result = '미';
		} else if (score >= 60) {
			result = '양';
		} else
			result = '가';
		return result;
	}

}
