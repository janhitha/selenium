package com.Seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import org.openqa.selenium.firefox.FirefoxDriver;

import com.microsoft.edge.seleniumtools.EdgeDriver;
import com.microsoft.edge.seleniumtools.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maximizeWindows {

	public static void main(String[] args) throws Exception {
//		Way 1 - Chrome driver
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		way 1 - Firefox driver
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		way 1 - Edge driver
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		

//		Way 2 - Chrome driver
//		WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//        WebDriver driver = new ChromeDriver(options);
//        driver.get("https://www.google.com/");
//		Way 2 - Edge driver
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://www.google.com/");
	}

}
