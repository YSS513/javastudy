package kr.co.daum;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ id�� �Է����ּ���.");
		String id = sc.nextLine();
		
		boolean a = DB.db.remove(new MemberDTO(id, null, 0));
		if (a) {
			System.out.println(id + " ���� ����");
		} else {
			System.out.println(id + " ���� ����");
		}
		
	}

	@Override
	public String toString() {
		return "����";
	}
	
}
