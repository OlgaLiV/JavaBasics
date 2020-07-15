package com.syntax.class22_1;

import com.syntax.class22.Employee;
import com.syntax.class22.ScrumTeam;

public class EmployeeTest {
public static void main(String[] args) {
	Employee emp = new Employee();
	Employee.company = "Google";
	
	new ScrumTeam();
	WaterfallTeam wt = new WaterfallTeam();
	WaterfallTeam.company = "Amazon";
	
}
}
