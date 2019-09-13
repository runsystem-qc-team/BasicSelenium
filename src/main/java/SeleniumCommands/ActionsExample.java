package SeleniumCommands;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	public static void main(String[] args) throws Throwable {
		String driverExecutablePath = "D:\\eclipse-workspace\\AutomationTraining\\src\\test\\resources\\executables\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", driverExecutablePath);
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		// Storing the Application Url in the String variable
		// String url = "http://www.shop.demoqa.com";
		String url = "https://demoqa.com/autocomplete/";
		
		// Launch the ToolsQA WebSite
		driver.get(url);
		WebElement textbox = driver.findElement(By.xpath("//*[@id=\"tags\"]"));
		Actions actions = new Actions(driver);
		actions.keyDown(textbox, Keys.SHIFT);
		actions.sendKeys(textbox, "abcd");
		actions.keyUp(textbox,Keys.SHIFT);
		actions.contextClick(textbox);
		
		Action action = actions.build();
		action.perform();
		
		Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_LEFT);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(5000);
		driver.close();
		//actions.build().perform();

	}

}
