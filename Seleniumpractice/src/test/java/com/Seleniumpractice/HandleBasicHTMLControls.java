package com.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

// how to handle links,buttons,radio and checkboxes by using selenium webdriver

public class HandleBasicHTMLControls {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hindichbx")).click();
		Thread.sleep(3000);
//		driver.findElement(By.id("chinesechbx")).click();
//		Thread.sleep(3000);
		WebElement chineeseChkbox = driver.findElement(By.id("chinesechbx"));
		chineeseChkbox.click(); //check
		Thread.sleep(3000);
		if(chineeseChkbox.isSelected())
		chineeseChkbox.click(); //uncheck
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);	
		driver.findElement(By.id("clearbtn")).click();
		Thread.sleep(3000);			
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		Thread.sleep(3000);

	}
	
}
