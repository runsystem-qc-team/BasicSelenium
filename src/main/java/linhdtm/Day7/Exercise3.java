package linhdtm.Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {
	public static void main(String[] args) throws InterruptedException {
		String driverExecutablePath = "D:\\Automation test\\eclipse-workspace\\BasicSelenium\\src\\test\\resources\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		String webLink = "https://www.toolsqa.com/automation-practice-form";
		driver.get(webLink);
		WebElement accptbtn = driver.findElement(By.xpath("//a[@id='cookie_action_close_header']"));
		accptbtn.click();
		Thread.sleep(2000);
		
		WebElement malebtn = driver.findElement(By.xpath("//input[@id='sex-0']"));
		WebElement femalebtn = driver.findElement(By.xpath("//input[@id='sex-1']"));
		Point location = femalebtn.getLocation();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0," + (location.getY() - 70 ) + ")");
		malebtn.click();
		Thread.sleep(1000);
		femalebtn.click();
		Thread.sleep(2000);
		
		WebElement yearEx0 = driver.findElement(By.xpath("//input[@id='exp-0']"));
		yearEx0.click();
		Thread.sleep(1000);
		WebElement yearEx1 = driver.findElement(By.xpath("//input[@id='exp-1']"));
		yearEx1.click();
		Thread.sleep(1000);
		WebElement yearEx2 = driver.findElement(By.xpath("//input[@id='exp-2']"));
		yearEx2.click();
		Thread.sleep(1000);
		WebElement yearEx3 = driver.findElement(By.xpath("//input[@id='exp-3']"));
		yearEx3.click();
		Thread.sleep(1000);
		WebElement yearEx4 = driver.findElement(By.xpath("//input[@id='exp-4']"));
		yearEx4.click();
		Thread.sleep(1000);
		WebElement yearEx5 = driver.findElement(By.xpath("//input[@id='exp-5']"));
		yearEx5.click();
		Thread.sleep(1000);
		WebElement yearEx6 = driver.findElement(By.xpath("//input[@id='exp-6']"));
		yearEx6.click();
		
		
		Thread.sleep(5000);
		driver.close();

		
	}
}
