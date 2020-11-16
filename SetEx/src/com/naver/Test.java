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
		
		//1. �迭 arr�� set�� ���� �ִ� �����͸� �����ϰ�
		//2. �� �� id�� m005�� MemberDTO ��ü�� �̿��ؼ�
		//3. �� ��ü�� age ���� ����Ͻÿ�.
		
//		list�� �Ѵٸ�?
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
		
		set.add(new Apple("a001", "�뱸", "���1", 1500));
		set.add(new Apple("a002", "����", "���2", 2000));
		set.add(new Apple("a003", "����", "���3", 3000));
		set.add(new Apple("a002", "�λ�", "���44", 500)); // false
		set.add(new Apple("a005", "û��", "���5", 1000));
		
		int size = set.size();
		System.out.println(size);
		
		Iterator<Apple> it = set.iterator();
		List<Apple> list = new ArrayList<Apple>();
		
		while (it.hasNext()) {
			Apple apple = it.next();
			System.out.println(apple);
			list.add(apple);
		}
		
		// 3��° ����� ����ϱ�!
		
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
		
		//�빮�� HELLO�� ����ϱ�
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
		
		// while�� �ۿ��� data�߿��� 3�� ���
		
		int idx = list.indexOf(3);
		int num = list.get(idx);
		System.out.println(num);
		
		
		
	
	}
}
