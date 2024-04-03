package org.subash;

public class CompanyDetails {

	private void companyname() {
		System.out.println("The Company Name is TCS");
	}
	private void companyloc() {
		System.out.println("Company is located in Siruseri");
	}
	private void companyproject() {
		System.out.println("Company Working on Management System Project");
	}
	
	public static void main (String[]args) {
		CompanyDetails cd = new CompanyDetails();
		cd.companyname();
		cd.companyloc();
		cd.companyproject();
		
}
}
