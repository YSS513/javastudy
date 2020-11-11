package com.naver;

public class Test2 {

	private String msg;

	public class MemberClass { // 멤버 내부클래스
		private int age;

		public void mc1() {
			System.out.println("mc1");
			msg = "이게되네?";
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}

	public void me1() {

	}
}
