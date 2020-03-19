package com.epam.algorithmization_decomposition.task_3;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * ������������ � �������������� ������� (������������)
	 * 
	 * 3. ��������� ������� ����������� �������������� �� �������� �, ���������
	 * ����� ���������� ������� ������������.
	 * 
	 */

	static double findAreaTriangleExternal(double a) {

		double area = 0.5 * Math.pow(a, 2) * Math.sin(Math.toRadians(120));

		return area;

	}

	static double findSideTriangleInternal(double a) {

		double result = (2 * Math.pow(a, 2)) - (2 * Math.pow(a, 2) * Math.cos(Math.toRadians(120)));

		double side = Math.sqrt(result);

		return side;

	}

	static double findAreaTriangleInternal(double x) {

		double area = 0.5 * Math.pow(findSideTriangleInternal(x), 2) * Math.sin(Math.toRadians(60));

		return area;

	}

	static double findAreaHexagon(double a) {

		double area = 3 * findAreaTriangleExternal(a) + findAreaTriangleInternal(a);

		return area;
	}

	public static void main(String[] args) {

		System.out.println("������� ����������� �������������� �� �������� � �����:");

		System.out.println(findAreaHexagon(4));

	}

}
