package com.naver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kr.co.daum.Command;
import kr.co.daum.DeleteCommand;
import kr.co.daum.ExitCommand;
import kr.co.daum.InsertCommand;
import kr.co.daum.SelectCommand;
import kr.co.daum.UpdateCommand;

public class MainEx {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Command> coms = new ArrayList<Command>();
		coms.add(new InsertCommand());
		coms.add(new SelectCommand());
		coms.add(new UpdateCommand());
		coms.add(new DeleteCommand());
		coms.add(new ExitCommand());
		
		boolean isOK = true;
		int idx;
		
		try {
			while (isOK) {
				System.out.println("메뉴를 선택하세요.");
				for (int i = 0; i < coms.size(); i++) {
					Command com = coms.get(i);
					System.out.print(i+":"+com);
					if (i == coms.size()-1) {
						break;
					}
					System.out.print(", ");
				}
				System.out.println();
				idx = sc.nextInt();
				sc.nextLine();
				
				coms.get(idx).execute(sc);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
		
		
		
	}
}
