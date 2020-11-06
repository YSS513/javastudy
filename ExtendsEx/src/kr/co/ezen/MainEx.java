package kr.co.ezen;

import com.naver.BMW;
import com.naver.Car;
import com.naver.K7;
import com.naver.Sonata;

public class MainEx {

	public static void main(String[] args) {
		Sonata sonata1 = new Sonata();
		BMW bmw1 = new BMW();
		Car car1 = new Car();

		// ������ : ��ü�� �����ϴ� �پ��� ���..
		// �θ��ڷ��� ������ = new �ڽĻ�����();
		// �ڽ��ڷ��� ������ = new �ڽ��Ｚ��();

		Car sonata2 = new Sonata();
		Car bmw2 = new BMW();

		sonata1.run();
		sonata2.run();

		Car[] arrCar = { sonata1, bmw1, sonata2, bmw2 };

		sonata1.equals(sonata2); // equals() �޼����� �Ķ���� �ڷ����� Object

		sonata1.only();

		Sonata s1 = (Sonata) sonata2;
		
		// instanceof ��Ӱ��踦 �Ǻ��ϴ� ������, true�� ����ȯ�Ѵ�.
		Sonata s = null;
		if (sonata2 instanceof Sonata) {
			s = (Sonata) sonata2;
			s.only();
		}
		
		// ���������� �� ���� �ڵ��̴�.
		if (sonata2.getClass() == Sonata.class) {
			s = (Sonata) sonata2;
			s.only();
		}
	}

}
