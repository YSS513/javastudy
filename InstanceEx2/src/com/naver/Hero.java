package com.naver;

public class Hero {
	
	private Bow bow;
	private Sword sword;
	private Spear spear;
	
	public void attackBow(Monster mon) {
		bow.attack(mon);
	}
	public void attackSword(Monster mon) {
		sword.attack(mon);
	}
	public void attackSpear(Monster mon) {
		spear.attack(mon);
	}



	public Hero(Bow bow, Sword sword, Spear spear) {
		this.spear = spear;
		this.sword = sword;
		this.bow = bow;
	}

	public Bow getBow() {
		return bow;
	}

	public void setBow(Bow bow) {
		this.bow = bow;
	}

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

	public Spear getSpear() {
		return spear;
	}

	public void setSpear(Spear spear) {
		this.spear = spear;
	}
	
}
