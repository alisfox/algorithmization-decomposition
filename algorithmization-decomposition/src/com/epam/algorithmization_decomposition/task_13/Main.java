package com.epam.algorithmization_decomposition.task_13;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * ������������ � �������������� ������� (������������)
	 * 
	 * 13. ��� ������� ����� ���������� �����������, ���� ��� ���������� ���� ��
	 * ����� �� 2 (��������, 41 � 43). ����� � ���������� ��� ���� ���������� ��
	 * ������� [n,2n], ��� n - �������� ����������� ����� ������ 2. ��� �������
	 * ������ ������������ ������������.
	 * 
	 */

	static int findLengthArr(int x) {

		return ((2 * x - x) / 2) + 1;

	}

	static int[] createArrNumbersTwinsEven(int x) {

		int[] arr = new int[findLengthArr(x)];

		int k = 2 * x;

		for (int i = 0; i < arr.length; i++) {

			if (x <= k) {
				arr[i] = x;
				x = x + 2;
			}

		}

		return arr;

	}

	static int[] createArrNumbersTwinsOdd(int x) {

		int[] arr = new int[findLengthArr(x)];

		int k = 2 * x;

		for (int i = 0; i < arr.length; i++) {

			if (x < k) {
				arr[i] = x;
				x = x + 2;
			}

		}

		return arr;

	}

	static boolean checkEvenNumber(int x) {

		if (x % 2 == 0) {
			return true;
		}
		return false;

	}

	static void printResultEven(int x) {

		System.out.println("������ ����� \"��������\" ��������� ���� �� " + x + " �� " + (2 * x));
		System.out.println();

		int[] arr = createArrNumbersTwinsEven(x);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		System.out.println();
		System.out.println();

		System.out.println("�������� ����� \"��������\" ��������� ���� �� " + x + " �� " + (2 * x));
		System.out.println();

		int[] arrTwo = createArrNumbersTwinsOdd(x + 1);
		for (int i = 0; i < arrTwo.length; i++) {
			if (arrTwo[i] < 2 * x)
				System.out.print(arrTwo[i] + "\t");

		}

	}

	static void printResultOdd(int x) {

		System.out.printf("�������� ����� \"��������\" ��������� ���� �� " + x + " �� " + (2 * x) + " %n ");

		int[] arr = createArrNumbersTwinsOdd(x);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");

		}

		System.out.printf(" %n ������ ����� \"��������\" ��������� ���� �� " + x + " �� " + (2 * x) + " %n ");

		int[] arrTwo = createArrNumbersTwinsEven(x + 1);
		for (int i = 0; i < arrTwo.length; i++) {
			if (arrTwo[i] <= 2 * x)
				System.out.print(arrTwo[i] + "\t");

		}

	}

	static void printResult(int x) {

		if (checkEvenNumber(x) && x > 2) {

			printResultEven(x);

		}

		if (!checkEvenNumber(x) && x > 2) {

			printResultOdd(x);

		}

		if (x < 2) {
			System.out.println("������� ����� ������ ����.");
		}

	}

	public static void main(String[] args) {

		printResult(7);
	}

}
