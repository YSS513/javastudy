package com.naver;

public class Test {

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
