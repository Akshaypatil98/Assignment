package com.string;

public class StringBuffOrBuild {

	public static void main(String[] args) {
		long Time = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Akshay");
		for (int i = 0; i < 10000; i++) {
			sb.append("patil");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - Time) + "ms");
		
		Time = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Akshay");
		for (int i = 0; i < 10000; i++) {
			sb2.append("patil");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - Time) + "ms");
	}
}
