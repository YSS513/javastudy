package com.naver;

public class CarRegistManagement {
	
	private String carName;
	
	public CarRegistManagement() {
		carName = "�ҳ�Ÿ";
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public String getCarName() {
		return carName;
	}
	
	//===================================int => long ����ȯ �ڵ�
	public long add(int a, int b) {
		return (long)a +b;
	}
	
	
	//===================================length�� ������ ���̸� �˷��ִ� ��
	public int getCountCarName(String carName) {
		int size = carName.length();
		return size;
	}






}
