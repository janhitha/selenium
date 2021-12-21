package com.Seleniumpractice;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OwnProject {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
    	WebDriver driver =new ChromeDriver();
//		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://outlook.live.com/owa/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign')]")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bhanu.qa@hotmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("R011@madugu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit' and @id='idSIButton9']")).submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit' and @id='idSIButton9']")).submit();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'Folders')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'Inbox')]")).click();
//		
		driver.findElement(By.xpath("//span[contains(text(),'New message')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[role=combobox]")).sendKeys("bagyam@pm.me");
//		driver.findElement(By.cssSelector("input.ms-BasePicker-input[aria-label=To]")).sendKeys("bagyam@pm.me");
//		driver.findElement(By.xpath("input.ms-BasePicker-input[role=combobox]")).sendKeys("bagyam@pm.me");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@maxlength=255]")).sendKeys("hi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("how are you");
		
		
		highlight(driver,driver.findElement(By.cssSelector("i.root-214[data-icon-name=Send]")));
		driver.
//		driver.findElement(By.xpath("//button[@type='button' and @title='Send (Ctrl+Enter)' and @aria-label='Send' and @aria-describedby='sendSplitButton509']")).click();
//	    driver.findElement(By.xpath("span#id__678")).click();
//	    driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
       
		
//	   
//		driver.get("https://protonmail.com/");
//		driver.findElement(By.xpath("//a[contains(text(),'LOG IN')]")).click();
//  		Thread.sleep(3000);
//		driver.findElement(By.id("username")).sendKeys("bagyam@protonmail.com");
//		driver.findElement(By.id("password")).sendKeys("R011@madugu");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		driver.get("https://protonmail.com/");
//		driver.findElement(By.xpath("//a[contains(text(),'LOG IN')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[starts-with(text(),'Create')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("username")).sendKeys("bagyam@protonmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.id("password")).sendKeys("R011@madugu");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector(".button[aria-describedby=tooltip-7]")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'New message')]")).click();
//		driver.findElement(By.xpath("//button[starts-with(text(),'New')]")).click();
//		driver.findElement(By.xpath("//body//div//button[@data-testid='sidebar:compose' and @type='button' and @aria-describedby='tooltip-7']")).click();
//		Thread.sleep(6000);
//		
//		driver.findElement(By.xpath("//input[@data-testid='composer:to']")).sendKeys("jayachandra.raju@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Reg:Jaanu field trip enrollment");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@id='squire']/div[1]")).sendKeys("Hi Jaya, Need to enroll for Jaanu field trip by today evening");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@id='squire']/div[2]")).sendKeys("Thanks & Regards");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'Send')]")).submit();
//		driver.get("https://www.youtube.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='search' and @placeholder='Search']")).sendKeys("Sanath nagar steel factory home delivery");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@id='search-icon-legacy']/yt-icon")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a/yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//div[@class='button-container style-scope ytd-mealbar-promo-renderer']/ytd-button-renderer[1]")).click();
//		driver.get("http://www.demo.guru99.com/V4/");
//		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr359097");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gYtAmyd");
//		driver.findElement(By.xpath("//input[@name='btnLogin' and @type='submit']")).click();
//		TakesScreenshot takesscreenshot = (TakesScreenshot) driver;
//		File sourcefile = takesscreenshot.getScreenshotAs(OutputType.FILE);
//		File targetfile = new File("./screenshots/img.jpg");
//		FileUtils.copyFile(sourcefile, targetfile);
//		System.out.println("screenshot saved successfully");
//		
				
		}

	public static void highlight(WebDriver driver,WebElement element )
	{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow');", element);
	}
}
