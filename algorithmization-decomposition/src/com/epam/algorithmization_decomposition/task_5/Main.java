package com.epam.algorithmization_decomposition.task_5;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * Декомпозиция с использованием методов (подпрограммы)
	 * 
	 * 5. Составить программу, которая в массиве A[N] находит второе по величине
	 * число (вывести на печать число, которое меньше максимального элемента
	 * массива, но больше всех других элементов).
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

		System.out.println(findOtherElement(arr) + " меньше максимального элемента массива - " + findMaxElement(arr)
				+ " но больше,чем остальные элементы массива.");

		System.out.println();

		System.out.println("Массив представлен числами:");

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
