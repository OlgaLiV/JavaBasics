package com.syntax.class19_1;
import com.syntax.class19.Employee;

public class AccessingEmployeeMembers {
public static void main(String[] args) {
	Employee emp = new Employee();
	emp.lastName = "Oliva";
	emp.name = "Luis";
	emp.displayName();
}
}
