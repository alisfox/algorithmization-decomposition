package com.epam.algorithmization_decomposition.task_2;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * Декомпозиция с использованием методов (подпрограммы)
	 * 
	 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех
	 * натуральных чисел.
	 * 
	 */

	public static int findMostCommonDividerEvklid(int a, int b) {
		int d = 0;
		while (b != 0 && a != 0) {
			if (a > b) {
				a %= b;
			} else {
				b %= a;
			}
			d = a + b;
		}
		return d;
	}

	static int findMostCommonDivider(int a, int b, int c, int d) {

		int arr[] = { a, b, c, d };
		boolean bool = false;
		int result = 0;
		int x = 0;
		int y = 1;
		for (int i = 0; i < arr.length; i++) {
			if (!bool) {
				x = arr[i];
			}
			if (y < arr.length)
				result = findMostCommonDividerEvklid(x, arr[y]);
			y++;
			bool = true;
			if (result != 1 && bool) {
				x = result;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println("Программа выводит наибольший общий делитель четырех натуральных чисел");

		System.out.println(findMostCommonDivider(36, 60, 16, 88));

	}

}
