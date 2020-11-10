package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.InsertCommand;
import com.naver.SelectCommand;
import com.naver.UpdateCommand;

public class MainEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Command[] coms = {new InsertCommand(), new SelectCommand(),
						new UpdateCommand(), new DeleteCommand() };
		
		boolean a = true;
		int idx = 0;
		
		while (a) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("0:회원가입, 1:회원조회, 2:회원정보수정, 3:회원탈퇴, 4:종료");
			idx = sc.nextInt();
			sc.nextLine();
			
			if (idx > coms.length) {
				System.out.println("종료합니다.");
				break;
			}
			coms[idx].execute(sc);
		}
		sc.close();
	}
}
