package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Student {
	String name, studentID;
	
	public Student(String name, String studentID) {
		this.name = name;
		this.studentID = studentID;
	}
	
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		students.add(new Student("Olga", "0001"));
		students.add(new Student("Alex", "0002"));
		students.add(new Student("Vlad", "0003"));
		students.add(new Student("Michael", "0004"));
		students.add(new Student("Natalia", "0005"));
		
		Iterator<Student> itStudent = students.iterator();
		while(itStudent.hasNext()) {
			Student st = itStudent.next();
			System.out.println(st.name);
		}
	}
}
