package kr.co.daum;

public class Friend {
	private Bow bow;
	
	
	public String toString() {
		return "Hero";
	}
	
	public void attackBow(Monster mon, Friend name) {
		bow.attack(mon, name);
	}

	public Bow getBow() {
		return bow;
	}

	public void setBow(Bow bow) {
		this.bow = bow;
	}

}
