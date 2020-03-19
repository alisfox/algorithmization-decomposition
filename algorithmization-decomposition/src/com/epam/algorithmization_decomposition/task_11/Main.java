package com.epam.algorithmization_decomposition.task_11;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * ������������ � �������������� ������� (������������)
	 * 
	 * 11. �������� �����(������), ������������, � ����� �� ������ ���� ����� ������
	 * ����.
	 * 
	 */

	static int findCountDigitsNumber(int x) {

		int length = 0;
		int y = 0;
		int z = 0;
		boolean singleDigit = checkNumberIsSingleDigit(x);

		if (!singleDigit) {

			do {
				y = x % 10;
				length++;
				if (y != x) {
					z = (x - y) / 10;
					x = z;
				}

			} while (x % 10 != x);

			return length + 1;
		}

		return 1;

	}

	static boolean checkNumberIsSingleDigit(int x) {

		boolean singleDigit = false;

		if (x % 10 == x) {
			singleDigit = true;
		}

		return singleDigit;

	}

	static void compareWholeNumbers(int x, int y) {

		if (findCountDigitsNumber(x) > findCountDigitsNumber(y)) {
			System.out.println("����� " + x + " �������� ������ ���� " + "(" + findCountDigitsNumber(x) + "), ��� " + y
					+ " (" + findCountDigitsNumber(y) + ").");
		}
		if (findCountDigitsNumber(y) > findCountDigitsNumber(x)) {
			System.out.println("����� " + y + " �������� ������ ���� " + "(" + findCountDigitsNumber(y) + "), ��� " + x
					+ " (" + findCountDigitsNumber(x) + ").");
		}
		if (findCountDigitsNumber(y) == findCountDigitsNumber(x)) {
			System.out.println("����� " + y + " � " + x + " �������� ���������� ���������� ���� "
					+ findCountDigitsNumber(y) + ".");
		}

	}

	public static void main(String[] args) {

		compareWholeNumbers(34, 678);

	}

}
