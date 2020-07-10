package com.syntax.class19;

public class AccessingEmployeeMembers {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "Godze";
		emp.lastName = "Doe";
		emp.age = 30;
		emp.salary = 100000;
		//emp.ssn --> wont be available because its private
		
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		//emp.displaySsn(); --> wont be available because its private
		
	}

}
