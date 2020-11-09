package com.naver;

public abstract class Weapon {
	
	private String name;
	private int dmg;

	public Weapon() {
	}

	
	public Weapon(int dmg) {
		super();
		this.dmg = dmg;
	}


	public Weapon(String name, int dmg) {
		super();
		this.name = name;
		this.dmg = dmg;
	}

	public void attack(Monster mon) {
		img();
		int bhp = mon.getHp();
		int ahp = bhp - dmg;
		mon.setHp(ahp);
		System.out.println("monster�� HP: "+ahp);
	}
	
	public abstract void img();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
