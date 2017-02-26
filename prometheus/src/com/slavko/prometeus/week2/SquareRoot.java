package com.slavko.prometeus.week2;

/*
Звертайте увагу на випадки, коли:

a == 0 і b !=0
a == 0 і b == 0

*/


public class SquareRoot {

	public static void main(String[] args) {
		double a = 0;
		double b = 10;
		double c = 0;

		double x1 = 0;
		double x2 = 0;
		double d = (b * b) - (4.0 * a * c);
		if (a > 0 && b > 0) {
			if (d > 0.0) {
				x1 = (-b + Math.sqrt(d)) / (2.0 * a);
				x2 = (-b - Math.sqrt(d)) / (2.0 * a);
				System.out.println("x1=" + x1);
				System.out.println("x2=" + x2);
			} else if (d == 0.0) {
				x1 = (-b / (2.0 * a));
				System.out.println("x1=" + x1);
				System.out.println("x2=" + x1);
			} else {
				System.out.println("x1=");
				System.out.println("x2=");
			}
		} else {
			System.out.println("x1=");
			System.out.println("x2=");
		}

	}

}
