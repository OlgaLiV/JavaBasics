package com.syntax.class20;

public class StudentsTest {
public static void main(String[] args) {
	Students s1 = new Students("Olga", 98,65,89);
	Students s2 = new Students("Kate", 79,65,89);
	Students s3 = new Students("Alex", 87,65,123);
	Students s4 = new Students("Michael", 48,87,89);
	Students s5 = new Students("Vlad", 98,67,100);
	
	s1.printAverage();
	s2.printAverage();
	s3.printAverage();
	s4.printAverage();
	s5.printAverage();
	System.out.println("Student " + s1.name + " has an average grade " + s1.printAverage());
	System.out.println("Student " + s2.name + " has an average grade " + s2.printAverage());
	System.out.println("Student " + s3.name + " has an average grade " + s3.printAverage());
	System.out.println("Student " + s4.name + " has an average grade " + s4.printAverage());
	System.out.println("Student " + s5.name + " has an average grade " + s5.printAverage());
}
}
