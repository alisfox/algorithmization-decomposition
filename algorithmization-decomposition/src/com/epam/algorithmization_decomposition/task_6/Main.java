package com.epam.algorithmization_decomposition.task_6;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * ƒекомпозици€ с использованием методов (подпрограммы)
	 * 
	 * 6. Ќаписать метод(методы), провер€ющий, €вл€ютс€ ли данные три числа взаимно
	 * простыми.
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

	static int findMostCommonDivider(int a, int b, int c) {

		int arr[] = { a, b, c };
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
			if (bool) {
				x = result;
			}
		}
		return result;
	}

	static void findResult(int a, int b, int c) {

		int div = findMostCommonDivider(a, b, c);
		if (div == 1) {
			System.out.println("„исла " + a + ", " + "" + b + ", " + c + " €вл€ютс€ взаимно простыми");
		} else {
			System.out.println("„исла " + a + ", " + "" + b + ", " + c + " не €вл€ютс€ взаимно простыми");
		}

	}

	public static void main(String[] args) {

		findResult(7, 14, 55);

	}

}
