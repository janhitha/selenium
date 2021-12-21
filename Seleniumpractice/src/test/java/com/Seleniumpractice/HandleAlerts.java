package com.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        Thread.sleep(3000);
//        //alert box
//        System.out.println(driver.findElement(By.id("output")).getText());
//        driver.findElement(By.id("alertBox")).click();
//        Thread.sleep(3000);
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().accept();
//        Thread.sleep(3000);
//        System.out.println(driver.findElement(By.id("output")).getText());
//        // Confirmation box
//        System.out.println(driver.findElement(By.id("output")).getText());
//        driver.findElement(By.id("confirmBox")).click();
//        Thread.sleep(3000);
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().accept();        
//        Thread.sleep(3000);
//        System.out.println(driver.findElement(By.id("output")).getText());
//        driver.findElement(By.id("confirmBox")).click();
//        Thread.sleep(3000);
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().dismiss();        
//        Thread.sleep(3000);
//        System.out.println(driver.findElement(By.id("output")).getText());
//        //promt box
      System.out.println(driver.findElement(By.id("output")).getText());
      driver.findElement(By.id("promptBox")).click();
      Thread.sleep(3000);
      System.out.println(driver.switchTo().alert().getText());
      driver.switchTo().alert().sendKeys("HYR Tutorials");
      driver.switchTo().alert().accept();
      Thread.sleep(3000);
      System.out.println(driver.findElement(By.id("output")).getText());
      driver.findElement(By.id("promptBox")).click();
      Thread.sleep(3000);
      System.out.println(driver.switchTo().alert().getText());
      driver.switchTo().alert().dismiss();        
      Thread.sleep(3000);
      System.out.println(driver.findElement(By.id("output")).getText());
      Thread.sleep(3000);
      driver.quit();
	}

}
