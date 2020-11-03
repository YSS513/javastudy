package kr.co.daum;

public class Monster {
	private int acc;
	private int hp;

	public Monster() {
		hp = 1000;
		acc = 100;
	}

	@Override
	public String toString() {
		return "Monster1";
	}

	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = acc;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Monster(int acc, int hp) {
		super();
		this.acc = acc;
		this.hp = hp;
	}

}
