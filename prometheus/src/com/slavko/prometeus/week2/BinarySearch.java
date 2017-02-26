package com.slavko.prometeus.week2;

public class BinarySearch {

	public static void main(String[] args) {
		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		int numberToFind = 10;

		System.out.println(search(data, numberToFind));
	}

	public static int search(int arr[], int number){
		return search(arr, number, 0, arr.length - 1);
	}
	
	private static int search(int[] arr, int number, int from, int to) {
		if (from > to) {
			return -1;
		}

		int mid = from + (to - from) / 2;

		if (number > arr[mid]) {
			return search(arr, number, mid + 1, to);
		} else if (number < arr[mid]) {
			return search(arr, number, from, mid - 1);
		} else {
			return mid;
		}
	}

}
