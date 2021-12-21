package com.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// how to get TagName, HTML attribute value, Text, CSS value
public class webElementProperties {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
//		Tag Name:
//		String tagName = driver.findElement(By.name("commit")).getTagName();
//		System.out.println("tag Name: " + tagName);
		
//		HTML Atrribute value:
//		String attributeValue = driver.findElement(By.name("commit")).getAttribute("type");
//		System.out.println("Attribute value: "  + attributeValue);
//		driver.quit();
//      Dynamic HTML Atrribute value:ex:login field
//		WebElement userNameTxt = driver.findElement(By.id("login_field"));
//		userNameTxt.sendKeys("abc@gmail.com");	
//		System.out.println(userNameTxt.getAttribute("value"));   
		
//		Text
//		System.out.println(driver.findElement(By.xpath("//input[@id='login_field']/preceding-sibling::label")).getText());
//		driver.quit();

//		 CSS Attribute
		System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));
		driver.quit();
		
	}

}
