package com.naver;

public class CarRegistManagement {
	
	private String carName;
	
	public CarRegistManagement() {
		carName = "소나타";
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public String getCarName() {
		return carName;
	}
	
	//===================================int => long 형변환 코드
	public long add(int a, int b) {
		return (long)a +b;
	}
	
	
	//===================================length는 문자의 길이를 알려주는 애
	public int getCountCarName(String carName) {
		int size = carName.length();
		return size;
	}






}
