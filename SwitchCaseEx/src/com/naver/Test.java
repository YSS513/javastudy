package com.naver;

public class Test {
	private int sum = 0;

	public void me1(int a) {

		switch (a) {
		case 3:
			System.out.println(3333);
			System.out.println(1111);
			break;

		case 4:
			System.out.println(4444);
			System.out.println("end");
			break;

		case 5:
			System.out.println(5555);
			System.out.println("oh");
			break;

		default:
			System.out.println("fine");
			break;
		}
	}

	public void me2(int a) {
		switch (a) {
		case 3:
			System.out.println(333);
			break;
		case 4:
			System.out.println(444);

		default:
			System.out.println(999);
			break;
		}

		System.out.println(">>>>>>>>");
	}

	public void me3(int a) {
		switch (a / 10) {
		case 1:
			System.out.println("10~19");
			break;
		case 2:
			System.out.println("20~29");
			break;
		default:
			System.out.println("end");
			break;
		}

		System.out.println("********");
	}

	public void me31(int a) {
		int data = a / 10;

		switch (data) {
		case 1:

			break;

		default:
			break;
		}
	}

//	public void me4(int a) {
//		switch (a) {
//		int a= 10;
//		case 1:
//			
//			break;
//
//		default:
//			break;
//		}
//	}

//	public void me5(long a) {
//		switch (a) {
//		case 10L:
//			
//			break;
//
//		default:
//			break;
//		}
//	}

	public void me6(int month) {

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31�ϱ��� �ֽ��ϴ�");
			break;
		case 2:
			System.out.println("28�ϱ��� �ֽ��ϴ�");
			break;

		default:
			System.out.println("30�ϱ��� �ֽ��ϴ�");
			break;
		}

		// �޷�
		// 1, 3, 5, 7, 8, 10, 12 :31
		// sysout("31�ϱ��� �ֽ��ϴ�")
		// 2 : 28
		// sysout("28�ϱ��� �ֽ��ϴ�")
		// �������� : 30��
		// sysout("30�ϱ��� �ֽ��ϴ�")
	}

	public void me7(int score) {
		// ����̾簡 ����ϱ�

		switch (score / 10) {
		case 10:
		case 9:
			System.out.println('��');
			break;
		case 8:
			System.out.println('��');
			break;
		case 7:
			System.out.println('��');
			break;
		case 6:
			System.out.println('��');

		default:
			System.out.println('��');
			break;
		}
	}

	public void me8(String a, String b) {
		String c = a;
		a = b;
		b = c;

		// a ������ b�� ���� �ְ�
		// b �������� a�� ���� �������� �մϴ�.
		// ġȯ �˰���.
	}

	public void me9(int a) {
		sum += a;
		// sum = sum + a;
	}

}
