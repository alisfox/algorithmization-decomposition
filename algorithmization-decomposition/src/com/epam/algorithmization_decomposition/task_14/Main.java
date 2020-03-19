package com.epam.algorithmization_decomposition.task_14;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * Декомпозиция с использованием методов (подпрограммы)
	 * 
	 * 14. Натуральное число, в записи которого n цифр, называется числом
	 * Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу.
	 * Найти все числа Армстронга от 1 до k. Для решения задачи использовать
	 * декомпозицию.
	 * 
	 */

	static int[] findDigitsNumber(int x) {

		int arr[] = new int[findCountDigitNumber(x)];
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

	static int findCountDigitNumber(int x) {

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

	static boolean IsPositiveNumber(int x) {

		if (x > 1) {
			return true;
		}

		return false;

	}

	static boolean checkArmstrongNumber(int x) {

		int arr[] = findDigitsNumber(x);
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += Math.pow(arr[i], findCountDigitNumber(x));
		}

		if (x == sum) {
			return true;
		}

		return false;

	}

	static void printResult(int x) {

		if (IsPositiveNumber(x)) {

			System.out.println("Программа выводит числа Армстронга от 1 до " + x + ".");
			System.out.println();

			int arr[] = findArmstrongNumber(x);

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0)
					System.out.print(arr[i] + "\t");
			}
		} else {
			System.out.println("Введите целое число больше единицы.");
		}
	}

	static int[] findArmstrongNumber(int y) {

		int arr[] = new int[y];
		int arrTwo[] = new int[1000];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			if (checkArmstrongNumber(arr[i]) && j < arrTwo.length) {
				arrTwo[j] = arr[i];
				j++;
			}
		}

		return arrTwo;

	}

	public static void main(String[] args) {

		printResult(10000);

	}

}
