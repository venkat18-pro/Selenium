package com.venkat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {
	
	public static void main(String[] args) {
		//Lunch the browser.  
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		//create the upcasting refName.
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Load the URL.
		driver.get("https://omayo.blogspot.com/");
		//find the select element.
		WebElement dropDown = driver.findElement(By.id("multiselect1"));
		//create object for select class
		Select select = new Select(dropDown);
		//Select the options in three ways..
		//1.index
		//2.value
		//3.visible text
	
		//select the visible text options
		//syntax: selectByVisible(String text);
		select.selectByVisibleText("Volvo");
		
		//select the index based options 
		//syntax: selectByIndex(int index);
		select.selectByIndex(2);
		
		//select the value attribute value options
		//syntax: selectByValue(String value);
		select.selectByValue("audix");
		
		//isMultiple(); -re=boolean   re=return type
		//This method is used the element is multiple selected options. if true this element is multiple select element.. 
		System.out.println(select.isMultiple());
		
		//get the first selected options.
		//syntax: getFirstSelectedOptions();  -re=WebElement
		WebElement firstSelect= select.getFirstSelectedOption();
		System.out.println("First Selected option: "+firstSelect.getText());
		
		//get the all selected options.
		//syntax: getAllSelectedOptions();  -re=List<WebElement>
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println("Selected element tag name: "+webElement.getTagName());
			System.out.println("Selected element value: "+webElement.getText());
			System.out.println("Selected element value: "+webElement.getAttribute("value"));
		}
		
		//deselect the options in three ways..
		//1.index
		//2.value
		//3.visible text
		
		//deselect the visible text options
		//syntax: deselectByVisible(String text);
		select.deselectByVisibleText("Volvo");
		
		//Deselect the index based options 
		//syntax: deselectByIndex(int index);
		select.deselectByIndex(2);
		
		//deselect the value attribute value options
		//syntax: deselectByValue(String value);
		select.deselectByValue("audix");
		
		//deselect the all selected options.
		//syntax: deselectAll();
		select.deselectAll();
		
		//get the all options in the selected element.
		//syntax: getOptions(); -re=List<WebElement>
		List<WebElement> options = select.getOptions();
		for (WebElement option : options) {
			System.out.println("get the text: "+option.getText());
			System.out.println("get tag name"+option.getTagName());
		}
	
		//close the browser..
		driver.quit();
	}

}
