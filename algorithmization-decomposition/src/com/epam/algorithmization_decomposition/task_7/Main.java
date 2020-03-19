package com.epam.algorithmization_decomposition.task_7;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * Декомпозиция с использованием методов (подпрограммы)
	 * 
	 * 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных
	 * чисел от 1 до 9.
	 * 
	 */

	static int findFactorial(int t) {

		int mult = 1;

		do {

			mult *= t;
			t--;

		} while (t >= 1);

		return mult;

	}

	static int[] generateArr(int x, int y) {

		int length = y - x + 1;
		int arr[] = new int[length];
		int t = 0;
		for (int i = x; i <= y && t < length; i++) {

			arr[t] = i;
			t++;

		}
		return arr;

	}

	static int[] generateArrUneven(int x, int y) {

		int arr[] = generateArr(x, y);

		int length = 0;

		if (x % 2 == 0 || y % 2 == 0) {
			length = arr.length / 2;
		} else {
			length = arr.length / 2 + 1;
		}

		int arrTwo[] = new int[length];

		int t = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0 && t < arrTwo.length) {
				arrTwo[t] = arr[i];
				t++;
			}

		}
		return arrTwo;

	}

	static int findSumFact(int x, int y) {

		int arrUneven[] = generateArrUneven(x, y);
		int sum = 0;
		for (int i = 0; i < arrUneven.length; i++) {

			arrUneven[i] = findFactorial(arrUneven[i]);
			sum += arrUneven[i];
		}

		return sum;

	}

	static void showResultSumFact(int x, int y) {

		System.out.println(findSumFact(x, y) + " - это сумма факториалов всех нечетных чисел от " + x + " до " + y);
		System.out.println();
		System.out.println("Ряд факториалов представлен числами:");
		System.out.println();

		int arrUneven[] = generateArrUneven(x, y);

		for (int i = 0; i < arrUneven.length; i++) {
			System.out.print(arrUneven[i] + "\t");
		}

	}

	public static void main(String[] args) {

		showResultSumFact(1, 9);

	}

}
