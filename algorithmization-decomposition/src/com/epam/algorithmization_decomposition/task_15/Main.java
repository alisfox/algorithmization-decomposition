package com.epam.algorithmization_decomposition.task_15;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * Декомпозиция с использованием методов (подпрограммы)
	 * 
	 * 15. Найти все натуральные n-значные числа, цифры в которых образуют строго
	 * возрастающую последовательность (например, 1234, 5789). Для решения задачи
	 * использовать декомпозицию.
	 * 
	 */

	static int findMinElement(int n) {

		return (int) Math.pow(10, n - 1);

	}

	static int findMaxElement(int n) {

		return (int) Math.pow(10, n) - 1;

	}

	static int[] createArrayNumbersPowN(int n) {

		int min = findMinElement(n);
		int max = findMaxElement(n);
		int arr[] = new int[max - min + 1];

		for (int i = 0; i < arr.length; i++) {

		}

		return arr;

	}

	static int[] createArrayNumbersPowNIncreasing(int n) {

		int min = findMinElement(n);
		int max = findMaxElement(n);
		int arr[] = createArrayNumbersPowN(n);
		int arrIncreasing[] = new int[arr.length];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {

			if (min <= max)
				arr[i] = min;

			if (checkNumberForAscendingDigits(arr[i], n)) {
				arrIncreasing[j] = arr[i];
				j++;
			}
			min++;
		}

		return arrIncreasing;

	}

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

	static boolean checkNumberForAscendingDigits(int t, int n) {

		int arr[] = createArrayForCheckNumber(t);
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] > arr[i]) {
				k++;
			}

			if (k == n - 1) {
				return true;
			}
		}
		return false;

	}

	static void printResult(int n) {

		if (n > 1 && n <= 8) {
			System.out.println("Программа создает массив из натуральных " + n + "-значных чисел промежутка от "
					+ findMinElement(n) + " до " + findMaxElement(n)
					+ " цифры которых образуют строго возрастающую последовательность");
			System.out.println();
			int arr[] = createArrayNumbersPowNIncreasing(n);

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0)
					System.out.print(arr[i] + "\t");
			}
		} else {
			System.out.println("Неверный ввод. Степень числа может принимать значение от 2 до 8.");
		}
	}

	public static void main(String[] args) {

		printResult(3);

	}


}
