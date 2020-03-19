package com.epam.algorithmization_decomposition.task_17;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * ������������ � �������������� ������� (������������)
	 * 
	 * 17. �� ��������� ����� ����� ����� ��� ����. �� ���������� ����� ����� �����
	 * ��� ���� � �.�. ������� ����� �������� ���� ����������, ����� ��������� ����?
	 * ��� ������� ������ ������������ ������������.
	 * 
	 */

	static int[] createArrayForCheckNumber(int x) {

		int arr[] = new int[findLengthArr(x)];
		int n = arr.length - 1;
		int y = 0;
		int z = 0;

		do {
			y = x % 10;
			arr[n] = y;
			n--;
			if (y != x) {

				z = (x - y) / 10;
				x = z;

				if (x % 10 == x) {

					arr[0] = x;
				}
			}

		} while (x % 10 != x);

		return arr;

	}

	static int findLengthArr(int x) {

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

		if (x % 10 == x) {
			return true;
		}

		return false;

	}

	static int findCount(int x) {

		int t = Math.abs(x);
		int arr[] = new int[t];
		int i = 0;

		if (t == 1) {
			return 1;
		}

		if (t >= 2) {

			if (i == 0) {
				arr[i] = x;
			}

			do {

				arr[i + 1] = arr[i] - findSumDigitNumber(arr[i]);

				i++;

			} while (arr[i] != 0);

			return i;
		}
		return 0;

	}

	static int findSumDigitNumber(int x) {

		int arr[] = createArrayForCheckNumber(x);
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;

	}

	static void printResult(int x) {
		System.out.printf(" ��������� ������� ������� ����� ���������� ��������, ����� �� ��������� ����� " + x
				+ ", ������� ����� ��� ����, %n ����� ������� ����� ���� �� ������������� �����, �������� ����. ");

		System.out.printf("%n ���������� ���������� " + findCount(x) + " ��������.");
	}

	public static void main(String[] args) {

		printResult(128);

	}

}
