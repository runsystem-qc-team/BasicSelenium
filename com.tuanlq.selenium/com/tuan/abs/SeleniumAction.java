package com.tuan.abs;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumAction {
	protected WebDriver driver;
	protected Actions actions;
	protected JavascriptExecutor js;

	public void openMultiBrowser(String nameBrowser) {
		if (nameBrowser.equals("chrome")) {
			System.out.println("YOU CHOSED CHROME BROWSER!!");
			System.setProperty("webdriver.chrome.driver", ".\\com.tuan.selenium\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
			actions = new Actions(driver);
			js = (JavascriptExecutor) driver;
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}

		if (nameBrowser.equals("firefox")) {
			System.out.println("YOU CHOSED FIREFOX BROWSER!!");
			System.setProperty("webdriver.gecko.driver", ".\\com.tuan.selenium\\lib\\chromedriver.exe");
			driver = new FirefoxDriver();
			actions = new Actions(driver);
			js = (JavascriptExecutor) driver;
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}

	}

	public void choseBrowser(Scanner sc) {
		System.out.println("CHOSE NAME BROWSER | F | > FIREFOX  or | C | > CHROME: F / C");
		boolean check = true;
		while (check) {
			try {
				String a = sc.nextLine();
				if (a.equals("c") || a.equals("C")) {
					openMultiBrowser("chrome");
					check = false;
				} else if (a.equals("f") || a.equals("F")) {
					openMultiBrowser("firefox");
					check = false;
				} else {
					System.out.println("PLEASE INPUT F / C");
					check = true;
				}

			} catch (Exception e) {
				System.out.println("PLEASE INPUT F / C NOT INTERGER");
				sc.nextLine();
			}

		}
	}

	public void closeBrowser() {
		driver.close();
		System.out.println("CLOSE BROWSER");
	}

	public void openWebPage(String url) {
		System.out.println("OPEN WEBPAGE WITH URL: " + url);
		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public int getLength(String s) {
		return s.length();
	}

	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	public boolean isTheSame(String url, String expectedUrl) {
		if (url.equals(expectedUrl))
			return true;
		else
			return false;
	}

	public String getPageSource() {
		return driver.getPageSource();
	}

	public void clickElementByXpathDynamic(String xpath, String... dynamicValue) {
		By locator = By.xpath(String.format(xpath, (Object[]) dynamicValue));
		WebElement element = driver.findElement(locator);
		element.click();

	}

	public void clickElementByActionDynamic(String xpath, String... dynamicValue) {
		By locator = By.xpath(String.format(xpath, (Object[]) dynamicValue));
		WebElement element = driver.findElement(locator);
		actions.moveToElement(element).click().perform();

	}

	public void scrollToElement(String xpath) {
		By locator = By.xpath(xpath);
		WebElement element = driver.findElement(locator);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public String getTextElementDynamic(String xpath, String... dynamicValue) {
		try {
			By locator = By.xpath(String.format(xpath, (Object[]) dynamicValue));
			WebElement element = driver.findElement(locator);
			return element.getText();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return null;

	}

	public void inputTextboxDynamic(String xpath, String key, String... dynamicValue) {
		By locator = By.xpath(String.format(xpath, (Object[]) dynamicValue));
		WebElement element = driver.findElement(locator);
		element.sendKeys(key);
	}

	public void clickElementByXpath(String xpath) {
		By locator = By.xpath(xpath);
		try {
			WebElement element = driver.findElement(locator);
			element.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String getTextElement(String xpath) {
		By locator = By.xpath(xpath);
		WebElement element = driver.findElement(locator);
		return element.getText();
	}

	public void clickElementByJavascript(String xpath) {
		By locator = By.xpath(xpath);
		WebElement element = driver.findElement(locator);
		js.executeScript("arguments[0].click();", element);
	}

}
