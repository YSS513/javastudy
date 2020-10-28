package com.naver;

import kr.co.ezen.Dog;

public class Person {
	private String id;
	private String name;
	private Dog happy;
	private Car K7;
	
	public Person(String id, String name, Dog happy, Car k7) {
		super();
		this.id = id;
		this.name = name;
		this.happy = happy;
		K7 = k7;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getHappy() {
		return happy;
	}

	public void setHappy(Dog happy) {
		this.happy = happy;
	}

	public Car getK7() {
		return K7;
	}

	public void setK7(Car k7) {
		K7 = k7;
	}
	
	public void sleep(String where) {
		String a = happy.getName();
		System.out.println(a+"를 "+where+"에서 재운다.");
	}
	
	public void run(int speed) {
		System.out.println(K7.run(speed));
	}
	
	public void printCarPrice() {
		System.out.println(K7.showMePrice());
	}
	
	
	

}
