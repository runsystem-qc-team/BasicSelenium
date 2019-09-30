package com.gmo.training.testng;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gmo.training.log4j.Log4jExample;

public class AnnotationExample {
	private static final Logger LOGGER = LogManager.getLogger(AnnotationExample.class.getName());
	
	@Test
	public void testCase1() {

		LOGGER.info("This is the Test Case 1");

	}

	@Test
	public void testCase2() {

		LOGGER.info("This is the Test Case 2");

	}

	@BeforeMethod
	public void beforeMethod() {

		LOGGER.info("This will execute before every Method");

	}

	@AfterMethod
	public void afterMethod() {

		LOGGER.info("This will execute after every Method");

	}

	@BeforeClass
	public void beforeClass() {

		LOGGER.info("This will execute before the Class");

	}

	@AfterClass
	public void afterClass() {

		LOGGER.info("This will execute after the Class");

	}

	@BeforeTest
	public void beforeTest() {

		LOGGER.info("This will execute before the Test");

	}

	@AfterTest
	public void afterTest() {

		LOGGER.info("This will execute after the Test");

	}

	@BeforeSuite
	public void beforeSuite() {

		LOGGER.info("This will execute before the Test Suite");

	}

	@AfterSuite
	public void afterSuite() {

		LOGGER.info("This will execute after the Test Suite");

	}
}
