package com.naver;

public class Hero {

	Weapons[] weapons;

	Weapons w;

	public Hero() {
		weapons = new Weapons[] { new Sword("��", 10), new Bow("Ȱ", 20), new Gun("��", 30) };

		w = weapons[0];
	}

	public void attack(Monster mon) {
		w.attack(mon);
	}

	public void changeWeapons(int weaponIdx) {

		if (weaponIdx >= weapons.length || weaponIdx < 0) {
			weaponIdx = weapons.length - 1;
		}
		w = weapons[weaponIdx];
		System.out.println(w + " �� ����Ǿ����ϴ�.");
	}

	public Hero(Weapons[] weapons, Weapons w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}

}
