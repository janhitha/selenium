package com.Seleniumpractice;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageLoadTimeout {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);  //adding page load timeout explicitly (Positive value)
//		driver.manage().timeouts().pageLoadTimeout(-5, TimeUnit.SECONDS); ////adding page load timeout explicitly (Negative value)
//		driver.manage().timeouts().pageLoadTimeout(300,TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		Instant startTime = Instant.now();
		System.out.println(startTime.toString());
		driver.get("https://www.hyrtutorials.com/");
//		driver.get("https://www.google.com/");
//		driver.get("https://www.royalmansour.com/en/");
		Instant endTime = Instant.now();
		System.out.println(endTime.toString());
		Duration duration = Duration.between(startTime, endTime);
//		System.out.println("PageLoad Time: " +duration.toMillis()  + " Milliseconds");
		System.out.println("PageLoad Time: " +duration.getSeconds() + " seconds" );
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
