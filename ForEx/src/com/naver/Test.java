package com.naver;

public class Test {
	
	public void halfDiamond() {
		int n = 10;
		
		for (int i = 0; i < n; i++) {
			if(i < n/2) {
				me5(i+1);
			}else {
				me5(n-i-1);
			}
		}
	}
	
	public void me6() {
		// --�϶��� >= ���!!
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}
	
	public void nPrintStar(int n) {
		// �� n�� �� �ٲٰ� ���
		for (int i = 0; i < n; i++) {
			me5(i+1);
		}
	}
	
	public void printStar() {
		// 5�ٱ��� �� ���
		// ��, �ش� �ٰ� ���� ������ ����.
		for (int i = 0; i < 5; i++) {
			me5(i+1);
		}
	}
	
	public void gugudan() {
		// for���� �̹� �ִ� dan�޼��� �̿��Ͽ� ������ ��� ���
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "��");
			dan(i);
		}
	}
	
	public void me5(int n) {
//		�� n�� �� �ٲ��� �ʰ� ���
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public void me5() {
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public void sosu(int num) {
//		n�� �Ҽ��� sysout("�Ҽ��Դϴ�");
//		n�� �Ҽ��� �ƴϸ� sysout("�Ҽ��� �ƴմϴ�");
		for(int i = 2; i < num+1; i++) {
			if(num % i == 0) {
				// i�� n�� ��������� n�� �ƴ� ��Ȳ
				// i == n
			if(i == num) {
				System.out.println("�Ҽ��Դϴ�.");
			}else {
				System.out.println("�Ҽ��� �ƴմϴ�.");
				break;
			}
		}
	}
	}
	
	public void dan(int dan) {
//		������ �޼���
		for(int i=1; i<10; i++) {
			System.out.println(dan+"X"+i+"="+(dan*i));
		}
	}
	
	public void me4(int n) {
//		n���� ���ڸ� ���� me4() �޼���
		for(int i=0; i<n; i++) {
			int a = i*2+1;
			System.out.println(a);
		}
	}
	
	public void me4() {
//		1���� 2�� �������� 51���� ���ڸ� ���� �޼���
		for(int i=0; i<51; i++) {
			int a = i*2+1;
			System.out.println(a);
		}
	}
	
	public void me3() {
//		 0���� 2�� �������� 51���� ���ڸ� ���� �޼���
		for(int i=0; i<51; i++) {
			int a = i*2;
			System.out.println(a);
		}
	}
	
	public void me2() {
//		0 ~ 100 ����ϱ�
		for(int i=0; i<101; i++) {
			System.out.println(i);
		}
	}
	
	
	public void me1() {
		for(int i=0; i<10; i++) {
			System.out.println("hello world");
		}
	}
	

}
