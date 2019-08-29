package com.tuan.exercise;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import com.tuan.abs.SeleniumAction;
import com.tuan.page.PageUI;

public class ExSelenium extends SeleniumAction {
	private String firstName;
	private String lastName;

	public ExSelenium(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void Exercise_01(Scanner sc) {
		choseBrowser(sc);
		openWebPage(PageUI.URL_PAGE);
		System.out.println("==> PAGE TILTE IS       : " + getPageTitle());
		System.out.println("==> PAGE TITLE LENGTH IS: " + getLength(getPageTitle()));
		System.out.println("==> CURRENT URL PAGE IS : " + getPageURL());
		if (isTheSame(getPageURL(), PageUI.URL_PAGE)) {
			System.out.println("==> 2 URL IS THE SAME");
		} else
			System.out.println("==> 2 URL IS DIFFERENT");

		System.out.println("==> PAGE SOURCE IS     : " + getPageSource());
		System.out.println("==> PAGE LENGTH IS     : " + getLength(getPageSource()));

		closeBrowser();
		System.out.println("========================== NEXT ==========================");

	}

	public void Exercise_02(Scanner sc) throws InterruptedException {
		choseBrowser(sc);
		openWebPage(PageUI.URL_PAGE);
		// click accept button
		clickElementByJavascript(PageUI.ACCEPT_BT);
		// click Partial Link
		clickElementByXpathDynamic(PageUI.LINK_TEST_LINK, "Automation Practice Form");
		// get text Partial Link Text
		getTextElementDynamic(PageUI.LINK_TEST_TEXT, "Automation Practice Form");
		System.out.println(
				"PARTIAL LINK TEXT IS: " + getTextElementDynamic(PageUI.LINK_TEST_TEXT, "Automation Practice Form"));
		// get text Link Test
		String a = getTextElementDynamic(PageUI.LINK_TEST_TEXT, "Automation Practice Form");
		System.out.println("PARTIAL LINK TEXT IS: " + a);
		// click to Link Test
		clickElementByXpathDynamic(PageUI.LINK_TEST_LINK, "Automation Practice Table");
		// Come back
		openWebPage(PageUI.URL_PAGE);
		// input FirstName
		inputTextboxDynamic(PageUI.TEXTBOX_BYNAME, firstName, "firstname");
		Thread.sleep(3000);
		// input LastName
		inputTextboxDynamic(PageUI.TEXTBOX_BYID, lastName, "lastname");
		Thread.sleep(3000);
		// click Simple Button
		clickElementByXpath(PageUI.SIMPLE_BT);
		// get text Simple Button
		System.out.println("TEXT OF SIMPLE BUTTON IS: " + getTextElement(PageUI.SIMPLE_BT));

		closeBrowser();
		System.out.println("========================== NEXT ==========================");
	}

	public void Exercise_03(Scanner sc) throws InterruptedException {
		choseBrowser(sc);
		openWebPage(PageUI.URL_PAGE);
		clickElementByJavascript(PageUI.ACCEPT_BT);
		// scrollToElement
		scrollToElement("//input[@id='lastname']");
		// select Male
		clickElementByActionDynamic(PageUI.RADIO_BT_BYID, "sex-0");
		Thread.sleep(3000);
		// select Female
		clickElementByActionDynamic(PageUI.RADIO_BT_BYID, "sex-1");
		Thread.sleep(3000);

		// select Experience
		clickElementByActionDynamic(PageUI.RADIO_BT_BYID, "exp-0");
		Thread.sleep(3000);
		clickElementByActionDynamic(PageUI.RADIO_BT_BYID, "exp-1");
		Thread.sleep(3000);
		clickElementByActionDynamic(PageUI.RADIO_BT_BYID, "exp-2");
		Thread.sleep(3000);
		clickElementByActionDynamic(PageUI.RADIO_BT_BYID, "exp-3");
		Thread.sleep(3000);
		clickElementByActionDynamic(PageUI.RADIO_BT_BYID, "exp-4");
		Thread.sleep(3000);
		clickElementByActionDynamic(PageUI.RADIO_BT_BYID, "exp-5");
		Thread.sleep(3000);
		clickElementByActionDynamic(PageUI.RADIO_BT_BYID, "exp-6");
		Thread.sleep(3000);

		closeBrowser();
		System.out.println("========================== NEXT ==========================");

	}
}
