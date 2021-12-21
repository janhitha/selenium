package com.Seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathAbsoluteRelativexpath {
    private static WebDriver driver;
	public static void main(String[] args)  throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		chapter9();

	}
	//absolute path and relative path
	public static void chapter2()
	{
		driver.get("https://www.w3schools.com/");
	    //absolute path
        //highlight(driver, driver.findElement(By.xpath("/html/body/div[3]/a[4]")));        		
		//relative path
		highlight(driver, driver.findElement(By.xpath("//a[@title='Exercises']")));
		}
//	XPath using attributes
	public static void chapter3() throws Exception 
	{
		driver.get("https://www.w3schools.com/");	
//	    highlight(driver, driver.findElement(By.xpath("//a[@id='w3loginbtn']"))); /*by this login button is disappearing in result due to STYLE difference  between highlight method and login button style 
//		driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@title='Search W3Schools']")).click();  // xpath in single quotes
		driver.findElement(By.xpath("//a[@title=\"Search W3Schools\"]")).click();  // xpath in double quotes
		
		}
//	XPath using operators(=,!=,<,<=,>,>=) all these operators can be used for integer numbers,and for strings only equals to, not equals will be used.
	public static void chapter4() throws Exception 
	{
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		highlight(driver,driver.findElement(By.xpath("//input[@maxlength=10]")));
//		highlight(driver,driver.findElement(By.xpath("//input[@maxlength=15]")));
//		highlight(driver,driver.findElement(By.xpath("//input[@maxlength!=10]")));
		List<WebElement> elements = driver.findElements(By.xpath("//input[@maxlength<=16]"));
		for(WebElement element: elements)
		{
			highlight(driver,element);
		}
			
	}
//	Xpath conditions (AND,OR,NOT)
	public static void chapter5() throws Exception
	{
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		highlight(driver,driver.findElement(By.xpath("//button[@type='submit' and @class='btn']")));
//		highlight(driver,driver.findElement(By.xpath("//button[@type='submit' or @class='btn']")));
//		highlight(driver,driver.findElement(By.xpath("//input[@maxlength<=15 and @name='name' and @type='text']"))); //positive testcase(AND)
//		highlight(driver,driver.findElement(By.xpath("//input[@maxlength<=15 and @name='name' and @type='tt']"))); //negative testcase(AND)
//		highlight(driver,driver.findElement(By.xpath("//input[@maxlength<=15 and @name='name' or @type='tt']"))); //positive testcase(AND & OR)
//		highlight(driver,driver.findElement(By.xpath("//input[@maxlength<=15 or @name='name' and @type='tt']"))); //negative testcase(AND & OR)
//		highlight(driver,driver.findElement(By.xpath("//input[@maxlength<=15 or @name='namee' or @type='tt']"))); //positive testcase(OR)
//		highlight(driver,driver.findElement(By.xpath("//input[@maxlength<=1 or @name='namee' or @type='tt']"))); //negative testcase(OR)
//		List<WebElement> element =  driver.findElements(By.xpath("//input[@maxlength<=15 and @name='name' and @type='text']"));
//		System.out.println(element.size());
//		List<WebElement> element =  driver.findElements(By.xpath("//input[@maxlength<=15 or @name='name' and @type='text']"));
//		System.out.println(element.size());
//		List<WebElement> elements =  driver.findElements(By.xpath("//input[@maxlength<=1 or @name='namee' or @type='tt']"));
//		System.out.println(elements.size());
//		List<WebElement> elementss =  driver.findElements(By.xpath("//input[not(@maxlength=10)]")); //NOT method 1
//		System.out.println(elementss.size());
		List<WebElement> elementsss =  driver.findElements(By.xpath("//input[@maxlength!=10]"));  //NOT method 2
		System.out.println(elementsss.size());
	}
//	Xpath by INDEX
	public static void chapter6() throws Exception
	{
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		highlight(driver,driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[1]"))); //hightlight header section in a table
//		highlight(driver,driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[2]"))); //hightlight first row in a table
//     	highlight(driver,driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[1]"))); //highlight first row first cell
//     	highlight(driver,driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[23]"))); //highlight 23rd cell in a table
     	highlight(driver,driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[15]"))); //highlight 15th cell in a table
	}
	
//	Xpath functions
	public static void chapter7() throws Exception
	{
		//Text() XPath function (Use to find out element by text)
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		highlight(driver,driver.findElement(By.xpath("//a[text()='Sign in']")));  //finding anchor tag
//		highlight(driver,driver.findElement(By.xpath("//h1[text()='Register']")));  //finding header tag
//		highlight(driver,driver.findElement(By.xpath("//label[text()='Email']")));  //finding label tag
		
		//Contains() XPath function (Use to find out element by partial text/partial attribute value,it is used along with text() function & )
//		highlight(driver,driver.findElement(By.xpath("//a[contains(text(),'account')]"))); //  partial text finding
//		highlight(driver,driver.findElement(By.xpath("//div[contains(@class,'signin')]"))); //  partial attribute value finding
		
		//Starts-with() XPath function  
//		highlight(driver,driver.findElement(By.xpath("//a[starts-with(text(),'Sign in into')]")));
		
		//Normalize-space() XPath function
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		highlight(driver,driver.findElement(By.xpath("//label[normalize-space(text())='First Name']"))); //normalize spaces in text
//		driver.get("https://github.com/login");
//		highlight(driver,driver.findElement(By.xpath("//label[normalize-space(text())='Username or email address']")));
		
		//Last() XPath function
//		highlight(driver,driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[last()]")));
		
		//Position() XPath function  (Positions function can be used with all the operators <,<=,>,>=,=,!=)
//		highlight(driver,driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[position()=2]")));
//		System.out.println(driver.findElements(By.xpath("(//table[@id='contactList']/tbody/tr)[position()>2]")).size());
		
	}
	
//	XPath Axes
	public static void chapter8() throws Exception
	{
	driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//	highlight(driver,driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")));
//	highlight(driver,driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input")));  //style problem element is not getting highlighted
//	driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input")).click();
//	highlight(driver,driver.findElement(By.xpath("//table[@id='contactList']/child::tbody/child::tr[3]"))); 
//	highlight(driver,driver.findElement(By.xpath("//td[text()='Helen Bennett']/parent::tr"))); 
//	highlight(driver,driver.findElement(By.xpath("//td[text()='Helen Bennett']/ancestor::div"))); 
//	highlight(driver,driver.findElement(By.xpath("//td[text()='Helen Bennett']/ancestor::*")));
//	highlight(driver,driver.findElement(By.xpath("//td[text()='Helen Bennett']/ancestor-or-self::*")));
//	highlight(driver,driver.findElement(By.xpath("//table[@id='contactList']/descendant::*")));
//	highlight(driver,driver.findElement(By.xpath("//table[@id='contactList']/descendant::tr")));
	highlight(driver,driver.findElement(By.xpath("//table[@id='contactList']/descendant-or-self::*")));
	}
	
//	XPath shortcuts
	public static void chapter9() throws Exception
	{
	driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//	text() ->  .
//	highlight(driver,driver.findElement(By.xpath("//h1[.='Register']")));
//	highlight(driver,driver.findElement(By.xpath("//a[contains(.,'account')]")));
//	highlight(driver,driver.findElement(By.xpath("//td[starts-with(.,'Maria')]")));
//	highlight(driver,driver.findElement(By.xpath("//label[normalize-space(.)='First Name']")));
	
//	child ->  / 
//	highlight(driver,driver.findElement(By.xpath("//div[@class='container']/h1"))); /* //div[@class='container']/child::h1, child colon colon is replaced by single slash  */
	
//  Parent ->  /..
//	highlight(driver,driver.findElement(By.xpath("//h1[.='Register']/..")));  /*  //h1[.='Register']/parent::div, parent colon coln is replaced by slash double dot */
	
//	Descendant  -> //
//	highlight(driver,driver.findElement(By.xpath("//table[@id='contactList']//td")));   /*  //table[@id='contactList']/descendant::td, descendant colon colon is replaced by double slash */
	List<WebElement> elements = driver.findElements(By.xpath("//table[@id='contactList']//td"));  
	for(WebElement element : elements )
	{
		highlight(driver,element);     // All cells in a table is identified
	}
	}
	
	public static void highlight(WebDriver driver,WebElement element )
	{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow');", element);
	}
}
