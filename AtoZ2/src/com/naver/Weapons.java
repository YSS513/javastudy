package com.naver;

public class Weapons {
	
	private String name;
	private int dmg;
	
	
	public Weapons() {
		// TODO Auto-generated constructor stub
	}
	
	public void attack(Monster mon) {
		int bhp = mon.getHp() - dmg;
		mon.setHp(bhp);
		System.out.println("������ HP : "+bhp);
	}

	public Weapons(String name, int dmg) {
		super();
		this.name = name;
		this.dmg = dmg;
	}

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
