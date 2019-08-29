package com.gmo.vuitt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Exam2_Chrome {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("******Exercise 2******");

		String driverExecutablePath = "C:\\Users\\MyPC\\eclipse-workspace\\Selenium\\src\\test\\resources\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);

		String url = "https://www.toolsqa.com/automation-practice-form/";
		driver.get(url);

		WebElement acceptButtonEle = driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]"));
		acceptButtonEle.click();

		// Get text of partialLink
		String partialLinkText = driver.findElement(By.partialLinkText("Partial Link Test")).getText();
		System.out.println("Text of partial link text is: " + partialLinkText);

		// Click Partial Link Text using Partial Link Text locator
		WebElement partialLink = driver.findElement(By.partialLinkText("Partial Link Test"));
		partialLink.click();
		Thread.sleep(8000);

		// Input your first name in First Name textbox (using name locator)
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Minh");

		// Input your first name in First Name textbox (using name locator)
		WebElement lastName = driver.findElement(By.id("lastname"));
		lastName.sendKeys("Nguyen Van");

		// Click Simple button using xpath locator
		WebElement simpleButton = driver.findElement(By.xpath("//*[@id=\"buttonwithclass\"]"));
		simpleButton.click();
		Thread.sleep(2000);

		// Get text of Simple button
		String getTextSimpleButton = driver.findElement(By.xpath("//*[@id=\"buttonwithclass\"]")).getText();
		System.out.println("Text of Simple button is: " + getTextSimpleButton);

		// Get text of Link text
		String linkTextText = driver.findElement(By.linkText("Link Test")).getText();
		System.out.println("Text of link text is: " + linkTextText);

		// Click Link Text using Link Text locator
		WebElement linkText = driver.findElement(By.linkText("Link Test"));
		linkText.click();
		Thread.sleep(5000);
		driver.close();
	}
}
