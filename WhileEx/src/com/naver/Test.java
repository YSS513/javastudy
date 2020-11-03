package com.naver;

public class Test {

	public void me5() {
		int i = 0;
		while (i < 10) {

			if (i != 0 && i % 5 == 0) {
				i++;
				continue;
			}
			System.out.println(i);

			i++;
		}
	}

	public void me4() {
		int i = 0;
		while (i < 10) {

			if (i != 0 && i % 5 == 0) {
				break;
			}

			System.out.println(i);

			i++;
		}

		System.out.println("me4() 종료");
	}

	public void testing2(int n) {
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("출력값 : " + i);
		}
		System.out.println("마무리");
	}

	public void testing(int n) {
		int i = 0;

		while (i < n) {
			i++;
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("출력값 : " + i);

			i++;
		}
		System.out.println("마무리");
	}

	public void printPibo(int month) {
//		피보나치 수열
		int a = 1;
		int b = 1;

		for (int i = 0; i < month; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

	public void printStar(int n) {
		int i = 0;

		while (i < n) {
			me31(i + 1);
			i++;
		}
	}

	public void gugudan() {
		int i = 2;

		while (i < 10) {
			System.out.println(i + "단");
			dan(i);
			i++;
		}
	}

	public void me31(int n) {
//		별 가로로 n개찍기
		int i = 0;

		while (i < n) {
			System.out.print('*');
			i++;
		}
		System.out.println();
	}

	public void me3() {
//		 별 가로로 10개찍기
		int i = 0;

		while (i < 10) {
			System.out.print('*');
			i++;
		}
		System.out.println();
	}

	public void dan(int dan) {
//		 특정 단 찍기 (식과 정답이 출력)
		int i = 1;

		while (i < 10) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
//			 하단과 같은 방법도 가능
			/*
			 * StringBuffer sb = new StringBuffer(); sb.append(dan); sb.append(" X ");
			 * sb.append(i); sb.append(" = "); sb.append(dan*i); String msg = sb.toString();
			 * System.out.println(msg);
			 */
			i++;
		}
	}

	public void me21() {
//		 99, 97, 95, 93 ... 21 출력
		int i = 99;

		while (i >= 21) {
			System.out.println(i);
			i = i - 2;
		}
	}

	public void me2() {
//		 0, 2, 4, 6 ... 46 출력
		int i = 0;

		while (i < 47) {
			System.out.println(i);
			i = i + 2;
		}
	}

	public void me11() {
//		 100~0까지 출력하기
		int i = 100;

		while (i >= 0) {
			System.out.println(i);
			i--;
		}
	}

	public void me1() {
		int i = 0;

		while (i < 101) {
			System.out.println(i);
			i++;
		}
	}
}
