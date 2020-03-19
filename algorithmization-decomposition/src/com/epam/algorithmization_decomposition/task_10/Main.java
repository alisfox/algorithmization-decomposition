package com.epam.algorithmization_decomposition.task_10;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * Декомпозиция с использованием методов (подпрограммы)
	 * 
	 * 10. Дано натуральное число N. Написать метод(методы) для формирования
	 * массива, элементами которого являются цифры числа N.
	 * 
	 */

	static int[] createArray(int x) {

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

		boolean singleDigit = false;

		if (x % 10 == x) {
			singleDigit = true;
		}

		return singleDigit;

	}

	static boolean IsPositiveNumber(int x) {

		boolean isPositive = false;

		if (x > 0) {
			isPositive = true;
		}

		return isPositive;

	}

	static void showArrayNumbers(int x) {

		if (IsPositiveNumber(x)) {
			System.out.println("Программа создает массив из цифр натурального числа " + x);
			System.out.println();

			int arr[] = createArray(x);

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
		} else {
			System.out.println("Число должно быть целым и больше ноля. Максимальное значение - это 2147483647.");
		}
	}

	public static void main(String[] args) {

		showArrayNumbers(214);

	}

}
