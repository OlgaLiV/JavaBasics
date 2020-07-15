package com.syntax.class22_1;

import com.syntax.class22.Employee;

public class WaterfallTeam extends Employee {
	public void doSlowWork() {

	}

	public static void main(String[] args) {
		WaterfallTeam wt = new WaterfallTeam();
		WaterfallTeam.company = "Instagram";
		wt.fullName = "John Snow";// protected variable is accessible in different classes thought inheritance
		System.out.println(wt.fullName);
		Employee emp = new Employee();
		emp.work();
	}
}
