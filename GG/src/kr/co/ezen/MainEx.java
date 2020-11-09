package kr.co.ezen;

import java.util.Scanner;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Monster mon = new Monster(100);

		Weapon[] weapons = { new Bow("활", 1),
							new Sword("검", 5),
							new Gun("총", 10) };

		Weapon w = weapons[2];

		Hero spyderman = new Hero(weapons, w);

		boolean isTrue = true;
		int meun = 0;
		int weaponIdx = 0;
		
		while (isTrue) {
			System.out.println("다음 중 하나를 선택하시오.");
			System.out.println("0: 공격, 1: 무기변경, 2: 종료");
			
			meun = sc.nextInt();
			if(meun == 2) {
				break;
			}
			
			if (meun == 0) {
				spyderman.attack(mon);
			}else if(meun == 1) {
				System.out.println("무기를 선택하세요.");
				
				for (int i = 0; i < weapons.length; i++) {
					System.out.print(i);
					System.out.print(": "+weapons[i]+", ");
				}
				System.out.println();
				
				weaponIdx = sc.nextInt();
				
				sc.nextLine();
				
				spyderman.changeWeapon(weaponIdx);
			}
		}
	}

}
