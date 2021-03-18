package com.practice.mou;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Locators {
	public static WebDriver driver;
	public static void main(String[] args) {
		Locators.locator();
	}
	 public static String locator() {
		 String a="";
		 System.out.println("mow");
		/*1.Xpath
		2.id
		3.name
		4.link
		5.partial link
		6.class
		7.tag
		8.CSS selector*/
		
	//	System.setProperty("webdriver.gecko.driver","C:\\Users\\owner\\Documents\\geckodriver.exe");
	//	driver= new FirefoxDriver();
	//	driver.get("https://www.facebook.com");
		//driver.findElement(By.id(id))
		return a;
		
		
		
	}
}
