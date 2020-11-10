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

		Command[] coms = { new InsertCommand(), new SelectCommand(), 
				new DeleteCommand(), new UpdateCommand() };

		boolean isOK = true;

		int idx = -1;

		while (isOK) {
			System.out.println("메뉴를 선택하시오");
			System.out.println("0:회원입력, 1:회원조회, 2:삭제, 3:수정, 4:종료");
			idx = sc.nextInt();
			sc.nextLine();

			if (idx == coms.length) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			coms[idx].execute(sc);

		}

		sc.close();

	}
}
