package com.gmo.vuitt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Exam3_Chrome {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("******Exercise 3******");
		String driverExecutablePath = "C:\\Users\\MyPC\\eclipse-workspace\\Selenium\\src\\test\\resources\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);

		String url = "https://www.toolsqa.com/automation-practice-form/";
		driver.get(url);

		WebElement acceptButtonEle = driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]"));
		acceptButtonEle.click();

		// Select Male and Female
		WebElement radioButtonSex0 = driver.findElement(By.id("sex-0"));
		WebElement radioButtonSex1 = driver.findElement(By.id("sex-1"));

		boolean value = false;
		value = radioButtonSex0.isSelected();
		if (!radioButtonSex0.isSelected()) {
			Thread.sleep(5000);
			radioButtonSex0.click();
			Thread.sleep(1000);
		}
		if (!radioButtonSex1.isSelected()) {
			radioButtonSex1.click();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);

		// Select Year of Experience from 1 to 7
		WebElement radioButtonEx0 = driver.findElement(By.id("exp-0"));
		WebElement radioButtonEx1 = driver.findElement(By.id("exp-1"));
		WebElement radioButtonEx2 = driver.findElement(By.id("exp-2"));
		WebElement radioButtonEx3 = driver.findElement(By.id("exp-3"));
		WebElement radioButtonEx4 = driver.findElement(By.id("exp-4"));
		WebElement radioButtonEx5 = driver.findElement(By.id("exp-5"));
		WebElement radioButtonEx6 = driver.findElement(By.id("exp-6"));

		boolean value1 = false;
		value1 = radioButtonEx0.isSelected();
		if (!radioButtonEx0.isSelected()) {
			radioButtonEx0.click();
			Thread.sleep(1000);
		}
		if (!radioButtonEx1.isSelected()) {
			radioButtonEx1.click();
			Thread.sleep(1000);
		}
		if (!radioButtonEx2.isSelected()) {
			radioButtonEx2.click();
			Thread.sleep(1000);
		}
		if (!radioButtonEx3.isSelected()) {
			radioButtonEx3.click();
			Thread.sleep(1000);
		}
		if (!radioButtonEx4.isSelected()) {
			radioButtonEx4.click();
			Thread.sleep(1000);
		}
		if (!radioButtonEx5.isSelected()) {
			radioButtonEx5.click();
			Thread.sleep(1000);
		}
		if (!radioButtonEx6.isSelected()) {
			radioButtonEx6.click();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		driver.close();
	}
}
