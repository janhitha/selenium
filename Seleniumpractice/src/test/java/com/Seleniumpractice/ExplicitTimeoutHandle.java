package com.Seleniumpractice;

import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitTimeoutHandle {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1000, 1000));
		WebDriverWait wait= new WebDriverWait(driver, 10); //Explicit wait object created
		driver.get("https://testproject.io/");
		String parentWindowHandle = driver.getWindowHandle();
		driver.findElement(By.linkText("Login")).click();
		Set<String> windowHandles = driver.getWindowHandles();
//Using ExpectedConditions - 
		for(String windowHandle : windowHandles)
		{
		  if(!windowHandle.equals(parentWindowHandle))	
		  {
			 driver.switchTo().window(windowHandle);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
			 driver.findElement(By.id("username")).sendKeys("HYR Tutorials");
			 
		  } 
		  
		} 

//		Using Function interface
//		for(String windowHandle : windowHandles)
//		{
//		  if(!windowHandle.equals(parentWindowHandle))	
//		  {
//			 driver.switchTo().window(windowHandle);
//             Function<WebDriver, Boolean> f = new Function<WebDriver, Boolean>() {
//				
//				public Boolean apply(WebDriver WebDriver) {
//					// TODO Auto-generated method stub
//					return WebDriver.findElement(By.id("username")).isDisplayed();
//				}
//			};
//			 Wait until(d->d.findElement(By.id("username")));
////			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
//			 driver.findElement(By.id("username")).sendKeys("HYR Tutorials");
//			 
//		  } 
//		  
//		} 
	
	} 
	

} 
			

		




