package com.naver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class Test {
	
	public void me7() {
		Writer out = null;
		PrintWriter pw = null;
		Reader in = null;
		BufferedReader br = null;
		// BufferedReader와 pair이다.
		
		try {
			out = new FileWriter("aaa.txt");
			pw = new PrintWriter(out);
			
			pw.print(false);
			pw.println(false);
			pw.println(false);
			
			pw.flush();
			
			in = new FileReader("aaa.txt");
			br = new BufferedReader(in);
			
			String brin;
			while ((brin=br.readLine()) != null) {
				System.out.println(brin);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null) {
					pw.close();
				}
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me6() {
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			in = new FileInputStream("C:"+File.separatorChar+"abc.txt");
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			
			// 멀티미디어 파일의 데이터는 문자스트림을 사용할 수 없음.
			String msg;
			while ((msg=br.readLine()) != null) {
				System.out.println(msg);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (isr != null) {
					isr.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public void me5() throws Exception {
		// 콘솔창에서 사용자의 입력을 Scanner를 이용해서 획득했지만,
		// 예전에는 또 어떤 회사들은 아직도 BufferedReader를 이용합니다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("당신이 가장 좋아하는 숫자 하나를 입력하세오.");
		String sNum = br.readLine();
		int num = Integer.parseInt(sNum);
		
		System.out.println("당신이 가장 싫어하는 숫자 하나를 입력하세요.");
		String sNum2 = br.readLine();
		int num2 = Integer.valueOf(sNum2);
		
		System.out.println("두 수의 합은 "+(num+num2));
		
		if (br != null) {
			br.close();
		}
	}
	
	public void me4() { // 매우중요
		// InputStram - OutputStream
		// FileInputStream - FileOutputStream
		// 이와같이 짝이 맞으면 pair가 맞다고 합니다.
		// pair를 안 맞추는 이유: 하나는 많이 사용되는데, 다른 것은 거의 사용되지 않을 때
		// BufferedReader - BufferedWriter
		// Scanner......
		
		Reader in = null;
		BufferedReader br = null;
		
		try {
			in = new FileReader("C:"+File.separatorChar+"abc.txt");
			br = new BufferedReader(in);
			
			// String msg = br.readLine();
			// 엔터가 오기 전까지를 하나의 라인으로 인식함.

			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					break;
				}
				System.out.println(msg);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void me3() { // 암기
		// 먼저 출력하고, 입력받은 후 콘솔창에 띄우세요.
		Writer out = null;
		Reader in = null;
		
		try {
			out = new FileWriter("C:"+File.separator+"abc.txt");
			
			String[] arr = {"1", "2", "3", "4", "목요일", "5"};
			
			for (int i = 0; i < arr.length; i++) {
				out.write(arr[i]);
				out.write(System.getProperty("line.separator"));
				}
			
			out.flush();
			
			in = new FileReader("C:"+File.separator+"abc.txt");
			
			char[] arr2 = new char[1024];
			int what;
			
			while ((what=in.read(arr2, 0, arr.length)) != -1) {
				for (int i = 0; i < what; i++) {
					System.out.print(arr2[i]);
				}
			}
			
			System.out.println("작업이 끝났습니다!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public void me2() { // 암기
		// C:/ss.txt에 있는 내용을 읽어오세요.
		Reader in = null;
		
		try {
			in = new FileReader("C:"+File.separator+"ss.txt");
			
			char[] arr = new char[1024];
			int length;
			
			while ((length=in.read(arr, 0, arr.length))!= -1) {
				for (int i = 0; i < length; i++) {
					System.out.print(arr[i]);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("end");
	}
	
	public void me1() { // 암기
		//C:/ss.txt에 문자를 넣어주세요. 단, 줄바꿈하세요.
		Writer out = null;
		
		String[] arr = {"hello", "world", "good"};
		
		try {
			out = new FileWriter("C:"+File.separator+"ss.txt");
			
			out.write("kim");
			out.write(System.getProperty("line.separator"));
			// ㄴ 출력할때 줄바꿈하고싶으면 이것을 입력하세요.
			
			for (int i = 0; i < arr.length; i++) {
				out.write(arr[i]);
				out.write(System.getProperty("line.separator"));
			}
			
			out.flush();
			// ㄴ 현재 버퍼를 클라이언트에게 전송하고 비운다. I/O에서는 출력을 의미한다고 함.
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out!=null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("end");
	}
}
