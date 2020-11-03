package com.naver;

public class Test {
	
	public void me32(Dog[] dogs) {
		// 1. dogs�� �迭 ũ�⸦ ����Ͻÿ�.
		// 2. main()���� me32() �޼��带 ȣ���Ͻÿ�.
		//    ��, �����Ͱ� �ʿ��ϸ� new Dog(), new Dog(), new Dog(), new Dog();�� ��� �̿�
		int size = dogs.length;
		
		System.out.println(size);
	}
	
	public void me31() {
		// 1. �迭 ���� 3��° ������� arrFloat ��ü����
		// 2. �迭 ���� 3.14, 4.2, 9.8
		// 3. arrFloat�� �迭 ũ�� ���
		float[] arrFloat = new float[] {3.14F, 4.2F, 9.4F};
		System.out.println(arrFloat.length);
	}
	
	public void me3() {
		int[] arrInt = new int[] {1, 3, 5, 7};
		System.out.println(arrInt.length);
	}
	
	public void me22(String[] arrStr) {
		// 1. arrStr�� �迭 ũ�⸦ ����Ͻÿ�.
		// 2. main( )���� me22( ) ȣ���Ͻÿ�.
		System.out.println(arrStr.length);
		
		// arrStr�� index�� 1�� ���� ���� "12"�� �����Ͻÿ�.
		arrStr[1] = "12";
		// arrStr�� index�� 1�� ���� ���� ����Ͻÿ�.
		System.out.println(arrStr[1]);
		
		String s1 = arrStr[1];
		System.out.println(s1);
		
		int[][] arr2Int = {
				{1, 3, 5, 7},
				{0, 2, 3, 6}
		};
		
		int[] arr0Int = arr2Int[0];
		int i1 = arr0Int[1];
	}
	
	public void me21() {
		// 1. �ڷ����� Dog�� 1���� �迭 arrDog�� 2��° ������� �����Ͻÿ�.
		// ��, ũ��� 2�� �Ͻÿ�.
		// 2. arrDog�� �迭 ũ�⸦ ����Ͻÿ�.
		Dog[] arrDog = {new Dog(), new Dog()};
		// Dog a = new Dog();
		// Dog b = new Dog();
		// Dog[] arrDog = {a, b};
		System.out.println(arrDog.length);
		
		// arrDog�� ���� ū �ε����� ��Ұ��� null�� �����Ͻÿ�.
		arrDog[arrDog.length-1] = null;
		
		// 1. arrDog�� ��� ��Ұ��� ����Ͻÿ�.
		for (int i=0; i < arrDog.length; i++) {
			System.out.println(arrDog[i]);
		}
		
		// 2. arrDog�� �ε����� 1�� ��Ұ��� name�� ����Ͻÿ�.
		// ��, �ش� ��Ұ��� null�� �ƴ� ��쿡��
		if (arrDog[1] != null) {
			System.out.println(arrDog[1].getName());
		}
		
	}
	
	public void me2( ) {
		// �ڷ���[] ������ = {��1, ��2, ��3 ...};
		int[] arrInt = {1, 4, 6};
		
		// arrInt�� �迭 ũ�⸦ ����Ͻÿ�.
		System.out.println(arrInt.length);
		
		// arrInt �迭�� 2��° ��Ұ��� ����Ͻÿ�.
		System.out.println(arrInt[1]);
		// arrInt �迭�� �ε����� 1�� ��Ұ��� 333���� �����Ͽ���.
		arrInt[1] = 333;
		
		// 1. arrInt�� ���� �ִ� ��� ��Ұ� ����ϱ�
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		// 2. arrInt�� ���� �ִ� ��� ��Ұ� ����ϱ�, ��, �ε����� 1�� ��Ұ��� ��� ����
		for (int i = 0; i < arrInt.length; i++) {
			if (i==1) {
				continue;
			}
			System.out.println(arrInt[i]);
		}
		// 3. arrInt�� ���� �ִ� ��� ��Ұ� ����ϱ�, ��, ��Ұ��� 6�� ��Ұ��� ��� ����
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] != 6) {
				System.out.println(arrInt[i]);
			}
		}
		
	}
	
	public void me13() {
		String data = "teacheryo#1#seoul#226#-1";
		String[] arrData = data.split("#");
		// 1. data.split("#")�� ��ȯ���� arrData�� �ް�
		// 2. arrData�� ũ�⸦ ����Ͻÿ�.
		System.out.println(arrData.length);
		
		// arrData�� ���� ū �ε����� ��Ұ��� "100"���� �����Ͻÿ�.
		arrData[arrData.length -1] = "100";
		
		// arrData�� ���� ���� �ε����� ��Ұ��� "ezen"���� �����Ͻÿ�.
		arrData[0] = "ezen";
		
		// 1. arrData�� ��� ��Ұ��� ����Ͻÿ�.
		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i]);
		}
		// 2. arrData�� ��� ��Ұ��� ù ���ڸ� ����Ͻÿ�.
		for (int i = 0; i < arrData.length; i++) {
			String msg = arrData[i];
			char c = msg.charAt(0);
			System.out.println(c);
//			System.out.println(arrData[i].charAt(0));     << �ǹ� �ڵ�
		}
	}
	
	public void me12(Dog[] dogs) {
		// 1. Test class�� me12( )���� �Ķ���ͷ� �Ѿ�� �迭 �������� ũ�⸦ ����Ͻÿ�.
		// 2. main( )�� ���� me12( )�� ȣ���Ͻÿ�.
		System.out.println(dogs.length);
		
		// dogs�� ���� ū �ε��� ��Ұ��� null�� �����Ͻÿ�.
		int largestIdx = dogs.length -1;
		dogs[largestIdx] = null;
		// �Ϲ������� dogs[dogs.length -1] = null;
		
		// 1. dogs �迭�� �ִ� ��� dog ��ü�� ����Ͻÿ�.
		for (int i=0; i < dogs.length; i++) {
			System.out.println(dogs[i]);
		}
		// 2. dogs �迭�� �ִ� ��� dog ��ü�� �̸��� ����Ͻÿ�.
		for (int i=0; i < dogs.length; i++) {
			Dog dog = dogs[i];
			
			if (dog != null) {
				String name = dog.getName();
				System.out.println(name);
				//			System.out.println(dogs[i].getName());     < �ǹ� �ڵ�
			}
		}
	}
	
	public void me11() {
		// �迭�� ũ�Ⱑ 100�� StringBuffer���� 1 ���� �迭 arrSb�� �����Ͻð�
		// arrSb�� �迭 ũ�⸦ ����Ͻÿ�.
		StringBuffer[] arrSb = new StringBuffer[100];
		System.out.println("==================");
		
		// arrSb�� 51��° ��Ұ� ����ϼ���.
		System.out.println(arrSb[50]);
		
		StringBuffer sb1 = new StringBuffer();
		// arrSb�� �ε����� 1���� ���� sb1�� ��ü�� �����϶�.
		arrSb[1] = sb1;
		
		System.out.println("==================");
		
		System.out.println(arrSb.length);
		
		// arrSb�� ���� �ִ� ��� ��Ұ��� �����
		// ��, ��� ������ �ε����� ū ������ ����մϴ�.
		
		for (int i = arrSb.length-1; i>=0; i--) {
			System.out.println(arrSb[i]);
		}
	}
	
	public void me1() {
		// �ڷ���[] ������ = new �ڷ���[�迭�� ũ��];
 		int[] arrInt = new int[4];
 		
 		// arrInt�� 0, 1, 2, 3�� �Է��Ͻÿ�.
 		for (int i=0; i < arrInt.length; i++) {
			arrInt[i] = i;
		}
 		
 		// arrInt�� 0, 2, 4, 6�� �Է��Ͻÿ�.
 		for (int i=0; i < arrInt.length; i++) {
			arrInt[i] = i*2;
		}
 		
 		// arrInt�� 1, 3, 5, 7�� �Է��Ͻÿ�.
 		for (int i=0; i < arrInt.length; i++) {
			arrInt[i] = i*2+1;
		}
		
 		// length�� �迭�� �Ӽ����� �ݺ����� ���� ��, �������� �迭�� ũ�� ��� ����Ѵ�.
		System.out.println(arrInt.length);
		System.out.println("==================");
		
		// �ε����� 0������ �����ϸ�, �̷��� �����ؼ� ��Ұ��� ������ �� �ִ�.
		arrInt[0] = 100;
		arrInt[1] = 200;
		arrInt[2] = 300;
		arrInt[3] = 400;
		
		// arrInt�� 0�� �ε��� �� ���
		System.out.println(arrInt[0]);
		// arrInt�� 1�� �ε��� �� ���
		System.out.println(arrInt[1]);
		// arrInt�� 2�� �ε��� �� ���
		System.out.println(arrInt[2]);
		// arrInt�� 3�� �ε��� �� ���
		System.out.println(arrInt[3]);
		
		System.out.println("==================");
		
		// arrInt�� ���� �ִ� ��� ��Ұ��� for���� �̿��ؼ� ���� ����ϼ���.
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		System.out.println("==================");
	}
	
	public int[] me01() {
		int[] arr = {3, 6, 3, 7};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		return arr;
	}
	
	public void me0() {
		// **�迭�� ����ϴ� ����**
		// 1. �ݺ��� ����� ���ؼ� 
		// 2. ���� ���� �����͸� ��ȯ�ϱ� ���ؼ�
		
		int a0 = 3;
		int a1 = 6;
		int a2 = 3;
		int a3 = 7;
	}

}
