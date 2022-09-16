package com.collection8;

import java.time.LocalDate;

public class Pilot {

	public static void main(String[] args) {

		int i = 10 % 5;
		System.out.println(i);

		String[] stArr = new String[] { "xyz", "mno" };
		ProductionFacility pf = new ProductionFacility();
		ProductionFacility pf1 = new ProductionFacility(501, "pfFacility1", "kol", 10, stArr, LocalDate.now());
		ProductionFacility pf2 = new ProductionFacility(502, "pfFacility2", "pune", 12, stArr, LocalDate.now());
		ProductionFacility pf3 = new ProductionFacility(503, "pfFacility3", "Jalgaon", 13, stArr, LocalDate.now());
		System.out.println(pf);
		System.out.println(pf1);
		System.out.println(pf2);
		System.out.println(pf3);
	}

}
