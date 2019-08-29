package com.gmo.vuitt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Exam1_Firefox {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("******Exercise 1******");

		String driverExecutablePath = "C:\\Users\\MyPC\\eclipse-workspace\\Selenium\\src\\test\\resources\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverExecutablePath);

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);

		String url = "https://www.toolsqa.com/automation-practice-form/";
		driver.get(url);

		// Get the page title name and title length of page and Print page title and
		// title length in eclipse console
		String PageTitle = driver.getTitle();
		int PageLength = PageTitle.length();

		System.out.println("Title name of page is: " + PageTitle);
		System.out.println("--------------------------------------");
		System.out.println("Title length of page is: " + PageLength);
		System.out.println("--------------------------------------");

		// Get Page URL and verify if the it is a correct page opened
		System.out.println("Page URL of page: " + driver.getCurrentUrl());

		// Get Page Source (HTML Source code) and Page Source length and Print Page
		// Length on Eclipse Console
		String PageSource = driver.getPageSource();
		int PageSourceLength = PageSource.length();

		System.out.println("--------------------------------------");
		System.out.println("Page Source length of page is: " + PageSourceLength);
		System.out.println("--------------------------------------");
		Thread.sleep(3000);
		driver.close();
	}
}