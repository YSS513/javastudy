package com.naver;

public interface Inter1 {
	
	// ��� ���� �ǹ��̴�. �ǹ������� ª�� �����
	// public final static�� ������ �ʾƵ� ������
	int A = 10;
	static int B = 20;
	final static int C = 30;
	public final static int AA_BB = 33;
	
	// ��� ���� �ǹ�
	// public abstract�� ������ �ʾƵ� ������
	void me1();
	abstract void me2();
	public abstract void me3();
}
