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
			System.out.println("�޴��� �����Ͻÿ�.");
			System.out.println("0:ȸ������, 1:ȸ����ȸ, 2:ȸ��Ż��");
			idx = sc.nextInt();
			sc.nextLine();
			
			if (idx >= coms.length) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			coms[idx].execute(sc);
		}
		sc.close();
	}
}
