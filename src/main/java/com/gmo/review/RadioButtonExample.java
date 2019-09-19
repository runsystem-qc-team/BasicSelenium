package com.gmo.review;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) throws Throwable {
		String driverExecutablePath = "D:\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		// Create a new instance of the FireFox driver
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// Storing the Application Url in the String variable
		//String url = "http://www.shop.demoqa.com";
		String url = "https://www.toolsqa.com/automation-practice-form/";		
		
		// Launch the ToolsQA WebSite
		driver.get(url);
		
		 //Find element by link text and store in variable "Element"        		
        List<WebElement> yearsOfExperienceEle = driver.findElements(By.name("exp"));

        //This will scroll the page till the element is found		
        js.executeScript("window.scrollBy(0,1000)");
        
        Thread.sleep(2000);
        for(int i = 0; i < yearsOfExperienceEle.size(); i++) {
        	String radioButton = yearsOfExperienceEle.get(i).getAttribute("value");
        	System.out.println(radioButton);
        	if(radioButton.equalsIgnoreCase("4")) {
        		yearsOfExperienceEle.get(i).click();
        	}
        	break;
        }
        Thread.sleep(2000);
        
	}
	
	
	
}
