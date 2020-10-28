package kr.co.ezen;

import com.naver.Dog;
import com.naver.MethodTest2;
import com.naver.MethodTest3;

public class MainEx {
	public static void main(String[] args) {
		
		MethodTest mt1 = new MethodTest();
		MethodTest mt2 = new MethodTest();
		
		mt1.stand();
		mt1.sleep();
		mt1.sayHello();
		
		mt2.sitDown();
		
		mt2.callName("È«±æµ¿");
		
		mt2.printDan(1);
		
		mt2.printScore("È«±æµ¿", 100);
		mt2.printScore(new String("±èÀ¯½Å"), 58);
		
		mt2.iamgrond("À±½Â¼ö", 24);
		
		Test12 mt3 = new Test12();
		mt3.sayHello();
		mt3.printScore("È«±æµ¿", 100);
		
		MethodTest2 mt5 = new MethodTest2();
		int re1 = mt5.giveMeTheMoney();
		
		MethodTest2 mt6 = new MethodTest2();
		int re2 = mt6.giveMeTheMoney();
		
		MethodTest3 t3 = new MethodTest3();
		Test12 test = t3.getTest12();
		
		int test1 = t3.getTest15("¾È³ç", 15);
		System.out.println("¸®ÅÏ°ª = " + test1);
		
		boolean test2 = t3.getTest1();
		
		boolean a = t3.getTest1();
		System.out.println(t3.getTest1());
		
		Dog test3 = new Dog();
		System.out.println(test3.getDog());
		
		Test12 b = t3.getTest12();
		System.out.println(b);
		
		MethodTest2 test10 = new MethodTest2();
		int test11 = test10.giveMeTheMoney();
		
		
	}

}
