package com.syntax.class18;

public class Employee {
static String CEO = "Sumair";
int eID;
double salary;

void display() {
	System.out.println("The employee ID is: " + eID + " salary is: " + salary + " and CEO is: " + CEO);
}

public static void main(String[] args) {
	Employee obj1 = new Employee();
	obj1.eID = 345567;
	obj1.salary = 120000;
	obj1.display();
	
	Employee obj2 = new Employee();
	obj2.eID = 6654322;
	obj2.salary = 150000;
	obj2.display();
	
	
}
}
