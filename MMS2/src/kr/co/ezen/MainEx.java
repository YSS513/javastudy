package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.EndCommand;
import com.naver.InsertCommand;
import com.naver.deleteCommand;
import com.naver.selectCommand;
import com.naver.updateCommand;

public class MainEx {

	public static void main(String[] args) {
		
		Command[] menus = {new InsertCommand()
						 , new selectCommand()
						 , new updateCommand()
						 , new deleteCommand()
						 , new EndCommand()};
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("메뉴를 선택하세요.");
			for (int i = 0; i < menus.length; i++) {
				Command com = menus[i];
				System.out.print(i+":");
				System.out.print(com);
				if (i == menus.length-1) {
					break;
				}
				System.out.print(", ");
			}
			System.out.println();
			int idx = sc.nextInt();
			sc.nextLine();
			menus[idx].execute(sc);
		}
	}
}
