package kr.co.daum;

public class Bow {
	private int dmg;

	public Bow() {
		dmg = 110;
	}

	public void attack(Monster mon, Friend name) {
		int u = mon.getAcc();
		int u2 = dmg - u;
		int hp = mon.getHp();
		if (dmg > u) {
			System.out.println(name + "가 " + "활로 " + mon + "를 공격하여 " + u2 + "의 데미지를 입혔다!");
		} else if (dmg <= u) {
			System.out.println("Miss");
		}
	}

}
