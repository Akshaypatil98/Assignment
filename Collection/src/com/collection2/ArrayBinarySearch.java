package com.collection2;

import java.util.Arrays;
import java.util.List;

public class ArrayBinarySearch {

	public int binarySearch(Integer arr[], int x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			if (arr[m] == x)
				return m;

			if (arr[m] < x)
				l = m + 1;

			else
				r = m - 1;
		}

		return -1;
	}

	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(2, 3, 4, 10, 40);

		ArrayBinarySearch ob = new ArrayBinarySearch();

		Integer arr[] = new Integer[list.size()];

		list.toArray(arr);
		int n = arr.length;
		int x = 4;
		int result = ob.binarySearch(arr, x);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Given Element found at " + "index " + result);
	}
}
