package com.naver;

import java.util.StringTokenizer;

public class Training {
	
	public void Train1() {
		
		String msg = new String("ID#Password#Class#Number#Array");
		
		StringTokenizer st = new StringTokenizer(msg, "#");
		
		String[] tArr = new String[st.countTokens()];
		
		int i = 0;
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			
			tArr[i] = token;
			i++;
		}
		System.out.println(tArr[4]);
	}
	
	public void Train2() {
		
		String msg = new String("��⵵#�����ν�#�ݿ���#�Ľ��ھ���Ʈ#103��#103ȣ");
		
		StringTokenizer st = new StringTokenizer(msg, "#");
		
		String[] tArr = new String[st.countTokens()];
		
		int i = 0;
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			
			tArr[i] = token;
			i++;
		}
		for (int j = 0; j < tArr.length; j++) {
			System.out.println(tArr[j]);
		}
	}
	
	public void Train3() {
		
		String msg = new String("��⵵#�����ν�#�ݿ���#�Ľ��ھ���Ʈ#103��#103ȣ#");
		
		StringTokenizer st = new StringTokenizer(msg, "#");
		
		String[] tArr = new String[st.countTokens()];
		
		int i = 0;
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			
			tArr[i] = token;
			i++;
		}
		System.out.println(tArr[tArr.length-1]);
	}
	
	public void Train4() {
		String msg = new String("��⵵#�����ν�#�ݿ���#�Ľ���#103��#103ȣ");
		
		StringTokenizer st = new StringTokenizer(msg, "#");
		
		String[] tArr = new String[st.countTokens()];
		
		int i = 0;
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			
			tArr[i] = token;
			i++;
		}
		System.out.println(tArr[0]);
	}
	
	public void Train5() {
		String msg = new String("�Ϲ�Ÿ��@�̹�Ÿ��@���Ÿ��@���Ÿ��");
		StringTokenizer st = new StringTokenizer(msg, "@");
		String[] tArr = new String[st.countTokens()];
		
		int i = 0;
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			tArr[i] = token;
			i++;
		}
		System.out.println(tArr[0]);
	}
	
	public void Train6() {
		String msg = "��#��#��#��#��#��";
		StringTokenizer st = new StringTokenizer(msg, "#");
		String[] tArr = new String[st.countTokens()];
		
		int i = 0;
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			tArr[i] = token;
			i++;
		}
		System.out.println(tArr[tArr.length-1]);
	}
	
	public void Train7() {
		String msg = new String("��#��#��#��#��#��");
		StringTokenizer st = new StringTokenizer(msg, "#");
		String[] tArr = new String[st.countTokens()];
		
		int i = 0;
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			tArr[i++] = token;
		}
		System.out.println(tArr[0]);
	}
	
	public void Train8() {
		String msg = "�ϱ�#��#����#�ʱ���#��¡��";
		StringTokenizer st = new StringTokenizer(msg, "#");
		String[] tArr = new String[st.countTokens()];
		
		int i = 0;
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			tArr[i] = token;
			
			i++;
		}
		System.out.println(tArr[0]);
	}
	
	public void Train9() {
		String msg = new String("�ϱ�#�ѹ���#�غ���#�̰Ŵ�");
		StringTokenizer st = new StringTokenizer(msg, "#");
		String[] tArr = new String[st.countTokens()];
		
		int i = 0;
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			tArr[i++] = token;
		}
		for (int j = 0; j < tArr.length; j++) {
			System.out.println(tArr[j]);
		}
	}
	
	public void Train10() {
		String msg = "�ϱ�#�ѹ���#������#����#����";
		StringTokenizer st = new StringTokenizer(msg, "#");
		String[] tArr = new String[st.countTokens()];
		
		int i = 0;
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			tArr[i++] = token;
		}
		for (int j = 0; j < tArr.length; j++) {
			System.out.println(tArr[i]);
		}
	}
}