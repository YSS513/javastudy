package ko.co.ezen;

import com.naver.Bow;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Spear;
import com.naver.Sword;

public class MainEx {
	public static void main(String[] args) {
		
		Monster mon = new Monster();
		
		Bow bow = new Bow();
		Sword sword = new Sword();
		Spear spear = new Spear();

		Hero hero = new Hero(bow, sword, spear);
		
		hero.attackBow(mon);
		hero.attackSword(mon);
		hero.attackSpear(mon);
	}
}
		
