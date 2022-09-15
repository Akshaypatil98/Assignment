package com.collection5;

import java.util.Collections;
import java.util.Vector;

public class VectorSort {
	public static void main(String[] args) {

		Vector v1 = new Vector();
		v1.add(4);
		v1.add(2);
		v1.add(5);
		v1.add(7);
		v1.add(3);
		System.out.println("Initial Vector v1 is :" + v1);
		Collections.sort(v1);
		System.out.println("Vector v1 after sorting is :" + v1);

	}
}
