package kr.co.ezen;

import com.naver.Dog;
import com.naver.Test;
import com.naver.Training;

public class MainEx {

	public static void main(String[] args) {

		Test t1 = new Test();
		Training t2 = new Training();
		t1.me1();

		t1.me12(new Dog[2]);

		Dog[] arrDog = new Dog[3];

		String[] arrStr = { "hello", "world", "good", "morning" };

		t1.me22(arrStr);

		System.out.println("===============");

		Dog[] dogs = new Dog[] { new Dog(), new Dog(), new Dog(), new Dog() };
		t1.me32(dogs);

		System.out.println("===============");

		t1.me21();

		System.out.println("===============");

		t2.me1(10);

	}

}
