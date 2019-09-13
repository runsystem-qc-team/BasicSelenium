package SeleniumCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyWaitCommand {

	public static void main(String[] args) throws Throwable {
		String driverExecutablePath = "D:\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		// Create a new instance of the FireFox driver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		// Storing the Application Url in the String variable
		// String url = "http://www.shop.demoqa.com";
		String url = "https://www.toolsqa.com/automation-practice-form/";

		// Launch the ToolsQA WebSite
		driver.get(url);
		
		WebElement acceptButtonEle = driver.findElement(By.xpath("//*[@id=\"cookie_action_close_heade\"]"));
		
		acceptButtonEle.click();
		
		Thread.sleep(3000);
		driver.close();

	}

}
