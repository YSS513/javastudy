package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public void me5(String filename) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("txt", "문서파일");
		map.put("png", "이미지파일");
		map.put("gif", "이미지파일");
		map.put("jpeg", "이미지파일");
		map.put("jpg", "이미지파일");
		// 그 외는 "시스템파일"
		
		int idx = filename.lastIndexOf(".");
		// filename의 .을 마지막 인덱스로 지정할게!
		String key = filename.substring(idx+1);
		// filename의 문자열을 잘라낼게! 마지막 인덱스인 . 다음부터!
		String msg = map.get(key.toLowerCase());
		// key에서 받은거 다 소문자로 받을게!
		if (msg==null) { // map에 없는 key는 null로 반환된대!
			System.out.println("시스템파일");
		}else {
			System.out.println(msg);
		}
		
	}
	

	public void me4() {
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();

		List<Dog> list1 = new ArrayList<Dog>();
		list1.add(new Dog("d001", "누렁이", "진드인", 3));
		list1.add(new Dog("d002", "백구", "진드인2", 4));

		List<Dog> list2 = new ArrayList<Dog>();
		list2.add(new Dog("d003", "happy", "득일인1", 3));
		list2.add(new Dog("d004", "타코", "득일인2", 2));

		map.put("진돗개", list1);
		map.put("셰퍼드", list2);
		
		List<Dog> dog1 = map.get("진돗개");
		System.out.println(dog1);
		
		for (int i = 0; i < dog1.size(); i++) {
			String id = dog1.get(i).getId();
			System.out.println(id);
		}
		
		List<Dog> dog2 = map.get("셰퍼드");
		System.out.println(dog2);
		
		for (int i = 0; i < dog2.size(); i++) {
			String id = dog2.get(i).getId();
			System.out.println(id);
		}
	}

	public void me3() {
		// 1. map 객체를 생성
		// 단, K: String, V: List<String>
		// 실무코드
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> list1 = new ArrayList<String>();
		list1.add("sonata");
		list1.add("exel");
		list1.add("genesis");
		list1.add("grandure");

		List<String> list2 = new ArrayList<String>();
		list2.add("k7");
		list2.add("k5");
		list2.add("pride");
		list2.add("지프");

		map.put("현대차", list1);
		map.put("기아차", list2);
		
		List<String> hyundai = map.get("현대차");
		System.out.println(hyundai);
		
		for (int i = 0; i < hyundai.size(); i++) {
			System.out.println(hyundai.get(i));
		}
		
		List<String> kia = map.get("기아차");
		System.out.println(kia);
		
		for (int i = 0; i < kia.size(); i++) {
			System.out.println(kia.get(i));
		}
		

	}

	public void me2() {
		// 1. map 객체를 만듦
		// 2. 단, K: Integer, V: String
		// 키가 같으면 밸류가 덮어씌워진다.
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "kim");
		map.put(0, "lee");
		map.put(2, "park");
		map.put(1, "gang");
		
		System.out.println(map);
		
		String name = map.get(0);
		System.out.println(name);
		name = map.get(1);
		System.out.println(name);
		name = map.get(2);
		System.out.println(name);
		
	}

	public void me1() {
		// 1. Map, HashMap
		// 2. map 객체를 만드세요.
		// 단, Key: String, Value: Integer
		Map<String, Integer> map = new HashMap<String, Integer>();

		// map에 데이터 입력
		map.put("중력가속도", 9);
		map.put("우리집 비밀번호", 12345);
		map.put("서울과 부산간의 거리", 300);
		
		System.out.println(map);
		
		int g = map.get("중력가속도");
		System.out.println(g);
		
		int password = map.get("우리집 비밀번호");
		System.out.println(password);
		
		int leng = map.get("서울과 부산간의 거리");
		System.out.println(leng);
	}
}
