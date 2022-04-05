package com.testNg;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testNgAnnotations {

	public WebDriver driver;

	@Test(priority=0)
	public void ValidatePageLoadSuccessfully() {
		System.out.println("InsideTestCase1");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
	}

	@Test(priority=1)
	public void TestCase2() {
		System.out.println("TestCase2");
	}

	/*
	 * @Test(priority=3) public void TestCase3() { System.out.println("TestCase3");
	 * }
	 * 
	 * @Test(priority=4) public void TestCase4() { System.out.println("TestCase4");
	 * }
	 * 
	 * @Test(priority=5) public void TestCase5() { System.out.println("TestCase5");
	 * }
	 * 
	 * @Test(priority=6) public void TestCase6() { System.out.println("TestCase6");
	 * }
	 */

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Inside AfterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Inside BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Inside AfterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Inside BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Inside AfterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Inside BeforeSuite");
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Baby toys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		/* driver.close(); */
	}

	@AfterSuite
	public void afterSuite() {
	}

}
