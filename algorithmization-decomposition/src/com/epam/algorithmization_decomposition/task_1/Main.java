package com.epam.algorithmization_decomposition.task_1;

public class Main {

	/*
	 * 2. Algorithmization:
	 *
	 * ƒекомпозици€ с использованием методов (подпрограммы)
	 * 
	 * 1. Ќаписать метод(методы) дл€ нахождени€ наибольшего общего делител€ и
	 * наименьшего общего кратного двух натуральных чисел:
	 * 
	 */

	static int findMostCommonDivider(int a, int b) {
		return (b == 0) ? a : findMostCommonDivider(b, a % b);
	}

	static int findMinCommonMultiple(int a, int b) {
		return a / findMostCommonDivider(a, b) * b;
	}

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

	public static void main(String[] args) {

		System.out.println(findMostCommonDivider(8, 33));

	}

}
