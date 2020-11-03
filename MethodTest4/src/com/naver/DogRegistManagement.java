package com.naver;

import kr.co.ezen.Dog;

public class DogRegistManagement {
	private Dog dog;

	public DogRegistManagement() {

	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Dog makeDog(String name, int age) {
		return new Dog(name, age);
	}

}
