package SeleniumCommands.phuongbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_SeleniumCommand {

	public static void main(String[] args) throws InterruptedException {

		String driverExecutablePath = "C:\\Users\\MyPC\\eclipse-workspace\\BasicSelenium\\src\\test\\resources\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='cookie_action_close_header']")).click();
		WebElement element = driver.findElement(By.partialLinkText("Partial"));
		element.click();
		System.out.println("Text of Partial Link Text: " + element.getText());
		WebElement element1 = driver.findElement(By.linkText("Link Test"));
		element1.click();
		System.out.println("Text of link text: " + element1.getText());
		driver.findElement(By.name("firstname")).sendKeys("Phuong");
		driver.findElement(By.id("lastname")).sendKeys("Bui");
		WebElement element2 = driver.findElement(By.xpath("//button[@id='buttonwithclass']"));
		element2.click();
		System.out.println("Text of simple button: "+ element2.getText());
		
		
	}

}
