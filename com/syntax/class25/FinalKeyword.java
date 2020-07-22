package com.syntax.class25;

public final class FinalKeyword {

	public static String str = "Hello";

	public static final String USERNAME = "Admin";// final always MUST to be initialized

	public final String PASSWORD = "Admin123";

	public static void main(String[] args) {
		System.out.println(str);
		str = "Hi";
		System.out.println(str);

		System.out.println(USERNAME);

		// userName = "User123"; CE: variable is final and we cannot change it
		FinalKeyword fk = new FinalKeyword();
		// fk.PASSWORD = "user123"; CE: variable is final
		fk.hello();
	}

	public final void hello() {
		System.out.println("Last \"Hello\" for today");
	}

	//class FinalBaby extends FinalKeyword {
		// final methods cannot be overridden
//		public void hello() { CE: 
//			System.out.println(" Sorry it not last \"Hello\" for today");
//		}
	}

//}
