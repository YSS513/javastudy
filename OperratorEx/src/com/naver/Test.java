package com.naver;

public class Test {

	public void me1() {
		// �÷��� ����
		int a = 4;
		int b = 3;
		int c = a + b;
		System.out.println(c);
	}

	public void me2() {
		// ���̳ʽ� ����
		int a = 10;
		int b = 1;
		int c = a - b;
		System.out.println(c);
	}

	public void me3() {
		// ���ϱ� ����
		int a = 4;
		int b = 5;
		int c = a * b;
		System.out.println(c);
	}

	public void me4() {
		// ������(��) ���� (������ ǥ����)
		int a = 3;
		int b = 4;
		int c = a / b;
		System.out.println(c);
	}

	public void me5() {
		// ������ ����
		int a = 4;
		int b = 3;
		System.out.println(a % b);
	}

	public void me11() {
		// ���� + ���ڿ��� ��Ʈ���� �����ϴ�.
		String msg = "�ʴ� �� ���̳�?";
		System.out.println(msg);
		String answer = 10 + "���Դϴ�.";
		System.out.println(answer);
	}

	public void me41(int a, int b) {
		// �� ����
		System.out.println(a / b);
	}

	public void me51(int a, int b) {
		// ������ ����
		System.out.println(a % b);
	}

	public void me52(int a, int b) {
		System.out.println(a + "�� " + b + "�� ����Դϴ�.");
	}
}
