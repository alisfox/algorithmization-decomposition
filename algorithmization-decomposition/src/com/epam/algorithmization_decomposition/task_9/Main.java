package com.epam.algorithmization_decomposition.task_9;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

	/*
	 * 2. Algorithmization:
	 * 
	 * ������������ � �������������� ������� (������������)
	 * 
	 * 9. ���� ����� X, Y, Z, � � ����� ������ ����������������. ��������
	 * �����(������) ���������� ��� �������, ���� ���� ����� ��������� ������ X � Y�
	 * ������.
	 * 
	 */

	static double findAreaTriangleUseAngle(double x, double y) {

		double area = 0.5 * x * y;

		return area;

	}

	static double findSideStraightHeadedTriangle(double x, double y) {

		double z = Math.pow(x, 2) + Math.pow(y, 2);

		double side = Math.sqrt(z);

		return side;

	}

	static double findAreaTriangleUseSide(double x, double y, double z) {

		double halfPerimeter = (x + y + z) / 2;
		double result = halfPerimeter * (halfPerimeter - x) * (halfPerimeter - y) * (halfPerimeter - z);
		double area = Math.sqrt(result);

		return area;

	}

	static double findAreaQuadrangle(double x, double y, double z, double c) {

		double areaOneTriangle = findAreaTriangleUseAngle(x, y);
		double side = findSideStraightHeadedTriangle(x, y);
		double areaTwoTrianle = findAreaTriangleUseSide(z, c, side);
		double result = areaOneTriangle + areaTwoTrianle;

		return result;

	}

	static void printResult(double x, double y, double z, double c) {

		System.out.printf(
				"��������� ������� ��������� ���������� ������� ����������������, ��������� ����� ��� ������, ������ ��� %n ��������� - ��� ����� ������, ����� �������� ���� ������.");
		System.out.printf("������� ���������������� �� ��������� %n " + x + ", " + y + ", " + z + ", " + c + " ����� "
				+ roundResult(findAreaQuadrangle(x, y, z, c)));

	}

	static double roundResult(double x) {

		double result = new BigDecimal(x).setScale(3, RoundingMode.UP).doubleValue();

		return result;

	}

	public static void main(String[] args) {

		printResult(4, 3, 2, 5);

	}

}
