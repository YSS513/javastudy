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
			System.out.println(name + "�� " + "Ȱ�� " + mon + "�� �����Ͽ� " + u2 + "�� �������� ������!");
		} else if (dmg <= u) {
			System.out.println("Miss");
		}
	}

}
