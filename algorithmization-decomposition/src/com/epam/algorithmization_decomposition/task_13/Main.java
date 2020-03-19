package com.epam.algorithmization_decomposition.task_13;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * Декомпозиция с использованием методов (подпрограммы)
	 * 
	 * 13. Два простых числа называются «близнецами», если они отличаются друг от
	 * друга на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из
	 * отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения
	 * задачи использовать декомпозицию.
	 * 
	 */

	static int findLengthArr(int x) {

		return ((2 * x - x) / 2) + 1;

	}

	static int[] createArrNumbersTwinsEven(int x) {

		int[] arr = new int[findLengthArr(x)];

		int k = 2 * x;

		for (int i = 0; i < arr.length; i++) {

			if (x <= k) {
				arr[i] = x;
				x = x + 2;
			}

		}

		return arr;

	}

	static int[] createArrNumbersTwinsOdd(int x) {

		int[] arr = new int[findLengthArr(x)];

		int k = 2 * x;

		for (int i = 0; i < arr.length; i++) {

			if (x < k) {
				arr[i] = x;
				x = x + 2;
			}

		}

		return arr;

	}

	static boolean checkEvenNumber(int x) {

		if (x % 2 == 0) {
			return true;
		}
		return false;

	}

	static void printResultEven(int x) {

		System.out.println("Четные числа \"близнецы\" числового ряда от " + x + " до " + (2 * x));
		System.out.println();

		int[] arr = createArrNumbersTwinsEven(x);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		System.out.println();
		System.out.println();

		System.out.println("Нечетные числа \"близнецы\" числового ряда от " + x + " до " + (2 * x));
		System.out.println();

		int[] arrTwo = createArrNumbersTwinsOdd(x + 1);
		for (int i = 0; i < arrTwo.length; i++) {
			if (arrTwo[i] < 2 * x)
				System.out.print(arrTwo[i] + "\t");

		}

	}

	static void printResultOdd(int x) {

		System.out.printf("Нечетные числа \"близнецы\" числового ряда от " + x + " до " + (2 * x) + " %n ");

		int[] arr = createArrNumbersTwinsOdd(x);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");

		}

		System.out.printf(" %n Четные числа \"близнецы\" числового ряда от " + x + " до " + (2 * x) + " %n ");

		int[] arrTwo = createArrNumbersTwinsEven(x + 1);
		for (int i = 0; i < arrTwo.length; i++) {
			if (arrTwo[i] <= 2 * x)
				System.out.print(arrTwo[i] + "\t");

		}

	}

	static void printResult(int x) {

		if (checkEvenNumber(x) && x > 2) {

			printResultEven(x);

		}

		if (!checkEvenNumber(x) && x > 2) {

			printResultOdd(x);

		}

		if (x < 2) {
			System.out.println("Введите число больше двух.");
		}

	}

	public static void main(String[] args) {

		printResult(7);
	}

}
