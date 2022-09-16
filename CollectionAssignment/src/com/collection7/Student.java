package com.collection7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	int rollNo;
	String sName, className;
	int obtainedMarks;
	int totalMarks;

	// Object Constructor
	public Student() {
		super();
	}

	// Parameterized Constructor
	public Student(int rollNo, String sName, String className, int obtainedMarks, int totalMarks) {
		super();
		this.rollNo = rollNo;
		this.sName = sName;
		this.className = className;
		this.obtainedMarks = obtainedMarks;
		this.totalMarks = totalMarks;
	}

//	    @Override
//	    public int compareTo(Student o) {
//	        if (this.obtainedMarks > o.obtainedMarks)
//	            return -1;
//	        else if (this.obtainedMarks < o.obtainedMarks)
//	            return 1;
//	        else
//	            return 0;

	@Override
	public int compareTo(Student o) {
		return this.sName.compareTo(o.sName);

	}

	@Override
	public String toString() {
		return "Student name = " + sName + "\n& his/her details -->rollNo=" + rollNo + ", className=" + className
				+ ", obtainedMarks=" + obtainedMarks + ", totalMarks=" + totalMarks;
	}

	public static void main(String[] args) {
		Student s1 = new Student(2, "Rahul", "12th Std", 155, 500);
		Student s2 = new Student(5, "Prashant", "12th Std", 226, 500);
		Student s3 = new Student(9, "Ichha", "12th Std", 477, 500);
		Student s4 = new Student(7, "Pranit", "12th Std", 441, 500);
		Student s5 = new Student(21, "Kunal", "12th Std", 210, 500);
		Student s6 = new Student(17, "Basanti", "12th Std", 389, 500);
		List<Student> studList = new ArrayList<>();
		studList.add(s1);
		studList.add(s2);
		studList.add(s3);
		studList.add(s4);
		studList.add(s5);
		studList.add(s6);
		// ---------------->-a)Answer-<------------------------
		System.out.println("Question 1 answer :");
		Collections.sort(studList);
		Student student1 = studList.get(0);
		Student student2 = studList.get(1);
		Student student3 = studList.get(2);
		System.out.println("Students who secure");
		System.out
				.println("1st Posistion : " + student1.sName + " " + student1.obtainedMarks + " " + "out of 500 marks");
		System.out
				.println("2nd Posistion : " + student2.sName + " " + student2.obtainedMarks + " " + "out of 500 marks");
		System.out
				.println("3rd Posistion : " + student3.sName + " " + student3.obtainedMarks + " " + "out of 500 marks");
		System.out.println();
		// ---------------->-b)Answer-<------------------------
		System.out.println("Question 2 answer :");
		System.out.println("Students names those marks are below 50% :");

		for (Student stud : studList) {
			if (stud.obtainedMarks < 500 * 0.5) {
				System.out.println(stud.sName + " " + stud.obtainedMarks);
			}
		}
		System.out.println();

		// ---------------->-c)Answer-<------------------------
		System.out.println("Question 3 answer :");
		System.out.println("Failed Students names means those marks are below 35% :");

		for (Student stud1 : studList) {
			if (stud1.obtainedMarks < 500 * 0.35) {
				System.out.println(stud1.sName + " " + stud1.obtainedMarks);
			}
		}
		System.out.println();
//	        ---------------->-d)Answer-<------------------------
		// Using Loop To find avg of Obtained Marks
		System.out.println("Question 4 answer :");
		int totalObtainedMarks = 0;
		int avgMarks = 0;
		for (Student avg : studList) {
			totalObtainedMarks += avg.obtainedMarks;
			avgMarks = totalObtainedMarks / studList.size() + 1;

		}
		System.out.println("Average of Student Obtained Marks :" + avgMarks);

		System.out.println("\n & more than average marks obatined by Students are:");
		for (Student stud1 : studList) {
			if (stud1.obtainedMarks > avgMarks) {
				System.out.println(stud1.sName + " " + stud1.obtainedMarks);
			}
		}
		System.out.println();
		// ---------------->-e)Answer-<------------------------
		System.out.println("Question 5 answer :");

		Collections.sort(studList);
		System.out.println("All Student details with based on names names");
		for (Student stud2 : studList) {
			System.out.println(stud2);
		}
		//

	}
}
