package com.venkat;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementClassDemo {

	public static void main(String[] args) {
		//Launch the browser.  
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		//create the upcasting refName.
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Load the URL.
		driver.get("https://www.facebook.com/");
		
		//find the element for input text field.
		WebElement findElement = driver.findElement(By.id("email"));
		
		//clear the value in input text field.
		findElement.clear();
		
		//click the element.
		findElement.click();
		
		//get the attribute value. -re=String   -re=return type
		findElement.getAttribute("input");
		
		//get the css value from css property. -re=String
		findElement.getCssValue("fontSize");
		
		//get the tag name. -re=String
		findElement.getTagName();
		
		//send the string in element. 
		findElement.sendKeys("venkat");
		
		//input filed is displayed or not -re=boolean
		findElement.isDisplayed();
		
		//element is enabled or not. -re=boolean
		findElement.isEnabled();
		
		//element is selected or not. it is worked on multiple select options. -re=boolean.
		findElement.isSelected();
		
		//get the text form element. -re=String
		findElement.getText();
		
		//submit the form.
		findElement.submit();
		
		//get the size of element. -re=Dimension class
		Dimension size = findElement.getSize();
		System.out.println(size.height);
		System.out.println(size.width);
		
		//get the element location on the web page. -re=Point class
		Point location = findElement.getLocation();
		System.out.println(location.x);
		System.out.println(location.y);
		
		driver.quit();
	}

}
