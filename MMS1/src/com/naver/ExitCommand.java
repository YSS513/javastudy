package com.naver;

import java.util.Scanner;

public class ExitCommand implements Command {
	
	@Override
	public void execute(Scanner sc) {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		
	}
	
	@Override
	public String toString() {
		return "종료";
	}
	
	
}
