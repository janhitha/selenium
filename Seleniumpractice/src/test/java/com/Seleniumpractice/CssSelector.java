package com.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

/* CSS Selectors 4 types
 * Tag and ID (OR) #id
 * Tag and Class (OR) .Class
 * Tag and Attribute (OR) [Attribute=Value]
 * Tag, Class and attribute (OR) Tag.class[Attribute=Value] 
 */
public class CssSelector {

	public static void main(String[] args) throws Exception {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
//  Thread.sleep(3000);
  
//  1. Tag and ID (OR) #ID (OR) tag#id
//  driver.findElement(By.cssSelector("input#email")).sendKeys("abc@hotmail.com");  // Method 1
//  Thread.sleep(3000);
//  driver.findElement((By.cssSelector("input#email"))).clear();
//  driver.findElement(By.cssSelector("#email")).sendKeys("def@hotmail.com"); // Method 2
//  Thread.sleep(3000);
//  driver.findElement((By.cssSelector("#email"))).clear();
    
    
//  2. Tag and Class (OR) .Class (OR) tag.class
//  driver.findElement(By.cssSelector("input.inputtext ")).sendKeys("abc@gmail.com"); // Method 1
//  Thread.sleep(3000);
//  driver.findElement(By.cssSelector("input.inputtext ")).clear();
//  driver.findElement(By.cssSelector(".inputtext ")).sendKeys("def@gmail.com");  // Method 2
//    Thread.sleep(3000);
//  driver.findElement(By.cssSelector(".inputtext ")).clear();

//  3. Tag and Attribute (OR) [Attribute=Value] (OR) Tag[Attribute=value]
//    driver.findElement(By.cssSelector("input[name=email]")).sendKeys("abc@gmail.com");   //Method 1
//    Thread.sleep(3000);
//    driver.findElement(By.cssSelector("input[name=email]")).clear();
//    driver.findElement(By.cssSelector("[name=email]")).sendKeys("def@gmail.com");  // Method 2
//    Thread.sleep(3000);
//    driver.findElement(By.cssSelector("[name=email]")).clear();
    
//  4. Tag, Class and Attribute (OR) tag.class[Attribute=value]
    driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("abc@gmail.com");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("1234567");
    
	}

}
