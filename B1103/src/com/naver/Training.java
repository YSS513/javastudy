package com.naver;

public class Training {
	
	public void me1(int n) {
		// �迭�� ũ��� �ܺο��� �޴� n�̰�, �Ǻ���ġ������ �̿��Ͽ� ���� �־��ְ� ����Ѵ�.
		// ��, �ε��� �Ǵ� ��Ұ��� Ȧ���� ��� ������� �ʴ´�.
		int[] pibo = new int[n];
		
		int a = 1;
		int b = 1;
		
		for (int i=0; i < pibo.length; i++) {
			int c = a + b;
			pibo[i] = c;
			a = b;
			b = c;
			if (i % 2 == 0 && pibo[i] % 2 == 0) {
				System.out.println(pibo[i]);
			}

		}
	}

}
