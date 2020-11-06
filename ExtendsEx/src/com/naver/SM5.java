package com.naver;

public class SM5 extends Car {

	public SM5() {
		super();
		run();
	}

	public SM5(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("SM5ÀÇ run()");
	}

	public void me1() {
		System.out.println(getModel());
	}

}