package com.Seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDowns {

	public static void main(String[] args) throws Exception {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =  new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
    Thread.sleep(3000);
//single selection drop down
//    WebElement courseElement = driver.findElement(By.id("course"));
//    Select courseNameDropDown = new Select(courseElement);
//    List<WebElement> courseNameDropDownOptions = courseNameDropDown.getOptions();
//    for(WebElement Option : courseNameDropDownOptions)
//    {
//    System.out.println(Option.getText());	
//    }
//    courseNameDropDown.selectByIndex(1);
//    Thread.sleep(3000);
//    courseNameDropDown.selectByValue("net");
//    Thread.sleep(3000);
//    courseNameDropDown.selectByVisibleText("Javascript");
//    Thread.sleep(3000);
//    String selectedText = courseNameDropDown.getFirstSelectedOption().getText();
//    System.out.println("Selected visible text - " +selectedText);;
    
//Multi selection drop down
    WebElement ideElement = driver.findElement(By.id("ide"));
    Select ideDropDown = new Select(ideElement);
    List<WebElement> ideDropDownOptions = ideDropDown.getOptions();
    for(WebElement Option : ideDropDownOptions)
    {
    System.out.println(Option.getText());	
    }
    ideDropDown.selectByIndex(0);
    Thread.sleep(3000);
    ideDropDown.selectByValue("ij");
    Thread.sleep(3000);
    ideDropDown.selectByVisibleText("NetBeans");
    Thread.sleep(3000);
    ideDropDown.deselectByVisibleText("IntelliJ IDEA");
    List<WebElement> selectedOptions = ideDropDown.getAllSelectedOptions();
    for(WebElement selectedOption : selectedOptions)
    {
    System.out.println("Selected visible text - " +selectedOption.getText());;
	}
		
	}
}

