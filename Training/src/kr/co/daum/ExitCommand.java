package kr.co.daum;

import java.util.Scanner;

public class ExitCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("시스템을 종료합니다.");
		System.exit(0);
	}

	@Override
	public String toString() {
		return "종료";
	}
	
}
