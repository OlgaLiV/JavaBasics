package com.syntax.class18;

public class Students {
	String studentName;
	int studentID;
	static int numberOfStudents;

	void allStudents() {
		System.out.println("The name of student is " + studentName + " and student ID is: " + studentID
				+ " and total numbers of student in class is: " + numberOfStudents);
	}

	public static void main(String[] args) {
		Students obj1 = new Students();
		obj1.studentName = "Olga";
		obj1.studentID = 282;
		numberOfStudents++;
		obj1.allStudents();
		System.out.println("*********************");

		Students obj2 = new Students();
		obj2.studentName = "Aidana";
		obj2.studentID = 111;
		numberOfStudents++;
		obj2.allStudents();
		System.out.println("*********************");

		Students obj3 = new Students();
		obj3.studentName = "Dinara";
		obj3.studentID = 222;
		numberOfStudents++;
		obj3.allStudents();

	}

}
