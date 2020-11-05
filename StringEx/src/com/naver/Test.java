package com.naver;

import java.util.StringTokenizer;

public class Test {
	
	public void me14(int age) {
		// 문자열과 숫자를 + 연산을 사용하지 않고 표현하는 방법
		String msg = "홍길동은 " + age + "살입니다.";
		System.out.println(msg);
		
		String msg2 = "홍길동은 %d살입니다.";
		System.out.println(String.format(msg2, age));
		
		
		// 2020년  3월 20일
		// 2020년 11월  5일
		
		int month = 3;
		String msg3 = "오늘은 2020년%2d월20일입니다.";
		System.out.println(String.format(msg3, month));
		
		int date = 5;
		String msg4 = "오늘은 2020년11월%-2d일입니다.";
		System.out.println(String.format(msg4, date));
		
		int money = 1000;
		String msg5 = "내 전재산은 %d원입니다.";
		System.out.println(String.format(msg5, money));
		
		String msg6 = "내 전재산은 %,d원입니다.";
		System.out.println(String.format(msg6, money));
		
		String msg7 = "내 전재산은 %,15d 원입니다.";
		System.out.println(String.format(msg7, money));
		
		// 자릿수를 지정해주고, 이를 다 못 채웠을 때 앞의 공백을 0으로 채우기
		// 자릿수: 5, 숫자는 11이면 -> 00011
		String msg8 = "내 등번호는 %2d입니다.";
		System.out.println(String.format(msg8, 7));
		
		String msg9 = "내 등번호는 %02d입니다.";
		System.out.println(String.format(msg9, 7));
		
		String msg10 = "%d + %d = %d입니다.";
		System.out.println(String.format(msg10, 3, 4, 7));
		
		String msg11 = "%3.2f%%입니다.";
		System.out.println(String.format(msg11, 51.6));
	}	
	
	public void me13() {
		// 특정 기준 문자(delim)를 이용하여 서로 다른 의미를 가진 문자열(=token, 토큰)을 분할하기
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
		// + 연산자는 문자열에도 적용된다.
		// - 연산자는 문자열에 지속되지 않는다.
		// "hello world"에서
		// "hello"를 잘라내고 "world"만 남아있게 하고싶다면?
		
		String msg1 = "hello world";
		
		int idx = msg1.indexOf("w");
		String subMsg = msg1.substring(idx);
		System.out.println(subMsg);
		System.out.println(msg1);
		
		// lo wer 만 출력하고 싶다면?
		
		idx = msg1.indexOf('l');
		idx = msg1.indexOf('l', idx+1);
		
		int idx2 = msg1.indexOf('r');
		
		subMsg = msg1.substring(idx, idx2+1);
		System.out.println(subMsg);
	}
	
	public void me11() {
		// 좌우 공백을 제거할고 싶을 때? trim()
		String msg = "          he       llo          ";
		// he     llo?
		System.out.println(msg);
		System.out.println(msg.trim());
		msg = msg.trim();
		System.out.println(msg);
		
	}
	
	public void me10() {
		// 문자열끼리 데이터 내용이 같은지 여부를 확인하고 싶을 때? equals()
		// 대소문자 무시하고 같은지 여부 확인? equalsIgnoreCase()
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
		// 문자열이 특정 문자열로 시작하는지 알고 싶을 때? startWith()
		String msg = "hello";
		
		boolean result = msg.startsWith("h");
		System.out.println(result);
	}
	
	public void me8() {
		// 문자열이 특정 문자열로 끝났는지 여부를 알고 싶을 때? endsWith( )
		String msg1 = "abcd.jpg";
		String msg2 = "efgh.txt";
		
		boolean result1 = msg1.endsWith("jpg");
		System.out.println(result1);
		
		boolean result2 = msg2.endsWith(".txt");
		System.out.println(result2);
	}
	
	public void me7(String msg) {

		// msg에 "el"이 들어 있나?
		// msg에 "ow"가 들어 있나?
		// contains( ) or indexOf()

		boolean result = msg.contains("z");

		// 특정 문자 또는 문자열의 시작 문자의 인덱스를 반환 메서드 indexOf()

		// 단, 해당 문자 또는 문자열이 없으면 -1 반환....

		int idx = msg.indexOf('z');
		System.out.println(result);
		System.out.println(idx);
		
		System.out.println(msg.indexOf('l'));
		// 문자열에서 검색된 동일 문자 중 가장 마지막 문자의 인덱스는 lastIndexOf();
		idx = msg.lastIndexOf('l');
		System.out.println(idx);

		// 문자열에서 검색된 동일 문자 중 중간에 있는 문자의 인덱스는 어떻게 구할까?
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

		// 문자열의 특정 인덱스에 있는 문자를 알고 싶을 때, charAt()
		// msg의 가장 큰 인덱스에 해당하는 문자를 출력하시오.

		System.out.println(msg.charAt(msg.length() - 1));

		// msg 문자열의 각 문자를 한 글자씩 모두 출력하시오.
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

		// 1. 배열의 크기를 알고 싶을 때 호출되는 속성? length
		// 2. 문자열의 크기를 알고 싶을 때 사용하는 메서드? length( )

		System.out.println(str.length());

		// 3. ArrayList<String> list = new ArrayList<String>();
		// list.size();

	}

	public void me4() {
		StringBuffer sb = new StringBuffer();
		// String클래스는 불변적 성격...
		String msg = "hello";
		msg = "good";

		// 문자열이 계속해서 누적 되는 경우
		// String클래스를 사용하면
		// 성능 저하가 발생한다.
		// StringBuffer를 사용하세요.

//		msg = " ";
//		msg += "안녕하세요";
//		msg += "저는 홍길동입니다.";
//		msg += "저는 조선 세종대왕 시대에 살고 있습니다.";

		sb.append("안녕하세요");
		sb.append("저는 홍길동입니다");
		sb.append("저는 조선 세종대왕 시대에 살고 있습니다.");
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

		// String 클래스의 객체 생성 두 가지 방법
		// 1. 명시적 객체 생성법
		// 2. 암시적 객체 생성법
		// ㅁ 두 방법은 메모리 측면에서 다르다.
		// ㅁ 데이터가 같을 경우, 같은 객체로 인식하게 하는 방법 equals( )
		// ㅁ 참조자료형에서는 ==을 사용하지 않고, equals( )를 사용한다.
		// 동일성비교 Vs 동등성 비교
		// == Vs equals( )

	}

	public void me2() {
		// 암시적 객체 생성법
		String msg2 = "hello";
	}

	public void me1() {
		// 명시적 객체 생성법
		String msg = new String("hello");
	}

}
