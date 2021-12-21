package com.Seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class urlTitlePagesource {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org");
		
//		URL
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println("current URL: " + currentUrl);
//      Title
//		String title = driver.getTitle();
//		System.out.println("Title is: " + title);
//		driver.quit();
		
//		HTML pagesource
		String pageSource = driver.getPageSource();
		System.out.println("Pagesource is: " + pageSource);
		driver.quit();
	}

}
