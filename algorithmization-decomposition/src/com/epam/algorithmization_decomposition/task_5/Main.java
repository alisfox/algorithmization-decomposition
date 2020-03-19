package com.epam.algorithmization_decomposition.task_5;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * ������������ � �������������� ������� (������������)
	 * 
	 * 5. ��������� ���������, ������� � ������� A[N] ������� ������ �� ��������
	 * ����� (������� �� ������ �����, ������� ������ ������������� ��������
	 * �������, �� ������ ���� ������ ���������).
	 * 
	 */

	static int findMaxElement(int arr[]) {
		int m = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > m) {
				m = arr[i];
			}
		}
		return m;
	}

	static int findOtherElement(int[] arr) {
		int max = findMaxElement(arr);
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != max && arr[i] > x) {
				x = arr[i];
			}
		}
		return x;
	}

	static void showResult(int arr[]) {

		System.out.println(findOtherElement(arr) + " ������ ������������� �������� ������� - " + findMaxElement(arr)
				+ " �� ������,��� ��������� �������� �������.");

		System.out.println();

		System.out.println("������ ����������� �������:");

		showArray(arr);

	}

	static void showArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + "\t");

		}

	}

	public static void main(String[] args) {

		int arr[] = { 2, 33, 1, 3, 4, 55, 333, 0 };

		showResult(arr);

	}

}
