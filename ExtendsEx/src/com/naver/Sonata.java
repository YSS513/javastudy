package com.naver;

public class Sonata extends Car {
	private String model = "Sonata";

	public Sonata() {
		run();
	}

	public Sonata(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}
	
	public void only() {
		System.out.println("�θ�Ŭ�������� ����, �ҳ�ŸŬ�������� �ִ� �޼���");
	}
	
	@Override
	public void run() {
		System.out.println("::::::::::::::::::");
		System.out.println("Sonata Ŭ������ run( )");
		System.out.println("::::::::::::::::::");

	}

	public void me1() {
		System.out.println(getModel());

	}

}
