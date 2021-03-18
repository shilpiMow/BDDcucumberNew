package com.pop.asert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopUp {
	public static WebDriver dr;
	public static void main(String[]args) {
		dr=PopUp.popup();
		
		dr.navigate().to("http://www.facebook.com");
		dr.manage().window().maximize();
	}
	
	public static WebDriver popup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\owner\\Documents\\chromedriver.exe");
		//dr.manage().window().maximize();
	    return new ChromeDriver();
	    
		
		
	}

}
