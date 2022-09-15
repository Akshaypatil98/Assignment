package com.object;

public class Patient2 {
	String patientName;
	double height,weight;
	public Patient2(String patientName, double height, double weight) {
		super();
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}
	double computeBMI() {
		
		//BMI=(weight in pounds/(height in inch*height in inch))*703
		return (weight/(height*height))*703;
	}
	public static void main(String[] args) {
		Patient2 p=new Patient2("xyz",177,59);
		System.out.println(p.computeBMI());
	}

}
