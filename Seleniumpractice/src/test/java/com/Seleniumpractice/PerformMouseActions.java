package com.Seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Janhitha
 * MovetoElement or Mouseover
 * Click
 * Double click
 * Right click or Context click
 */

public class PerformMouseActions {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://opensource-demo.orangehrmlive.com/");
//	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	driver.findElement(By.id("btnLogin")).click();
//	
//	Actions actions = new Actions(driver);
//	actions
//	.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule")))
//	.moveToElement(driver.findElement(By.id("menu_admin_Organization")))
//	.moveToElement(driver.findElement(By.id("menu_admin_viewLocations")))
//	.click()
//	.perform();  // Move to Element or Mouse Over
//	driver.findElement(By.id("searchLocation_name")).sendKeys("Hyderabad"); // Double click
//	actions.doubleClick(driver.findElement(By.id("searchLocation_name"))).perform();

//	Right click or Context click
	Actions actions = new Actions(driver);
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	Thread.sleep(3000);
	actions.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//li[.='Edit']")).click();
	Thread.sleep(3000);
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
			}

}
