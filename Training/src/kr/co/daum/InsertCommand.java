package kr.co.daum;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("id를 입력해주세요.");
		String id = sc.nextLine();
		System.out.println("name을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("age를 입력해주세요.");
		int age = sc.nextInt();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		
		DB.db.add(dto);
		
	}
	
	
	
}
