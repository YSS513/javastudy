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
		
		String msg = new String("경기도#의정부시#금오동#파스텔아파트#103동#103호");
		
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
		
		String msg = new String("경기도#의정부시#금오동#파스텔아파트#103동#103호#");
		
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
		String msg = new String("경기도#의정부시#금오동#파스텔#103동#103호");
		
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
		String msg = new String("일번타자@이번타자@삼번타자@사번타자");
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
		String msg = "판#테#온#개#사#기";
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
		String msg = new String("아#몰#랑#외#우#자");
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
		String msg = "암기#둘#석삼#너구리#오징어";
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
		String msg = new String("암기#한번더#해보자#이거다");
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
		String msg = "암기#한번더#끝나기#전에#하자";
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