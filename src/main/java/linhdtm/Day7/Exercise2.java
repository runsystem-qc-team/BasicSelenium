package linhdtm.Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {
		String driverExecutablePath = "D:\\Automation test\\eclipse-workspace\\BasicSelenium\\src\\test\\resources\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		String webLink = "https://www.toolsqa.com/automation-practice-form";
		driver.get(webLink);

		// Click Accept button on cookies using xpath locator
		WebElement accptbtn = driver.findElement(By.xpath("//a[@id='cookie_action_close_header']"));
		accptbtn.click();
		Thread.sleep(2000);

		// Click Partial Link Text using Partial Link Text locator + Get text of Partial Link Text
		WebElement partlink = driver.findElement(By.partialLinkText("Partial"));
		String b = partlink.getText();
		partlink.click();
		System.out.println("text of Partial Link Text: " + b);
		Thread.sleep(2000);
		
		//Click Link Text using Link Text locator + Get text of Link Text
		WebElement linkText = driver.findElement(By.linkText("Link Test"));
		String c = linkText.getText();
		linkText.click();
		System.out.println("text of Partial Link Text: " + c);
		Thread.sleep(2000);
		
		//Input your first name in First Name textbox (using name locator)
		driver.navigate().back();
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Dinh");
		Thread.sleep(2000);
		
		//Input your last name in Last Name textbox (using id locator)
		WebElement lastName = driver.findElement(By.id("lastname"));
		lastName.sendKeys("Linh");
		Thread.sleep(2000);
		
		//Click Simple Button using xpath locator + get text
		WebElement simplebtn = driver.findElement(By.tagName("button"));
		Point sLocation = simplebtn.getLocation();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0," + (sLocation.getY() - 70 ) + ")");
		Thread.sleep(2000);
		String d = simplebtn.getText();
		simplebtn.click();
		System.out.println("Text of simple button: " + d);

		Thread.sleep(5000);
		driver.close();
	}

}
