package com.naver;

import java.util.Scanner;

public class ExitCommand implements Command {
	
	@Override
	public void execute(Scanner sc) {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
		
	}
	
	@Override
	public String toString() {
		return "����";
	}
	
	
}
