package com.naver;

public class Person {
	private TV tv1;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public void tvOn() {
		System.out.println("TV를 킵니다.");
		tv1.powerOn();
	}
	
	public void tvOff() {
		System.out.println("TV를 끕니다.");
		tv1.powerOff();
	}
	
	public void chUp() {
		System.out.println("채널을 +1합니다.");
		tv1.chUp();
	}
	
	public void volDown() {
		System.out.println("볼륨을 -1합니다.");
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
