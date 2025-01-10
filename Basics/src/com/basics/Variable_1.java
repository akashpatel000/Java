package com.basics;

	class Employee{
		int empID=101;
	}
	
	
	public class Variable_1 {
		
	public static void main(String[] args) {
		Employee obj1 = new Employee();
		Employee obj2=new Employee();
		
		System.out.println(obj1.empID);
		System.out.println(obj2.empID);
		
		System.out.println("________________________");
		
		System.out.println("After Modification");
		obj1.empID=102;
		
		System.out.println(obj1.empID);
		System.out.println(obj2.empID);

	}

}
