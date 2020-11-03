package kr.co.ezen;

import com.naver.CarRegistManagement;
import com.naver.DogRegistManagement;

public class MainEx {
	public static void main(String[] args) {

		CarRegistManagement crms = new CarRegistManagement();

		crms.setCarName("k7");

		String carName = crms.getCarName();

		System.out.println(carName);

		// =============================================================int => long 형변환
		// 코드

		CarRegistManagement crms2 = new CarRegistManagement();

		long result = crms2.add(200000000, 2000000000);

		System.out.println(result);

		// =============================================================

		DogRegistManagement drms = new DogRegistManagement();
		Dog d1 = drms.makeDog("happy", 3);
		System.out.println(d1);
		System.out.println(d1.getName());
		System.out.println(d1.getAge());

		// =============================================================length로 문자열 길이
		// 알려준애

		int sonata = crms2.getCountCarName("현대자동차");
		System.out.println(sonata);

		// =============================================================
	}

}
