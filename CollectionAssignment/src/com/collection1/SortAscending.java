package com.collection1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAscending {

	public static void main(String[] args) {

		List l = Arrays.asList(2, 3, 4, 5, 6, 3, 22, 45, 7, 75, 7, 55);

		Collections.sort(l);
		System.out.println(l);

	}

}
