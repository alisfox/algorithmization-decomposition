package com.epam.algorithmization_decomposition.task_4;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * ƒекомпозици€ с использованием методов (подпрограммы)
	 * 
	 * 4. Ќа плоскости заданы своими координатами n точек. Ќаписать метод(методы),
	 * определ€ющие, между какими из пар точек самое большое рассто€ние. ”казание.
	 *  оординаты точек занести в массив.
	 * 
	 */

	static int[] createArraySubtraction(int arr[]) {

		int changeArray[] = new int[arr.length - 1];

		for (int i = 0; i < arr.length - 1; i++) {

			changeArray[i] = arr[i + 1] - arr[i];

		}
		return changeArray;

	}

	static void findResultArraySubtraction(int arr[]) {

		int changeArray[] = createArraySubtraction(arr);

		int max = 0;
		int x = 0;
		int y = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			if (changeArray[i] > max) {
				max = changeArray[i];
				x = arr[i];
				y = arr[i + 1];
			}
		}

		System.out
				.println(max + " - это самое большое рассто€ние в заданной системе координат, находитс€ между точками "
						+ x + " и " + y);

	}

	public static void main(String[] args) {

		int arr[] = { -3, -2, 3, 4, 17, 18, 23 };
		findResultArraySubtraction(arr);
	}

}
