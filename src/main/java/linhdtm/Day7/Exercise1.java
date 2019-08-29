package linhdtm.Day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise1 {
	public static void main(String[] args) throws InterruptedException {
		String driverExecutablePath = "D:\\Automation test\\eclipse-workspace\\BasicSelenium\\src\\test\\resources\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverExecutablePath);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String webLink = "https://www.toolsqa.com/automation-practice-form";
		driver.get(webLink);
		
		//Get Page Title name and Title length + Print Page Title and Title length on the Eclipse Console.

		System.out.println("Tile page: " + driver.getTitle());
		System.out.println("Tile page length: " + driver.getTitle().length());
		Thread.sleep(2000);
		
		//Get Page URL and verify if the it is a correct page opened
		String a = driver.getCurrentUrl();
		if (a.equals(webLink) ) {
			System.out.println("�?ang mở đúng page");
		} else {
			System.out.println("�?ang mở sai page");
		}
		
		//Get Page Source (HTML Source code) and Page Source length
		System.out.println("Page Source : "+ driver.getPageSource());
		System.out.println("Page Source : "+ driver.getPageSource().length());

		Thread.sleep(5000);
		driver.close();
		
		
	}

}
