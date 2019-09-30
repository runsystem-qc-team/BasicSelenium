package com.gmo.training.testng;

import org.testng.annotations.Test;

import com.gmo.training.log4j.Log4jExample;

import org.testng.annotations.BeforeMethod;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
  private static final Logger LOGGER = LogManager.getLogger(Log4jExample.class.getName());
  public WebDriver driver;
  
  @Test
  public void loginToGuru99() throws Throwable {  
        
      WebElement textboxUserIdEle = driver.findElement(By.xpath("//input[@name='uid']"));  
      LOGGER.info("Click UserID textbox");  
      textboxUserIdEle.click();  
      LOGGER.info("Input a user id in the textbox");  
      textboxUserIdEle.sendKeys("mngr220422");  
      LOGGER.info("Input the user id successfully");  
        
      WebElement textboxPasswordEle = driver.findElement(By.xpath("//input[@name='password']"));  
      LOGGER.info("Click Password textbox");  
      textboxPasswordEle.click();  
      LOGGER.info("Input a password in the textbox");  
      textboxPasswordEle.sendKeys("ehUjezu");  
      LOGGER.info("Input the password successfully");  
        
      WebElement buttonLoginEle = driver.findElement(By.xpath("//input[@name='btnLogin']"));  
      LOGGER.info("Click Login button");  
      buttonLoginEle.click();   
  }
  @BeforeMethod
  public void setUp() throws Throwable {
	  LOGGER.debug("Open Chrome browser");  
      String driverExecutablePath = "D:\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\executables\\chromedriver.exe";  
        
      System.setProperty("webdriver.chrome.driver", driverExecutablePath);  
      // Create a new instance of the FireFox driver  
      driver = new ChromeDriver();  
        
      LOGGER.debug("Open Chrome browser successfully");  
      driver.manage().window().maximize();  
      Thread.sleep(1000);  
      // Storing the Application Url in the String variable  
      //String url = "http://www.shop.demoqa.com";  
      LOGGER.info("Open Url: http://demo.guru99.com/v1/");  
      String url = "http://demo.guru99.com/v1/";        
        
      // Launch the ToolsQA WebSite  
      driver.get(url);
  }

  @AfterMethod
  public void tearDown() {
	  LOGGER.info("Close Browser");  
      driver.close();
  }

}
