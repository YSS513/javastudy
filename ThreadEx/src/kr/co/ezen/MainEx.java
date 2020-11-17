package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;

public class MainEx {

	public static void main(String[] args) {
//		Thread ct = Thread.currentThread();
//		String name = ct.getName();
//		System.out.println(name);
		
		System.out.println("main start");
		

		// 1. Test클래스를 Thread 클래스로 만듦
		// 2. Test클래스를 이용해서 Thread 객체를 만듦
		// 3. Test클래스를 이용해서 Thread를 만듦
		// 클래스생성 => 객체생성 => Thread 생성

		Test t1 = new Test();
		Test2 t2 = new Test2();
		
		Test3 r3 = new Test3();
		Test4 r4 = new Test4();
		
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("main end");
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("통신 등을 구현할 때, 자주 쓰는 쓰레드");
				
			}
		}).start();
	}

}
