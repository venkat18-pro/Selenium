package com.venkat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

	public static void main(String[] args) {
		
				//Lunch the browser.  
				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
				//create the upcasting refName.
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				//load url
				driver.get("https://www.facebook.com/");
				
				//element find
				WebElement ele = driver.findElement(By.id("email"));
				
				//Actions class
				//It is used to keyboard and mouse directly
				//define class
				
				Actions action = new Actions(driver);
				
				//Call perform() method at the end of the method chain to actually perform the actions.
				
				//clicks at the current mouse element  
				action.click().perform();
				
				//Clicks in the middle og the given element
				action.click(ele).perform();
				
				//clicks (without releasing) at the current mouse location
				action.clickAndHold().perform();
				
				//Releases the depressed left mouse button at the current mouse location
				action.release().perform();
				
				//clicks in the middle of the given element
				action.clickAndHold(ele).perform();
				
				//Releases the depressed left mouse button in the middle of the given elememt
				action.release(ele).perform();
				
				//right click the current location
				action.contextClick().perform();
				
				//right click the element location
				action.contextClick(ele).perform();
				
				//press the keyboard down arrow
				action.keyDown(Keys.ARROW_DOWN).perform();
				
				//releases the key board down arrow
				action.keyUp(Keys.ARROW_DOWN).perform();
				
				//double click
				action.doubleClick().perform();
				
				//double click the element location
				action.doubleClick(ele).perform();
				
				//move to the element
				action.moveToElement(ele).perform();
				
				//pause 1 sec
				action.pause(1000).perform();
				
				//send the string
				action.sendKeys("hello").perform();
				
				/*A convenience method that performs click and hold at the location of the source element moves to the location of the 
				target element then releases the mouse
				action.dragAndDrop(WebElement src,WebElement dest).perform();
				*/
				
				driver.quit();
	}

}
