package com.collection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateAndSortAsce {
	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(2);
		al.add(4);
		al.add(34);
		al.add(34);
		al.add(76);
		al.add(54);

		Set<Integer> set = new HashSet<>();
		set.addAll(al);

		ArrayList al1 = new ArrayList<>(set);

		Collections.sort(al1);
		System.out.println(al1);

	}
}
