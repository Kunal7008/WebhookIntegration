package com.testing.webhook;

public class Start {
@Test
	public void get() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNAL BHATTA\\Desktop\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://flipkart.com");
	String s=driver.getTitle();
	System.out.println(s);
}
}
