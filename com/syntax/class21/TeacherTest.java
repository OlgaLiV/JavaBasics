package com.syntax.class21;

public class TeacherTest {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.firstName = "Natalia";
		teacher.lastName = "Meza";
		teacher.age = 40;
		teacher.yearOfExpierence = 15;
		teacher.demanded = true;
		teacher.displayTeaching();
		teacher.displayFriendship();

		MathTeacher math = new MathTeacher();
		math.firstName = "Rose";
		math.lastName = "Dowson";
		math.age = 50;
		math.yearOfExpierence = 30;
		math.demanded = true;
		math.kindOfMath = "algebra";
		math.responsibility = true;
		math.displayKnowlege();
		math.displayFriendship();
		math.displayTeaching();

		ChemistryTeacher chem = new ChemistryTeacher();
		chem.firstName = "Bob";
		chem.lastName = "Marly";
		chem.age = 35;
		chem.yearOfExpierence = 5;
		chem.demanded = false;
		chem.college = "MTU";
		chem.objectivity = true;
		chem.displayQualities();
		chem.displayFriendship();
		chem.displayTeaching();

		PianoTeacher piano = new PianoTeacher();
		piano.firstName = "Bob";
		piano.lastName = "Marly";
		piano.age = 35;
		piano.yearOfExpierence = 5;
		piano.demanded = false;
		piano.creation = true;
		piano.instrument = "piano";
		piano.displayPianoTeacher();
		piano.displayFriendship();
		piano.displayTeaching();
	}

}
