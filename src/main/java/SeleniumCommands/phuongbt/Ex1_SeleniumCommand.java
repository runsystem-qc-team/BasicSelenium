package SeleniumCommands.phuongbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex1_SeleniumCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driverExecutablePath = "C:\\Users\\MyPC\\eclipse-workspace\\BasicSelenium\\src\\test\\resources\\executables\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", driverExecutablePath);
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.toolsqa.com/automation-practice-form";
		driver.get(url);
		 String title = driver.getTitle();
		 int titleLength = driver.getTitle().length();
		 System.out.println("Title of the page is : " + title);
		 System.out.println("Length of the title is : "+ titleLength);
		 
		 String actualUrl = driver.getCurrentUrl();
		 if (actualUrl.equals(url)){
			 System.out.println("Verification Successful - The correct Url is opened.");
		 }else {
			 System.out.println("Verification Failed - An incorrect Url is opened.");
		 }
		 System.out.println("Actual URL is : " + actualUrl);  
		 System.out.println("Expected URL is : " + url); 

	
		 String pageSource = driver.getPageSource();
		 
		 int pageSourceLength = pageSource.length(); 
		 
		 System.out.println("Total length of the Page Source is : " + pageSourceLength);
		 
		 driver.close();  
		
		
	}

}
