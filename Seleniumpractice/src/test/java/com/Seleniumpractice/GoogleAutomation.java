package com.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAutomation {

	public static void main(String[] args) throws Exception {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com");
    Thread.sleep(3000);

   
//  driver.findElement(By.linkText("See how women around the world are sharing their stories with Google Translate")).click();
//  WebElement element = driver.findElement(By.xpath("//a[contains(text(),'diversity & inclusion')]"));
//  element.click();
   

//    WebElement enterText= driver.findElement(By.name("q"));
//    enterText.sendKeys("H Y R Tutorials");
//    Thread.sleep(3000);
//    enterText.submit();
//    Thread.sleep(3000);
//    driver.get("https://www.hyrtutorials.com/");
//    Thread.sleep(3000);
//    driver.findElement(By.cssSelector("a[href='https://www.hyrtutorials.com/p/contactus.html']")).click();
//    driver.findElement(By.id("ContactForm1_contact-form-name")).sendKeys("Bagya");
//    Thread.sleep(3000);
//    driver.findElement(By.name("email")).sendKeys("bagyam@protonmail.com");
//    Thread.sleep(3000);
//    driver.findElement(By.className("contact-form-email-message")).sendKeys("Very Very thankful to you for all your selenium telugu videos");
//    Thread.sleep(3000);
//    driver.findElement(By.cssSelector("input[id ='ContactForm1_contact-form-submit']")).submit();
//    Thread.sleep(3000);
//    System.out.println(driver.findElement(By.id("ContactForm1_contact-form-submit")).getAttribute("value"));
//    Thread.sleep(5000);
      
/*    driver.findElement(By.cssSelector("input[type=\"submit\" id=\"gbqfbb\" name=\"btnI\"]")).submit(); 
      driver.findElement(By.cssSelector("input[href=\"https://about.google/?fg=1&utm_source=google-US&utm_medium=referral&utm_campaign=hp-header\" class=\"MV3Tnb\")]")).submit();
  */
	}

}

