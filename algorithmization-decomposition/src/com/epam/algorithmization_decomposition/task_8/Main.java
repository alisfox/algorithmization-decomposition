package com.epam.algorithmization_decomposition.task_8;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * Декомпозиция с использованием методов (подпрограммы)
	 * 
	 * 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] +
	 * D[4] + D[5]; D[4] +D[5] +D[6].Пояснение: составить метод (методы) для
	 * вычисления суммы трех последовательно расположенных элементов массива с
	 * номерами от k до m.
	 * 
	 */

	static boolean checkElementsArr(int arr[], int x) {

		boolean check = false;
		int k = 0;
		int t = 0;

		if ("+".equals(checkValue(arr, x))) {
			do {
				check = (arr[x] == 0);
				x++;
				k++;

				if (check) {
					t++;
				}

				if (t == 3) {
					check = true;
				}

			} while (k <= 3);
		}

		return check;

	}

	static String checkValue(int arr[], int x) {

		String result = "+";

		if (x > arr.length - 3 || x < 0) {
			result = "Heверно введен индекс элемента массива, начиная с которого необходимо получить сумму трех элементов, он может принимать значения от 0 до "
					+ (arr.length - 3);
		}

		return result;

	}

	static int findSumThreeElements(int arr[], int x) {

		boolean bool = false;

		if ("+".equals(checkValue(arr, x))) {
			bool = true;
		}

		int sum = 0;
		int k = x;

		if (bool) {
			do {
				sum += arr[x];
				x++;
			} while (x < (k + 3));
		}

		return sum;

	}

	static void showResult(int arr[], int x) {

		int result = findSumThreeElements(arr, x);

		if (result > 0 || checkElementsArr(arr, x)) {
			System.out.println("Результат вычисления суммы элементов массива с индексами с " + x + " по " + (x + 2)
					+ " равен: " + result);
		} else {
			System.out.println(checkValue(arr, x));
		}

	}

	public static void main(String[] args) {

		int arr[] = { 0, 90, 0, 0, 0, 7, 9, 4, 2 };

		showResult(arr, 0);

	}


}
