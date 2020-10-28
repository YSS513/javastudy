package kr.co.ezen;

public class MainEx {
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
		Test1 t2 = new Test1();
		
		t1 = new Test1();
		
		Test1 t3 = new Test1(34L);
		
		// 변수명 = 객체명 = 레퍼런스
		Test1 t4 = new Test1(3, 4);
		
		Person kim = new Person();
		
		kim.setSsn("s01");
		kim.setName("YSS");
		kim.setAge(24);
		kim.setAddress("Uijeungbu");
		kim.setJob("Army");
		kim.setDog(new Dog("happy", 24));
		kim.setCar(new Car());
		
		System.out.println("=============================================");
		
		System.out.println(kim.getSsn());
		System.out.println(kim.getName());
		System.out.println(kim.getAge());
		System.out.println(kim.getAddress());
		System.out.println(kim.getJob());
		System.out.println(kim.getDog());
		System.out.println(kim.getCar());
		
		System.out.println("=============================================");
		
		Person lee = new Person("S01", "YSS", 24, "Uijeungbu", "Army", new Dog("happy", 24), null);
		
		System.out.println(lee.getSsn());
		System.out.println(lee.getName());
		System.out.println(lee.getAge());
		System.out.println(lee.getAddress());
		System.out.println(lee.getJob());
		System.out.println(lee.getDog());
		System.out.println(lee.getCar());
		
		System.out.println("=============================================");
		
		Dog d1 = kim.getDog();
		String d2 = d1.getName();
		int d3 = d1.getAge();
		System.out.println(d2+" "+d3);
	}

}
