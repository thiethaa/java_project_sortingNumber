package com.sorting;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {

		int[] arr = { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };
		
		sortAscending(arr);
		sortDescending(arr);
		System.out.println("\n");
		sortCollection(arr);

	}

	public static void sortCollection(int[] array) {
		Arrays.sort(array);
		System.out.println("sort collection:" + Arrays.toString(array));
	}

	public static void sortAscending(int[] array) {
		if (array != null || array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array.length; j++) {
					int tmp = 0;
					if (array[i] < array[j]) {
						tmp = array[i];
						array[i] = array[j];
						array[j] = tmp;
					}
				}
			}
		}
		System.out.println("sort descending:" + Arrays.toString(array));
	}

	public static void sortDescending(int[] array) {
		if (array != null || array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array.length; j++) {
					int tmp = 0;
					if (array[i] > array[j]) {
						tmp = array[i];
						array[i] = array[j];
						array[j] = tmp;
					}
				}
			}
		}
		System.out.println("sort ascending:" + Arrays.toString(array));
	}

}
