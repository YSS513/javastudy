package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ id�� �Է����ּ���.");
		String id = sc.nextLine();
		
		boolean a = DB.db.remove(id);
		
		if (a) {
			System.out.println(a+" ���� ����");
			
		}else {
			System.out.println(a+ " ���� ����");
		}
	}
	
}
