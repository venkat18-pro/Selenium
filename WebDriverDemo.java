package com.venkat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		
		//Launch the browser.  
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		//create the upcasting refName.
		//WebDriver control of the browser itself
		WebDriver driver = new ChromeDriver();
		
		//load a new web page in the current browser window.
		driver.get("https://www.facebook.com/");
		
		// find the first webElement using given method
		driver.findElement(By.id("email"));
		
		//find all elements within the current page using the given mechanism -re=List<WebElement>
		driver.findElements(By.tagName("p"));
		
		//get the current url in the browser
		driver.getCurrentUrl();
		
		//get the title of the web page
		driver.getTitle();
		
		//Get the source of the last loaded page.
		driver.getPageSource();
		
		//Get the Option interface -re=Options
		driver.manage();
		
		//An abstraction allowing the driver to access the browsers history and to navigate to the url.
		//re=Navigate
		driver.navigate();
		
		//send future commands to a different frame or window -re=TarfetLocation.
		driver.switchTo();
		
		//close the current tab.
		driver.close();
		
		//close the browser window.
		driver.quit();
		
		
		
		
		
	}

}
