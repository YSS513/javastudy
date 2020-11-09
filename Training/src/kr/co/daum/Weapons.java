package kr.co.daum;

public class Weapons {

	private String name;
	private int dmg;

	public Weapons() {

	}

	public Weapons(String name, int dmg) {
		super();
		this.name = name;
		this.dmg = dmg;
	}

	public void attack(Monster mon) {
		int bhp = mon.getHp();
		int ahp = bhp - dmg;
		mon.setHp(ahp);
		System.out.println("Monster¿« HP : " + ahp);
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
