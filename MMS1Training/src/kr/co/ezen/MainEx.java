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
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("0:ȸ������, 1:ȸ����ȸ, 2:ȸ����������, 3:ȸ��Ż��, 4:����");
			idx = sc.nextInt();
			sc.nextLine();
			
			if (idx > coms.length) {
				System.out.println("�����մϴ�.");
				break;
			}
			coms[idx].execute(sc);
		}
		sc.close();
	}
}
