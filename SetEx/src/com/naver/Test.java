package com.naver;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	
	public void me4() {
		Set<MemberDTO> set = new HashSet<MemberDTO>();
		
		set.add(new MemberDTO("m001", "kim", 4));
		set.add(new MemberDTO("m002", "lee", 11));
		set.add(new MemberDTO("m005", "park", 32));
//		set.add(new MemberDTO("m002", "kang", 43));
//		set.add(new MemberDTO("m005", "choi", 2));
	}
	
	public void me3() {
		Set<Apple> set = new HashSet<Apple>();
		
		set.add(new Apple("a001", "대구", "사과1", 1500));
		set.add(new Apple("a002", "대전", "사과2", 2000));
		set.add(new Apple("a003", "서울", "사과3", 3000));
		set.add(new Apple("a002", "부산", "사과44", 500)); // false
		set.add(new Apple("a005", "청송", "사과5", 1000));
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
		
	}
	
	public void me1() {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1); // false
	}
	
}
