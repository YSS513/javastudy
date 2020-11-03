package com.naver;

import kr.co.ezen.Dog;

public class Team {

	private Person captain;
	private Person member1;
	private Person member2;

	private Person captain2;
	private Person member3;
	private Person member4;

	public Team(Person captain, Person member1, Person member2, Person captain2, Person member3, Person member4) {
		super();
		this.captain = captain;
		this.member1 = member1;
		this.member2 = member2;
		this.captain2 = captain2;
		this.member3 = member3;
		this.member4 = member4;
	}

	public Person getCaptain2() {
		return captain2;
	}

	public void setCaptain2(Person captain2) {
		this.captain2 = captain2;
	}

	public Person getMember3() {
		return member3;
	}

	public void setMember3(Person member3) {
		this.member3 = member3;
	}

	public Person getMember4() {
		return member4;
	}

	public void setMember4(Person member4) {
		this.member4 = member4;
	}

	public Team(Person captain, Person member1, Person member2) {
		super();
		this.captain = captain;
		this.member1 = member1;
		this.member2 = member2;
	}

	public Person getCaptain() {
		return captain;
	}

	public void setCaptain(Person captain) {
		this.captain = captain;
	}

	public Person getMember1() {
		return member1;
	}

	public void setMember1(Person member1) {
		this.member1 = member1;
	}

	public Person getMember2() {
		return member2;
	}

	public void setMember2(Person member2) {
		this.member2 = member2;
	}

	public void showCaptainCarPrice() {
		Car C1 = captain.getK7();
		C1.showMePrice();
	}

	public void mem1Sleep(String where) {
		System.out.println(member1.getHappy().sleep("방"));
	}

	public void mem2PrintCarModedlName() {
		String a = member2.getK7().getModelName();
		System.out.println(a);
	}

	public char getCaptainCarModelNameFirstChar() {
		Car car = captain.getK7();
		String modelName = car.getModelName();

		char c = modelName.charAt(0);
		return c;
	}

	public void changeMem1Dog(Dog dog) {
		member1.setHappy(dog);
	}

	public void changeMem1DogName(String name) {
		member1.getHappy().setName(name);
	}

	public void fight(Team otherTeam) {
		String aName = this.captain.getName();
		String bName = otherTeam.captain.getName();
		System.out.println(aName + "과 " + bName + "이 싸웁니다.");
	}

	public void fightMem1(Team otherTeam) {
		String member1Name = this.member1.getName();
		String member2Name = otherTeam.member1.getName();
		System.out.println(member1Name + "과 " + member2Name + "이 싸웁니다.");

	}

	public void fightDog(Team otherTeam) {
		String dog1Name = this.member2.getHappy().getName();
		String dog2Name = otherTeam.member2.getHappy().getName();
		System.out.println(dog1Name + "와 " + dog2Name + "이 싸웁니다.");

	}

	public void fighCar(Team otherTeam) {
		String car1Name = this.captain.getK7().getModelName();
		String car2Name = otherTeam.captain.getK7().getModelName();
		System.out.println(car1Name + "과 " + car2Name + "가 경주합니다.");
	}

	public void fightCarRacing(Team otherTeam) {
		String a = this.captain.getName();
		String b = otherTeam.captain.getName();
		String c1 = this.captain.getK7().getModelName();
		String c2 = otherTeam.captain.getK7().getModelName();
		System.out.println(a + "의 " + c1 + "과 " + b + "의 " + c2 + "가 경주합니다.");

	}

}
