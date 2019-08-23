package SeleniumCommands.phuongbt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_SeleniumCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-0")).click();
		driver.findElement(By.id("exp-1")).click();
		driver.findElement(By.id("exp-2")).click();
		driver.findElement(By.id("exp-3")).click();
		driver.findElement(By.id("exp-4")).click();	
		driver.findElement(By.id("exp-5")).click();
		driver.findElement(By.id("exp-6")).click();
		
	}

}
