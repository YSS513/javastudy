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
		// ����
		Car c4 = new Car("K5", "1025", 10000000);
		Car c5 = new Car("bmw320d", "0185", 20000000);
		Car c6 = new Car("sm3", "1853", 30000000);

		Dog d1 = new Dog(1, "happy", new Date(11));
		Dog d2 = new Dog(2, "merry", new Date());
		Dog d3 = new Dog(3, "�鱸", new Date());
		// ����
		Dog d4 = new Dog(1, "happy�Ƶ�", new Date(11));
		Dog d5 = new Dog(1, "merry�Ƶ�", new Date());
		Dog d6 = new Dog(1, "�鱸�Ƶ�", new Date());

		Person captain = new Person("p1", "A����", d1, c1);
		Person member1 = new Person("p2", "������", d2, c2);
		Person member2 = new Person("p3", "�̼���", d3, c3);

		// Team Ŭ������ �̿��Ͽ� aTeam��ü �����
		// �����ڿ� ���� �Ķ���ʹ� ���� ����� ���� �̿��ϱ�

		Team aTeam = new Team(captain, member1, member2);

		// �ڷ����� Team�� bTeam�� ����ÿ�.

		Person captain2 = new Person("r1", "B����", d4, c4);
		Person member3 = new Person("r2", "�����žƵ�", d5, c5);
		Person member4 = new Person("r3", "�̼��žƵ�", d6, c6);

		Team bTeam = new Team(captain2, member3, member4);

		aTeam.fight(bTeam);
		// A����� B������ �ο�ϴ�. ���
		bTeam.fightMem1(aTeam);
		// �����žƵ�� �������� �ο�ϴ�. ���
		aTeam.fightDog(bTeam);
		// �鱸�� �鱸�Ƶ��� �ο�ϴ�. ���
		aTeam.fighCar(bTeam);
		// K7�� K5�� �����մϴ�. ���
		aTeam.fightCarRacing(bTeam);
		// A������ K7�� B������ K5�� �����մϴ�. ���
		System.out.println("===========================================");

		c1.run(240);
		System.out.println("modelName    carNo      price");
		System.out.println("  " + c1.getModelName() + "         " + c1.getCarNo() + "     " + c1.getPrice());

		System.out.println("===========================================");

		Dog test1 = new Dog(2, "�ƹ���", new Date(11));
		String nameTest = test1.getName();
		System.out.println(nameTest);
		System.out.println(d5.getDid() + " " + d5.getName() + " " + d5.getBirth());

		System.out.println("===========================================");

		Person p1 = new Person("2020", "�̸�", new Dog(10, "�����", new Date()), new Car("K7", "40", 40));
		p1.sleep("����");

		System.out.println("===========================================");

		Team t1 = new Team(p1, p1, p1);
		t1.showCaptainCarPrice();

		System.out.println("===========================================");

		t1.mem2PrintCarModedlName();
		t1.getCaptainCarModelNameFirstChar();

		System.out.println("===========================================");

	}

}
