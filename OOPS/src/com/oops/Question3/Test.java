package com.oops.Question3;

public class Test {
	public static void main(String[] args) {
		Branch branch=new Branch("1", "idbi bank", " pune");
		Customer customer=new Customer("1", "xyz", "katrj", "8 jully", "9 dec", branch);
		Customer_Account_Statement cad=new Customer_Account_Statement("1", "32618", "12500", "4300", "4 aug");
		branch.BranchDisplay();
		customer.CustomerDisplay();
		cad.customerDisplay();
		
	}

}
