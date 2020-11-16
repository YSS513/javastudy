package com.naver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public void me8() {
		
		List<Apple> list = new ArrayList<Apple>();
		list.add(new Apple("a001", "대구", "사과1", 1500));
		list.add(new Apple("a002", "대전", "사과2", 2000));
		list.add(new Apple("a005", "청송", "사과5", 1000));
		list.add(new Apple("a003", "서울", "사과3", 3000));
		list.add(new Apple("a004", "부산", "사과4", 2500));
		
		System.out.println(">>>>>>>>>>>>>>>>>>>");
		Collections.sort(list);
		System.out.println(list);
		System.out.println(">>>>>>>>>>>>>>>>>>>");
		
		
		// list에 있는 사과의 [지역 : 이름]을 모두 출력하시오.
		// 단, idx가 0인 경우에는 출력 제외.
		
		for(int i=0; i<list.size();i++) {
			if(i==0) {
				continue;
			}
			Apple apple = list.get(i);
			System.out.println(apple);
		}
		
		
		//list에 있는 객체 중 id가  a003과 a004인 데이터를 삭제하시오.
		
		list.remove(new Apple("a003", null, null, 0));
		list.remove(new Apple("a004", null, null, 0));
		
		System.out.println(list);
		
		
		list.clear();
		System.out.println(list);
		
		
		
		
	}
	
	public List<MemberDTO> me7() {
		//main()에서 me7()호출, 그런 후에 반환되는 데이터 중 두 번째 객체의 name을 출력
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		list.add(new MemberDTO("m001", "kim", 5));
		list.add(new MemberDTO("m002", "lee", 12));
		list.add(new MemberDTO("m003", "park", 53));
		list.add(new MemberDTO("m004", "kang", 55));
		list.add(new MemberDTO("m005", "choi", 11));
		
		return list;
	}
	
	public void me6() {
		//list 객체를 만드시오. 단, Map<String, Object>를 담을 수 있음.
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		list.add(new HashMap<String, Object>());
		
		for(int i = 0; i<list.size();i++) {
			Map<String, Object> map = list.get(i);
			System.out.println(map);
		}
		
		
		list.clear();
		
		
		
	}
	
	public void me5() {
		//list 객체를 만드시오. 단, Thread를 담을 수 있음.
		List<Thread> list = new ArrayList<Thread>();
		
		list.add(new Thread());
		list.add(new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}));
		
		
		// list에 있는 객체를 모두 출력하시오.
		
		
		for(int i=0;i<list.size();i++) {
			Thread t = list.get(i);
			System.out.println(t);
		}
		
		
		
		
	}
	
	public void me4() {
		//list  객체를 만드시오. 단, new StringBuffer()를 담을 수 있음.
		List<StringBuffer> list = new ArrayList<StringBuffer>();
		list.add(new StringBuffer());
		
		// list에 들어 있는 모든 데이터를 출력하시오.
		
		for(int i = 0; i < list.size(); i++) {
			StringBuffer sb = list.get(i);
			System.out.println(sb);
		}
		
		
		// list에 들어 있는 모든 데이터를 반복문을 이용하여 삭제하시오.
		
		for(int i=list.size()-1; i>=0;i--) {
			list.remove(i);
		}
		
		
	}
	
	
	public void me3() {
		//list 객체를 만드세요. 단, 3.5, 4.1, 9.8을 입력할 수 있는 객체입니다.
		List<Double> list = new ArrayList<Double>();
		
		list.add(3.5);
		list.add(4.1);
		list.add(9.8);
		
		double num = list.get(1);
		System.out.println(num);
		
		for(int i =0; i< list.size();i++) {
			num = list.get(i);
			System.out.println(num);
		}
		
		//list에 들어 있는 마지막 요솟값을 1.1로 변경하고 싶습니다.
		//1. 마지막 요솟값의 인덱스 어떻게 구할까?
		int idx = list.size()-1;
		
		//2. 1.1로 어떻게 변경할까?
		list.set(idx, 1.1);
		
		
		
		// list에 있는 데이터를 반복문을 이용해서 전부 삭제하시오.
		for(int i = list.size()-1; i >= 0; i--) {
			list.remove(i);
		}
		
		
	}
	
	public void me2() {
		//list 객체를 만들어 주세요. 단, 제네릭 타입은 3, 4, 5, 6을 입력할 수 있게
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(5);
		list.add(6);
		
		int num = list.get(2);
		System.out.println(num);
		
		
		for(int i =0 ;i < list.size();i++) {
			num = list.get(i);
			System.out.println(num);
			
		}
		
		list.set(1, 100);
		System.out.println(list);
		
//		list.remove(1);
//		list.remove(2);
		
		list.remove(2);
		list.remove(1);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
	}
	
	public void me1() {
		List<Apple> list = new ArrayList<Apple>();
		list.add(new Apple());
		
		Apple iphone12 = list.get(0);
		// list에 들어 있는 모든 요솟값을 출력하시오.
		for(int i=0; i < list.size(); i++) {
			Apple apple = list.get(i);
			System.out.println(apple);
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
