package com.naver;

public class Hero {
	
	private Weapons[] weapons;
	
	private Weapons w;
	
	public Hero() {
		weapons = new Weapons[] {new Sword("검", 10), new Bow("활", 20), new Gun("총", 30)};
		
		w = weapons[0];
	}
	
	public void attack(Monster mon) {
		w.attack(mon);
	}

	public void chwp(int wIdx) {
		if (wIdx >= weapons.length | wIdx < 0) {
			wIdx = weapons.length-1;
		}
		w = weapons[wIdx];
		System.out.println(w+" 으로 변경되었습니다.");
		
	}
	
	public Hero(Weapons[] weapons, Weapons w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}
	
	
	
}
