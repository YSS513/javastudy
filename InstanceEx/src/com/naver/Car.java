package com.naver;

public class Car {
	private String modelName;
	private String carNo;
	private int price;

	public Car() {

	}

	public Car(String modelName, String carNo, int price) {
		super();
		this.modelName = modelName;
		this.carNo = carNo;
		this.price = price;
	}

	public String showMePrice() {
		System.out.println(price);
		return new String();
	}

	public String run(int speed) {
		System.out.println("**" + modelName + "은 최대 " + "시속 " + speed + "km 의 속도까지 주행합니다.");
		return new String();
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
