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

		// 다형성 : 객체를 생성하는 다양한 방법..
		// 부모자료형 변수명 = new 자식생성자();
		// 자식자료형 변수명 = new 자식쟁성자();

		Car sonata2 = new Sonata();
		Car bmw2 = new BMW();

		sonata1.run();
		sonata2.run();

		Car[] arrCar = { sonata1, bmw1, sonata2, bmw2 };

		sonata1.equals(sonata2); // equals() 메서드의 파라미터 자료형은 Object

		sonata1.only();

		Sonata s1 = (Sonata) sonata2;
		
		// instanceof 상속관계를 판별하는 연산자, true면 형변환한다.
		Sonata s = null;
		if (sonata2 instanceof Sonata) {
			s = (Sonata) sonata2;
			s.only();
		}
		
		// 위에꺼보다 더 좋은 코드이다.
		if (sonata2.getClass() == Sonata.class) {
			s = (Sonata) sonata2;
			s.only();
		}
	}

}
