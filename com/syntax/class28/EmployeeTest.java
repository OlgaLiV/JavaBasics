package com.syntax.class28;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee("John Smith", "QA");
		emp.setSalary(90000);
		double salary = emp.getSalary();
		System.out.println(salary);

		emp.setAge(1);
		System.out.println(emp.getAge());

		emp.setEmplId(-120);
		System.out.println(emp.getEmpId());

	}

}
