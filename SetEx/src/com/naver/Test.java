package com.naver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {
	
	
	public void me4() {
		Set<MemberDTO> set = new HashSet<MemberDTO>();
		
		set.add(new MemberDTO("m001", "kim", 4));
		set.add(new MemberDTO("m002", "lee", 11));
		set.add(new MemberDTO("m005", "park", 32));
//		set.add(new MemberDTO("m002", "kang", 43)); false
//		set.add(new MemberDTO("m005", "choi", 2)); false
		
		int size = set.size();
		System.out.println(size);
		
		//1. 배열 arr에 set이 갖고 있는 데이터를 저장하고
		//2. 그 중 id가 m005인 MemberDTO 객체를 이용해서
		//3. 그 객체의 age 값을 출력하시오.
		
//		list로 한다면?
//		list = new ArrayList<MemberDTO>(set.size());
				
//		List<MemberDTO> list = new ArrayList<MemberDTO>();
//		int idx2 = list.indexOf(new MemberDTO("m005", null, 0));
//		MemberDTO dto = list.get(idx2);
//		System.out.println(dto.getAge());
		
		Iterator<MemberDTO> it = set.iterator();
		MemberDTO[] arr = new MemberDTO[set.size()];
		int idx = 0;
		
		while (it.hasNext()) {
			MemberDTO dto = it.next();
			System.out.println(dto);
			arr[idx] = dto;
			idx++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			MemberDTO dto = arr[i];
			if (dto.getId().equals("m005")) {
				System.out.println(dto.getAge());
			}
		}
		
		

		
	}
	
	public void me3() {
		Set<Apple> set = new HashSet<Apple>();
		
		set.add(new Apple("a001", "대구", "사과1", 1500));
		set.add(new Apple("a002", "대전", "사과2", 2000));
		set.add(new Apple("a003", "서울", "사과3", 3000));
		set.add(new Apple("a002", "부산", "사과44", 500)); // false
		set.add(new Apple("a005", "청송", "사과5", 1000));
		
		int size = set.size();
		System.out.println(size);
		
		Iterator<Apple> it = set.iterator();
		List<Apple> list = new ArrayList<Apple>();
		
		while (it.hasNext()) {
			Apple apple = it.next();
			System.out.println(apple);
			list.add(apple);
		}
		
		// 3번째 사과만 출력하기!
		
		int idx = list.indexOf(new Apple("a003", null, null, 0));
		Apple apple = list.get(idx);
		System.out.println(apple);
		}
		
	
	public void me2() {
		Set<String> set = new HashSet<String>();
		
		set.add("hello");
		set.add(new String("hello")); // false
		set.add("hello"); // false
		set.add("Hello");
		set.add(new String("Hello")); // false
		set.add("HELLO");
		set.add(new String("HELLO")); // false
		
		int size = set.size();
		System.out.println(size);
		
		Iterator<String> it = set.iterator();
		List<String> list = new ArrayList<String>();
		
		while (it.hasNext()) {
			String string = it.next();
			System.out.println(string);
			list.add(string);
		}
		
		//대문자 HELLO만 출력하기
		int idx = list.indexOf("HELLO");
		String msg = list.get(idx);
		System.out.println(">>>>>>>>>>>>");
		System.out.println(msg);
	}
	
	public void me1() {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1); // false
		
		int size = set.size();
		System.out.println(size);
		
		System.out.println("#####################");
		
		Iterator<Integer> it = set.iterator();
		List<Integer> list = new ArrayList<Integer>();
		
		while (it.hasNext()) {
			Integer integer = it.next();
			System.out.println(integer);
			list.add(integer);
		}
		
		// while문 밖에서 data중에서 3만 출력
		
		int idx = list.indexOf(3);
		int num = list.get(idx);
		System.out.println(num);
		
		
		
	
	}
}
