package kr.co.ezen;

import java.util.Date;

import com.naver.Car;
import com.naver.Person;
import com.naver.Team;

public class MainEx {
	public static void main(String[] args) {
		Car c1 = new Car("K7", "4478", 100000000);
		// c1.showMePrice();
		Car c2 = new Car("bmw520d", "1235", 200000000);
		Car c3 = new Car("sm5", "6584", 300000000);
		// 구분
		Car c4 = new Car("K5", "1025", 10000000);
		Car c5 = new Car("bmw320d", "0185", 20000000);
		Car c6 = new Car("sm3", "1853", 30000000);

		Dog d1 = new Dog(1, "happy", new Date(11));
		Dog d2 = new Dog(2, "merry", new Date());
		Dog d3 = new Dog(3, "백구", new Date());
		// 구분
		Dog d4 = new Dog(1, "happy아들", new Date(11));
		Dog d5 = new Dog(1, "merry아들", new Date());
		Dog d6 = new Dog(1, "백구아들", new Date());

		Person captain = new Person("p1", "A주장", d1, c1);
		Person member1 = new Person("p2", "김유신", d2, c2);
		Person member2 = new Person("p3", "이순신", d3, c3);

		// Team 클래스를 이용하여 aTeam객체 만들기
		// 생성자에 들어가는 파라미터는 위에 선언된 변수 이용하기

		Team aTeam = new Team(captain, member1, member2);

		// 자료형이 Team인 bTeam을 만드시오.

		Person captain2 = new Person("r1", "B주장", d4, c4);
		Person member3 = new Person("r2", "김유신아들", d5, c5);
		Person member4 = new Person("r3", "이순신아들", d6, c6);

		Team bTeam = new Team(captain2, member3, member4);

		aTeam.fight(bTeam);
		// A주장과 B주장이 싸웁니다. 출력
		bTeam.fightMem1(aTeam);
		// 김유신아들과 김유신이 싸웁니다. 출력
		aTeam.fightDog(bTeam);
		// 백구와 백구아들이 싸웁니다. 출력
		aTeam.fighCar(bTeam);
		// K7과 K5가 경주합니다. 출력
		aTeam.fightCarRacing(bTeam);
		// A주장의 K7과 B주장의 K5가 경주합니다. 출력
		System.out.println("===========================================");

		c1.run(240);
		System.out.println("modelName    carNo      price");
		System.out.println("  " + c1.getModelName() + "         " + c1.getCarNo() + "     " + c1.getPrice());

		System.out.println("===========================================");

		Dog test1 = new Dog(2, "아무개", new Date(11));
		String nameTest = test1.getName();
		System.out.println(nameTest);
		System.out.println(d5.getDid() + " " + d5.getName() + " " + d5.getBirth());

		System.out.println("===========================================");

		Person p1 = new Person("2020", "이름", new Dog(10, "사랑이", new Date()), new Car("K7", "40", 40));
		p1.sleep("개집");

		System.out.println("===========================================");

		Team t1 = new Team(p1, p1, p1);
		t1.showCaptainCarPrice();

		System.out.println("===========================================");

		t1.mem2PrintCarModedlName();
		t1.getCaptainCarModelNameFirstChar();

		System.out.println("===========================================");

	}

}
