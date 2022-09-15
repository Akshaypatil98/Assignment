package com.collection1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsceOrder {
	public static void main(String[] args) {

		List l = Arrays.asList(2, 13, 4, 15, 6, 3, 22, 4, 7, 75, 7, 55);

		Collections.sort(l);
		System.out.println(l);

	}
}
