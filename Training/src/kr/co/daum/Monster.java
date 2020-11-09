package kr.co.daum;

public class Monster {

	public int hp;

	public Monster() {
		// TODO Auto-generated constructor stub
	}
	
	public Monster(int hp) {
		super();
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "몬스터의 hp: " + hp;
	}

}
