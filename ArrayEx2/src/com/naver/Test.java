package com.naver;

public class Test {
	
	
	
	public void me5() {
		// ������ �迭
		int[][] arr = new int[3][];
		// 0 : 1, 2, 3, 4
		// 1 : 0, 2, 4
		// 2 : 1, 3, 5, 7, 9
		
		arr[0] = new int[] {1, 2, 3, 4};
		arr[1] = new int[] {0, 2, 4};
		arr[2] = new int[] {1, 3, 5, 7, 9};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
	
	public void me4() {
		int[][] arr = new int[3][10];
		
		// 0 : 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		// 1 : 0, 2, 4 ,6, 8, 10, 12, 14, 16, 18
		// 2 : 1, 3, 5, 7, 9, 11, 13, 15, 17, 19
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0) {
					arr[i][j] = i+1;
				} else if (i == 1) {
					arr[i][j] = i*2;
				} else if (i == 2) {
					arr[i][j] = i*2+1;
				} 
			}
		}
	}
	
	public void me3() {
		int[][] arr1 = {
				{4, 1, 0},
				{4, 1, 8},
				{5, 7, 1}
		};
		
		String[][] arr2 = {
				{"godd", "oh", "my"},
				{"god", "thank", "you"},
		};
		
		// 5 ~ 0�� ��ȯ�Ǹ鼭 �迭�� ��.
		// int�� 3���� arr3�� 3X1X4 ũ��
		int[][][] arr3 = {
				{
					{5, 6, 7, 8},
				},
				{
					{9, 0, 1, 2},
				},
				{
					{3, 4, 5, 6}
				}
		};
		
		// arr3�� ������ index�� ��Ұ��� 1��° ��Ұ��� ����Ͻÿ�.
		System.out.println(arr3[arr3.length-1][0][0]);
		
		// 5 ~ 0�� ��ȯ�Ǹ鼭 �迭�� ��.
		// int�� 2���� �迭 arr4�� 5X3 ũ�⸦ ���´�.
		int[][] arr4 = {
				{5,6,7},
				{8,9,0},
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		// arr4�� [2][1]�� ��Ұ��� 100���� �����Ͽ���.
		arr4[2][1] = 100;

		// arr4�� 3��° ��Ұ��� ��� ���� ��Ұ��� ���϶�.
		for (int i = 0; i < arr4[2].length; i++) {
			System.out.println(arr4[2][i]);
		}
	}

	public void me22() {
		int[][] arr = new int[5][4];

		// 1. arr�� ��� ��Ұ��� ����Ͻÿ�
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

			// 2. arr�� ���� ��Ұ��� ��� ����Ͻÿ�.
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}

		// 3. arr�� �ε����� 0�� ��Ұ��� �ε����� 2�� ��Ұ��� ����Ͽ���.
		System.out.println(arr[0][2]);

		// 4. arr�� ���� ū �ε����� ��Ұ��� ���� ���� �ε����� ��Ұ��� 100���� �����Ͻÿ�.
		arr[arr.length - 1][0] = 100;

		// 5. arr�� ���� ū �ε����� ��Ұ��� ���� ���� �ε����� ��Ұ��� ����Ͻÿ�
		int msg = arr[arr.length - 1][0];
		System.out.println(msg);
	}

	public void me21() {
		// ���� ��Ұ��� �ڷ����� Dog�� 2���� �迭 arr�� ũ��� 10�̰�
		// �� �ȿ� �ִ� �迭�� ũ��� 2�̴�.
		Dog[][] arr = new Dog[10][2];

		// arr�� ��� ��Ұ��� ����Ͻÿ�.
		for (int i = 0; i < arr.length; i++) {
			Dog[] dogs = arr[i];
			System.out.println(arr[i]);
			// �Ǵ� System.out.println(arr[i]);

			// arr�� ���� ��Ұ��� ��� ����Ͻÿ�.
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

	public void me2() {
		// ���� ��Ұ��� �ڷ����� StringBuffer�� 2���� �迭���� 5���� 1���� �迭�� �ִ�.
		// �׸��� �� �ȿ� �ִ� 1���� �迭�� ũ��� 3�̴�.
		StringBuffer[][] arr = new StringBuffer[5][3];
		System.out.println(arr.length);

		System.out.println(arr[0].length);
	}

	public void me1() {
		// 2���� �迭
		// 2���� �迭 �ȿ��� 1���� �迭�� ����ִ�.
		// ���� ��Ұ��� �ڷ����� int�� 2���� �迭�� �����Ͻÿ�.
		int[][] arr;

	}
}
