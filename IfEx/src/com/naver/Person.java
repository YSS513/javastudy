package com.naver;

public class Person {
	private TV tv1;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public void tvOn() {
		System.out.println("TV�� ŵ�ϴ�.");
		tv1.powerOn();
	}
	
	public void tvOff() {
		System.out.println("TV�� ���ϴ�.");
		tv1.powerOff();
	}
	
	public void chUp() {
		System.out.println("ä���� +1�մϴ�.");
		tv1.chUp();
	}
	
	public void volDown() {
		System.out.println("������ -1�մϴ�.");
		tv1.volDown();
	}

	
	
	
	
	
	public Person(TV tv1) {
		this.tv1 = tv1;
	}

	public TV getTv1() {
		return tv1;
	}

	public void setTv1(TV tv1) {
		this.tv1 = tv1;
	}
	
	
	
	
	

}
