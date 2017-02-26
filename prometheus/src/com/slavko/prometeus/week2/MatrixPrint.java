package com.slavko.prometeus.week2;


public class MatrixPrint {

	public static void main(String[] args) {
		int count = 1;
		int vysota = 5;
		int shyryna = 5;
		for (int i = 0; i < vysota; i++) {
			if (count <= 9) System.out.print(" ");
			for (int j = 0; j < shyryna; j++) {
				if (((i + j) == shyryna - 1) && j == 0) System.out.print(" ");
				if (i == j) System.out.print("* ");
				else if ((i + j) == 4) System.out.print("* ");
				else System.out.print(count + " ");
				
				if (count < 9 && j < shyryna - 1) System.out.print(" ");
				if ((i == j + 1) && count > 9) System.out.print(" ");
				else if (((i + j + 1) == 4) && count > 9) System.out.print(" ");
				count++;
			}
			System.out.println();
		}
	}

}
