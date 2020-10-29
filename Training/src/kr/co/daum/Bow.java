package kr.co.daum;

public class Bow {
	private int atk;
	
	public Bow() {
		atk = 50;
	}

	public void attack(Monster mon, Friend name) {
		if(atk>=mon.getAcc()) {
		System.out.println(name+"가 "+"활로 "+mon+"를 공격합니다.");
		}
	}
	
}
