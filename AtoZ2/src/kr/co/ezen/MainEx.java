package kr.co.ezen;

import java.util.Scanner;

import com.naver.Hero;
import com.naver.Monster;

public class MainEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Monster mon = new Monster(100);
		Hero hero  = new Hero();
		
		boolean a = true;
		int menu = 0;
		int wIdx = 0;
		
		while (a) {
			System.out.println("행동하기");
			System.out.println("0:공격, 1:무기교체, 2:종료");
			menu = sc.nextInt();
			
			if (menu==0) {
				hero.attack(mon);
			} 
			if (menu==2) {
				System.out.println("game over");
				break;
			}
			if (menu==1) {
				System.out.println("교체할 무기는?");
				System.out.println("0:검, 1:활, 2:총");
				wIdx = sc.nextInt();
				sc.nextLine();
				hero.chwp(wIdx);
			}
		}
	}
}
