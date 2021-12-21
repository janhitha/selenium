package com.Seleniumpractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class captureSreenshotsOfWebPage {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		RemoteWebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
//		File (Chromedriver and remotewebdriver)
//		File sourceFile = driver.getScreenshotAs(OutputType.FILE);
//		File destFile =  new File("./screenshots/img.jpg");
//		FileUtils.copyFile(sourceFile, destFile);
//		System.out.println("Screenshot saved successfully");
//		driver.quit();
		
//      Byte Array
//		byte[] byteArr = driver.getScreenshotAs(OutputType.BYTES);
//		File destFile =  new File("./screenshots/img.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(byteArr);
//		fos.close();
//		System.out.println("Screenshot saved successfully");
//		driver.quit();
		
//      Base64
//		String base64code = driver.getScreenshotAs(OutputType.BASE64);
//		byte[] byteArr = Base64.getDecoder().decode(base64code);
//		File destFile =  new File("./screenshots/img.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(byteArr);
//		fos.close();
//		System.out.println("Screenshot saved successfully");
//		driver.quit();
		
//		WEBDRIVER
//		File
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile =  new File("./screenshots/img.jpg");
		FileUtils.copyFile(sourceFile, destFile);
		System.out.println("Screenshot saved successfully");
		driver.quit();
		
//      Byte Array
//		byte[] byteArr = driver.getScreenshotAs(OutputType.BYTES);
//		File destFile =  new File("./screenshots/img.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(byteArr);
//		fos.close();
//		System.out.println("Screenshot saved successfully");
//		driver.quit();
		
//      Base64
//		String base64code = driver.getScreenshotAs(OutputType.BASE64);
//		byte[] byteArr = Base64.getDecoder().decode(base64code);
//		File destFile =  new File("./screenshots/img.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(byteArr);
//		fos.close();
//		System.out.println("Screenshot saved successfully");
//		driver.quit();
	}
	

}
