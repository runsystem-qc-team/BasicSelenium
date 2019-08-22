package SeleniumCommands;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitCommand {

	public static void main(String[] args) throws Throwable {
		String driverExecutablePath = "D:\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\executables\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", driverExecutablePath);
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		// Storing the Application Url in the String variable
		// String url = "http://www.shop.demoqa.com";
		String url = "https://www.toolsqa.com/automation-practice-form/";

		// Launch the ToolsQA WebSite
		driver.get(url);

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

				.withTimeout(Duration.ofSeconds(10))

				.pollingEvery(Duration.ofSeconds(5))

				.ignoring(NoSuchElementException.class);

		WebElement acceptButtonEle = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				return driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]"));

			}
		});
		//Thread.sleep(1000);
		System.out.println(acceptButtonEle);
		acceptButtonEle.click();
		Thread.sleep(3000);
		driver.close();

	}

}
