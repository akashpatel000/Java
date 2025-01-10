package com.basics;

class EmployeeInfo{
static String companyName="Premier";	
}

public class Variable_2 {

	public static void main(String[] args) {
		System.out.println(EmployeeInfo.companyName);
		
		System.out.println("static variable is recommeded above statement");
		
		EmployeeInfo obj=new EmployeeInfo();
		EmployeeInfo obj2=new EmployeeInfo();
		EmployeeInfo obj3=new EmployeeInfo();
		
		System.out.println(obj.companyName);
		System.out.println(obj2.companyName);
		System.out.println(obj3.companyName);
		
		System.out.println("____________________");
		
		System.out.println("After Modification");
		
		obj.companyName="Premier Steels";
		
		System.out.println(obj.companyName);
		System.out.println(obj2.companyName);
		System.out.println(obj3.companyName);
	}

}
