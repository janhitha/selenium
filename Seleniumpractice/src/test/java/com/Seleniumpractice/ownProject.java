package com.Seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ownProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
   		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Java basic interview questions");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		driver.findElement(By.partialLinkText("InterviewBit")).click();
		//int size = driver.findElements(By.tagName("iframe")).size();
		//System.out.println("number of frames: " +size);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='webklipper-publisher-widget-container-notification-container']")));
		driver.findElement(By.xpath("//a[@class='close']")).click();
		
				
		
	}

	public static void highlight(WebDriver driver,WebElement element )
	{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow');", element);
	}
}
