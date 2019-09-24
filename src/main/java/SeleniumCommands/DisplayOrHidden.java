package SeleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DisplayOrHidden {
	
	static WebDriver driver;
	
	public static boolean isPresent(String xpath) {
		try {
			driver.findElement(By.xpath(xpath));
			return true;
		} catch(NoSuchElementException e) {
			return false;
		}
	}

	public static void main(String[] args) throws Throwable {
		String driverExecutablePath = "D:\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverExecutablePath);
		// Create a new instance of the FireFox driver
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		// Storing the Application Url in the String variable
		// String url = "http://www.shop.demoqa.com";
		String url = "http://demo.guru99.com/v1/";
		
		// Launch the ToolsQA WebSite
		driver.get(url);
		
		WebElement userIDError = driver.findElement(By.xpath("//*[@id=\"message23\"]"));
		System.out.println("Status of user ID error: " + userIDError.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("Present status of user ID error: " + isPresent("//*[@id=\"message23\"]"));
		
		WebElement userIDTextbox = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		userIDTextbox.click();
		WebElement passwordTextBox = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		passwordTextBox.click();
		System.out.println("Status of user ID error: " + userIDError.isDisplayed());
		Thread.sleep(2000);

	}

}
