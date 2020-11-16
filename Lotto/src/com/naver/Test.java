package com.naver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Test {
	
	public void lottory() {
		Set<Integer> set = new HashSet<Integer>();
		
		Random rnd = new Random();
		while (set.size() < 6) {
			int num = rnd.nextInt(45-1+1) +1;
			set.add(num);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer integer = it.next();
			list.add(integer);
		}
		
		Collections.sort(list);
		
		System.out.println(list);
	}
	
	public void me1() {
		Random rnd = new Random();
		int min = 1;
		int max = 45;
		int num = 1;
		int lotto[] = new int[6];
		
		System.out.println("       <추첨>");
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rnd.nextInt((max-min)+1)+min;
			System.out.println("Lotto추첨번호"+"["+num+"] "+lotto[i]);
			num++;
			
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					System.out.println("**중복된 번호 : "+lotto[i]);
					i--;
				}
			}
		}
		
		System.out.println();
		System.out.println("   <최종 lotto번호>");
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+", ");
		}
		
		
		
	}
}
