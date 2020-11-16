package kr.co.ezen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.ExitCommand;
import com.naver.InsertCommand;
import com.naver.SelectCommand;
import com.naver.UpdateCommand;

public class MainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Command> coms = new ArrayList<Command>();
		coms.add(new InsertCommand());
		coms.add(new SelectCommand());
		coms.add(new UpdateCommand());
		coms.add(new DeleteCommand());
		coms.add(new ExitCommand());
		
		boolean isOK = true;

		int idx = 0;

		try {
			while (isOK) {
				System.out.println("메뉴를 선택하시오");
				for (int i = 0; i < coms.size(); i++) {
					Command com = coms.get(i);
					System.out.print(i+":");
					System.out.print(com);
					if (i == coms.size()-1) {
						break;
					}
					System.out.print(", ");
				}
				System.out.println();
				idx = sc.nextInt();
				sc.nextLine();

				coms.get(idx).execute(sc);
				//배열일경우? coms[idx].execute(sc);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

		

	}

}
