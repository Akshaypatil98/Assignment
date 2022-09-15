package com.collection9;

import java.util.HashSet;
import java.util.Set;

public class Test9 {
	public static void main(String[] args) {

		Employee e1 = new Employee(201, "akshay", 1000, "sr.Enginner", "kolhapur");
		Employee e2 = new Employee(202, "sumit", 2000, "software", "amravti");
		Employee e3 = new Employee(203, "tushar", 2300, "IT", "mumbai");
		Employee e4 = new Employee(204, "akash", 5000, "Admin", "pune");
		Employee e5 = new Employee(205, "raju", 4000, "It", "pune");

		Set<Employee> list = new HashSet<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		for (Employee e : list) {
			System.out.println(e);
		}

	}
}
