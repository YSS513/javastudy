package com.naver;

import java.util.StringTokenizer;

public class Test {
	
	public void me14(int age) {
		// ���ڿ��� ���ڸ� + ������ ������� �ʰ� ǥ���ϴ� ���
		String msg = "ȫ�浿�� " + age + "���Դϴ�.";
		System.out.println(msg);
		
		String msg2 = "ȫ�浿�� %d���Դϴ�.";
		System.out.println(String.format(msg2, age));
		
		
		// 2020��  3�� 20��
		// 2020�� 11��  5��
		
		int month = 3;
		String msg3 = "������ 2020��%2d��20���Դϴ�.";
		System.out.println(String.format(msg3, month));
		
		int date = 5;
		String msg4 = "������ 2020��11��%-2d���Դϴ�.";
		System.out.println(String.format(msg4, date));
		
		int money = 1000;
		String msg5 = "�� ������� %d���Դϴ�.";
		System.out.println(String.format(msg5, money));
		
		String msg6 = "�� ������� %,d���Դϴ�.";
		System.out.println(String.format(msg6, money));
		
		String msg7 = "�� ������� %,15d ���Դϴ�.";
		System.out.println(String.format(msg7, money));
		
		// �ڸ����� �������ְ�, �̸� �� �� ä���� �� ���� ������ 0���� ä���
		// �ڸ���: 5, ���ڴ� 11�̸� -> 00011
		String msg8 = "�� ���ȣ�� %2d�Դϴ�.";
		System.out.println(String.format(msg8, 7));
		
		String msg9 = "�� ���ȣ�� %02d�Դϴ�.";
		System.out.println(String.format(msg9, 7));
		
		String msg10 = "%d + %d = %d�Դϴ�.";
		System.out.println(String.format(msg10, 3, 4, 7));
		
		String msg11 = "%3.2f%%�Դϴ�.";
		System.out.println(String.format(msg11, 51.6));
	}	
	
	public void me13() {
		// Ư�� ���� ����(delim)�� �̿��Ͽ� ���� �ٸ� �ǹ̸� ���� ���ڿ�(=token, ��ū)�� �����ϱ�
		String msg = "teacheryo#1234##vip#1000#g#";
		String[] arr = msg.split("#");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(":::::::::::::::");
		
		StringTokenizer st = new StringTokenizer(msg, "#");
		String[] tArr = new String[st.countTokens()];
		
		int i = 0;
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			
			tArr[i] = token;
			i++;
		}
		
		System.out.println(tArr[0]);
		
	}
	
	public void me12() {
		// + �����ڴ� ���ڿ����� ����ȴ�.
		// - �����ڴ� ���ڿ��� ���ӵ��� �ʴ´�.
		// "hello world"����
		// "hello"�� �߶󳻰� "world"�� �����ְ� �ϰ�ʹٸ�?
		
		String msg1 = "hello world";
		
		int idx = msg1.indexOf("w");
		String subMsg = msg1.substring(idx);
		System.out.println(subMsg);
		System.out.println(msg1);
		
		// lo wer �� ����ϰ� �ʹٸ�?
		
		idx = msg1.indexOf('l');
		idx = msg1.indexOf('l', idx+1);
		
		int idx2 = msg1.indexOf('r');
		
		subMsg = msg1.substring(idx, idx2+1);
		System.out.println(subMsg);
	}
	
	public void me11() {
		// �¿� ������ �����Ұ� ���� ��? trim()
		String msg = "          he       llo          ";
		// he     llo?
		System.out.println(msg);
		System.out.println(msg.trim());
		msg = msg.trim();
		System.out.println(msg);
		
	}
	
	public void me10() {
		// ���ڿ����� ������ ������ ������ ���θ� Ȯ���ϰ� ���� ��? equals()
		// ��ҹ��� �����ϰ� ������ ���� Ȯ��? equalsIgnoreCase()
		String msg1 = "hello";
		String msg2 = new String("hello");
		String msg3 = "Hello";
		
		boolean result1 = msg1.equals(msg2);
		boolean result2 = msg1.equals(msg3);
		System.out.println(result1);
		System.out.println(result2);
		
		boolean result3 = msg1.equalsIgnoreCase(msg3);
		System.out.println(result3);
		
	}
	
	public void me9() {
		// ���ڿ��� Ư�� ���ڿ��� �����ϴ��� �˰� ���� ��? startWith()
		String msg = "hello";
		
		boolean result = msg.startsWith("h");
		System.out.println(result);
	}
	
	public void me8() {
		// ���ڿ��� Ư�� ���ڿ��� �������� ���θ� �˰� ���� ��? endsWith( )
		String msg1 = "abcd.jpg";
		String msg2 = "efgh.txt";
		
		boolean result1 = msg1.endsWith("jpg");
		System.out.println(result1);
		
		boolean result2 = msg2.endsWith(".txt");
		System.out.println(result2);
	}
	
	public void me7(String msg) {

		// msg�� "el"�� ��� �ֳ�?
		// msg�� "ow"�� ��� �ֳ�?
		// contains( ) or indexOf()

		boolean result = msg.contains("z");

		// Ư�� ���� �Ǵ� ���ڿ��� ���� ������ �ε����� ��ȯ �޼��� indexOf()

		// ��, �ش� ���� �Ǵ� ���ڿ��� ������ -1 ��ȯ....

		int idx = msg.indexOf('z');
		System.out.println(result);
		System.out.println(idx);
		
		System.out.println(msg.indexOf('l'));
		// ���ڿ����� �˻��� ���� ���� �� ���� ������ ������ �ε����� lastIndexOf();
		idx = msg.lastIndexOf('l');
		System.out.println(idx);

		// ���ڿ����� �˻��� ���� ���� �� �߰��� �ִ� ������ �ε����� ��� ���ұ�?
		// hello world
		idx = msg.indexOf('1');
		System.out.println(idx); //2
		
		idx = msg.indexOf('1', idx+1);
		System.out.println(idx); //3
		
		idx = msg.indexOf('1', idx+1);
		System.out.println(idx); //4

	}

	public void me6() {

		String msg = "hello";

		// ���ڿ��� Ư�� �ε����� �ִ� ���ڸ� �˰� ���� ��, charAt()
		// msg�� ���� ū �ε����� �ش��ϴ� ���ڸ� ����Ͻÿ�.

		System.out.println(msg.charAt(msg.length() - 1));

		// msg ���ڿ��� �� ���ڸ� �� ���ھ� ��� ����Ͻÿ�.
		// h
		// e
		// l
		// l
		// o

		for (int i = 0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i));
		}
	}

	public void me5() {

		String str = "hello";

		// 1. �迭�� ũ�⸦ �˰� ���� �� ȣ��Ǵ� �Ӽ�? length
		// 2. ���ڿ��� ũ�⸦ �˰� ���� �� ����ϴ� �޼���? length( )

		System.out.println(str.length());

		// 3. ArrayList<String> list = new ArrayList<String>();
		// list.size();

	}

	public void me4() {
		StringBuffer sb = new StringBuffer();
		// StringŬ������ �Һ��� ����...
		String msg = "hello";
		msg = "good";

		// ���ڿ��� ����ؼ� ���� �Ǵ� ���
		// StringŬ������ ����ϸ�
		// ���� ���ϰ� �߻��Ѵ�.
		// StringBuffer�� ����ϼ���.

//		msg = " ";
//		msg += "�ȳ��ϼ���";
//		msg += "���� ȫ�浿�Դϴ�.";
//		msg += "���� ���� ������� �ô뿡 ��� �ֽ��ϴ�.";

		sb.append("�ȳ��ϼ���");
		sb.append("���� ȫ�浿�Դϴ�");
		sb.append("���� ���� ������� �ô뿡 ��� �ֽ��ϴ�.");
		msg = sb.toString();
	}

	public void me3() {
		String msg1 = new String("a");
		String msg2 = new String("a");
		String msg3 = "a";
		String msg4 = "a";

		System.out.println(msg1 == msg2);
		System.out.println(msg1 == msg3);
		System.out.println(msg3 == msg4);

		System.out.println("===================");

		System.out.println(msg1.equals(msg2));
		System.out.println(msg1.equals(msg3));

		// String Ŭ������ ��ü ���� �� ���� ���
		// 1. ����� ��ü ������
		// 2. �Ͻ��� ��ü ������
		// �� �� ����� �޸� ���鿡�� �ٸ���.
		// �� �����Ͱ� ���� ���, ���� ��ü�� �ν��ϰ� �ϴ� ��� equals( )
		// �� �����ڷ��������� ==�� ������� �ʰ�, equals( )�� ����Ѵ�.
		// ���ϼ��� Vs ��� ��
		// == Vs equals( )

	}

	public void me2() {
		// �Ͻ��� ��ü ������
		String msg2 = "hello";
	}

	public void me1() {
		// ����� ��ü ������
		String msg = new String("hello");
	}

}
