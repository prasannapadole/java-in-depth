package com.semanticsquare.polymorphism.methodbinding;

public class Test {
	public static void main(String[] args) {
		 /* Create a Manager object and assign its reference to a
		 variable emp of the Employee type
		 */
		 Employee emp = new Manager();

		 /* Call the setSalary() method */
		//Understanding Method Binding in Java By Kishori Sharan
		 int salary = 12000;
		 emp.setSalary(salary); /* Which setSalary() method is called.
		 Employee.setSalary() or Manager.setSalary() */
		 System.out.println(System.out);
		 }
}
