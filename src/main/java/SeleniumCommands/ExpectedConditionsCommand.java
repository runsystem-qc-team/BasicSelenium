package SeleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedConditionsCommand {

	public static void main(String[] args) throws Throwable {
		String driverExecutablePath = "D:\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\executables\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", driverExecutablePath);
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		// Storing the Application Url in the String variable
		// String url = "http://www.shop.demoqa.com";
		String url = "https://mailsac.com";

		// Launch the ToolsQA WebSite
		driver.get(url);
		
		WebElement accountELement = driver.findElement(By.xpath("//input[@placeholder='anything']"));
		
		accountELement.click();
		
		accountELement.sendKeys("abcd");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary']")));
		
		element.click();
		
		Thread.sleep(3000);
		driver.close();

	}

}
