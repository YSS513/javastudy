package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.InsertCommand;
import com.naver.SelectCommand;

public class MainEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Command[] coms = {new InsertCommand(), new SelectCommand()};
		
		boolean isOK = true;
		int idx = 0;
		
		while (isOK) {
			System.out.println("메뉴를 선택하시오.");
			System.out.println("0:회원가입, 1:회원조회, 2:회원탈퇴");
			idx = sc.nextInt();
			sc.nextLine();
			
			if (idx >= coms.length) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			coms[idx].execute(sc);
		}
		sc.close();
	}
}
