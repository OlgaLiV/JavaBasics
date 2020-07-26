package com.syntax.class28_1;

public interface WebDriver {
	String getTitle();

	void open();

	void close();
}

interface RemoteWebDriver extends WebDriver {
	void navigate();
}

interface TakesScreenShot extends RemoteWebDriver {
	void getScreenShot();
}

class ChromeDriver implements RemoteWebDriver {
	public String title;

	public ChromeDriver(String title) {
		this.title = title;
	}

	public void navigate() {
		System.out.println("You can easy navigate through Chrome");
	}

	public void open() {
		System.out.println("Crome is open");
	}

	public void close() {
		System.out.println("Crome is close");
	}

	public void getScreenShot() {
		System.out.println("To get a screenshot you should press shift + cmd + 3");
	}

	public String getTitle() {
		return title;
	}
}

class FireFoxDriver implements RemoteWebDriver {
	public String title;

	public FireFoxDriver(String title) {
		this.title = title;
	}

	public void navigate() {

		System.out.println("You can easy navigate through Firefox");
	}

	public void open() {
		System.out.println("Firefox is open");
	}

	public void close() {
		System.out.println("Firefox is close");
	}

	public void getScreenShot() {
		System.out.println("To get a screenshot you should press shift + cmd + 3");
	}

	public String getTitle() {
		return title;
	}
}

class SafariDriver implements RemoteWebDriver {
	public String title;

	public SafariDriver(String title) {
		this.title = title;
	}

	public void navigate() {
		System.out.println("You can easy navigate through Safari");
	}

	public void open() {
		System.out.println("Safari is open");
	}

	public void close() {
		System.out.println("Safari is close");
	}

	public void getScreenShot() {
		System.out.println("To get a screenshot you should press shift + cmd + 3");
	}

	public String getTitle() {
		return title;
	}
}
