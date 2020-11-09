package kr.co.daum;

public class Hero {

	Weapons[] weapons;

	Weapons w;

	public Hero() {
		weapons = new Weapons[] { new Sword("검", 10), new Spear("창", 20), new Axe("도끼", 40) };

		w = weapons[0];
	}

	public Hero(Weapons[] weapons, Weapons w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}

	public void attack(Monster mon) {
		w.attack(mon);
	}

	public void chageWeapons(int weaponIdx) {

		if (weaponIdx >= weapons.length || weaponIdx < 0) {
			weaponIdx = weapons.length - 1;
		}

		w = weapons[weaponIdx];
		System.out.println(w + " 으로 변경되었습니다.");
	}
}
