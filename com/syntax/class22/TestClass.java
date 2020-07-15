package com.syntax.class22;

public class TestClass {
	public static void main(String[] args) {
		
	
	ScrumTeam obj1 = new ScrumTeam();
	obj1.salary = 70000;
	obj1.ceremonies = "Scrum meetings";
	obj1.fullName = "John Doe";
	obj1.getPaid();
	obj1.attendsMeetings();
	obj1.work();
	obj1.workOnBuildingSoftware();
	
	ProductOwner obj2 = new ProductOwner();
	obj2.salary = 100000;
	obj2.ceremonies = "Scrum meetings";
	obj2.getPaid();
	obj2.attendsMeetings();
	obj2.work();
	obj2.workOnBuildingSoftware();
	obj2.communicate();
	
	ScrumMaster obj3 = new ScrumMaster();
	obj3.salary = 80000;
	obj3.ceremonies = "Scrum meetings";
	obj3.getPaid();
	obj3.attendsMeetings();
	obj3.work();
	obj3.workOnBuildingSoftware();
	obj3.shieldTeam();
	obj3.doMeetings();
	
	Developer obj4 = new Developer();
	obj4.salary = 150000;
	obj4.ceremonies = "Scrum meetings";
	obj4.getPaid();
	obj4.attendsMeetings();
	obj4.work();
	obj4.workOnBuildingSoftware();
	obj4.code();
	
	Tester obj5 = new Tester();
	obj5.salary = 120000;
	obj5.ceremonies = "Scrum meetings";
	obj5.getPaid();
	obj5.attendsMeetings();
	obj5.work();
	obj5.workOnBuildingSoftware();
	obj5.test();
	
	BuisnessAnalist obj6 = new BuisnessAnalist();
	obj6.salary = 120000;
	obj6.ceremonies = "Scrum meetings";
	obj6.getPaid();
	obj6.attendsMeetings();
	obj6.work();
	obj6.workOnBuildingSoftware();
	obj6.gatherRequirements();
	
	
	
	
	
	
}
}
