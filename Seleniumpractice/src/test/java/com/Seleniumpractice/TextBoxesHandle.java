package com.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBoxesHandle {

	public static void main(String[] args) throws Exception {
// TODO Auto-generated method stub
// Is textbox displayed
// Is textbox enabled
// enter text in textbox
// get entered text
// how to clear text entered
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://github.com/login");
	Thread.sleep(3000);
	WebElement usernameTxt = driver.findElement(By.id("login_field"));
	if(usernameTxt.isDisplayed())
	{
	        if(usernameTxt.isEnabled())
	        {
	        	usernameTxt.clear();
	        	usernameTxt.sendKeys("HYR");
	        	String enteredText = usernameTxt.getAttribute("value");
	        	System.out.println(enteredText);
	        	Thread.sleep(3000);
//	        	usernameTxt.sendKeys(" Tutorials");
        	    usernameTxt.clear();
	        }
	        else
	        	System.err.println("Username text box is not enabled");	
	}
	else
		System.err.println("Username text box is not displayed");

}
}