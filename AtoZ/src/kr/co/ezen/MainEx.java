package kr.co.ezen;

import java.util.Scanner;

import com.naver.Hero;
import com.naver.Monster;

public class MainEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Monster mon = new Monster(100);
		Hero hero = new Hero();
		
		boolean a = true;
		int menu = 0;
		int weaponIdx = 0;
		
		while (a) {
			System.out.println("�ൿ�ϱ�");
			System.out.println("| 0:���� | 1:���ⱳü | 2:���� |");
			menu = sc.nextInt();
			
			if (menu==0) {
				hero.attack(mon);
			}else if(menu==1) {
				System.out.println("���⸦ �����ϼ���.");
				System.out.println("| 0:�� | 1:Ȱ | 2:�� |");
				weaponIdx = sc.nextInt();
				
				sc.nextLine();
				
				hero.changeWeapons(weaponIdx);
				
			}else if(menu==2) {
				System.out.println("game over");
				break;
			}
		}
	}
	
}
