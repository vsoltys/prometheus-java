package com.slavko.prometeus.week2;

public class ArraySort {

	public static void main(String[] args) {
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]){
					int tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}
			}
		}
				
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
