package com.epam.algorithmization_decomposition.task_12;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * ������������ � �������������� ������� (������������)
	 * 
	 * 12. ���� ����������� ����� � � N. �������� �����(������) ������������ �������
	 * �, ���������� �������� �������� �����, ����� ���� ������� ����� � � �������
	 * �� ������� N.
	 * 
	 */

	static int findLengthArr(int x, int y) {

		int minElement = findMinElement(y);

		return x / minElement;

	}

	static int findMinElement(int y) {

		return y / 3;

	}

	static int[] createArr(int x, int y) {

		int sum = 0;
		int arr[] = new int[findLengthArr(x, y)];
		int i = 0;
		do {

			if (sum <= x) {

				arr[i] = (int) (Math.random() * ((y - findMinElement(y)) + 1)) + findMinElement(y);

				sum += arr[i];

				if (sum > x) {

					int t = arr[i];
					arr[i] = t - (sum - x);

				}
			}

			i++;

		} while (i < arr.length);

		return arr;

	}

	static boolean checkValue(int x, int y) {

		boolean bool = false;

		if (x > y && x > 0 && y > 0) {
			bool = true;
		}
		return bool;

	}

	static void printResult(int x, int y) {

		boolean check = checkValue(x, y);

		if (check) {
			System.out.printf(
					"��������� ������� �������� ������� ����� ������� ����� " + x + ", ������������ ������� ������ " + y
							+ ", ����������� ������� %n ��������������� ������������ ��� " + y + "/3");
			System.out.println();
			int[] arr = createArr(x, y);

			for (int i = 0; i < arr.length; i++) {

				if (arr[i] != 0)
					System.out.print(arr[i] + "\t");
			}

		} else {
			System.out.printf(
					"�������� ���� ������. ������������ ������� ������ ���� ������ �������� ����� ��������� �������, %n ��� ����� �������������.");
		}

	}

	public static void main(String[] args) {

		printResult(90, 15);

	}

}
