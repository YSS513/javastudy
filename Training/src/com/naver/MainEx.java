package com.naver;

import java.util.Scanner;

import kr.co.daum.Hero;
import kr.co.daum.Monster;
import kr.co.daum.Weapons;

public class MainEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Monster mon = new Monster(100);
		Hero hero = new Hero();
		Weapons[] weapons = new Weapons[0];
		
		boolean isTrue = true;
		int menu = 0;
		int weaponIdx = 0;
		
		while (isTrue) {
			System.out.println("행동하기");
			System.out.println("0: 공격, 1: 무기교체, 2: 종료");
			
			menu = sc.nextInt();
			if (menu == 0) {
				hero.attack(mon);
			}
			if (menu == 1) {
				System.out.println("무기를 선택하세요.");
				
				for (int i = 0; i < weapons.length; i++) {
					System.out.println(weapons[i]);
				}
				weaponIdx = sc.nextInt();
				
				sc.nextLine();
				
				hero.chageWeapons(weaponIdx);
			}else if(menu == 2) {
				break;
			}
		}
		

	}

}
