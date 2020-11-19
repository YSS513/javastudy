package com.naver;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Training {
	
	public void Train() {
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
				for (int j = 0; j < what; j++) {
					System.out.print(arr2[j]);
				}
			}
			
			System.out.println("끝!");
			
			
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
}
