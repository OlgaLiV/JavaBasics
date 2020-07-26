package com.syntax.class28_1;

public class WebDriverTest {
	public static void main(String[] args) {
		WebDriver[] web = { new ChromeDriver("Chrome"), new FireFoxDriver("Firefox"), new SafariDriver("Safari") };

		for (WebDriver browsers : web) {
			System.out.println(browsers.getTitle());
			browsers.open();
			browsers.close();


			System.out.println("----------------");

			ChromeDriver chrome = new ChromeDriver("Chrome");
			System.out.println(chrome.getTitle());
			chrome.navigate();
			chrome.getScreenShot();

			System.out.println("***********");

			FireFoxDriver firefox = new FireFoxDriver("Firefox");
			System.out.println(firefox.getTitle());
			firefox.navigate();
			firefox.getScreenShot();

			System.out.println("***********");

			SafariDriver safari = new SafariDriver("Safari");
			System.out.println(safari.getTitle());
			safari.navigate();
			safari.getScreenShot();

			System.out.println("***********");

		}

	}
}
