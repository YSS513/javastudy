package com.naver;

import kr.co.daum.Bow;
import kr.co.daum.Friend;
import kr.co.daum.Monster;

public class MainEx {
	public static void main(String[] args) {
		Friend name = new Friend();
		Monster mon = new Monster(100);
		Bow bow = new Bow();
		
		bow.attack(mon, name);
		
	}
		
}
