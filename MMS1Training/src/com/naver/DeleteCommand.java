package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 id를 입력해주세요.");
		String id = sc.nextLine();
		
		boolean a = DB.db.remove(id);
		
		if (a) {
			System.out.println(a+" 삭제 성공");
			
		}else {
			System.out.println(a+ " 삭제 실패");
		}
	}
	
}
