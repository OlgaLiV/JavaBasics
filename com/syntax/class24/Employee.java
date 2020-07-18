package com.syntax.class24;

public class Employee {
double salary;

void getPaid() {// overridden method
	System.out.println("Employee gets paid salary = " + salary);
}
}

class Contructor extends Employee{
	double hourlyRate;
	void getPaid() {// overriding method
		System.out.println("Contructors gets paid hourly rate = " + hourlyRate);
	}
}

class FullTimeEmployee extends Employee{
	
}