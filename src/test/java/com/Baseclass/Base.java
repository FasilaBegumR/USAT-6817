package com.Baseclass;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;

	public void launchbrowser() {

	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();

    }
	    public void maxBrowser() {
		driver.manage().window().maximize();
		}

		public void launchUrl(String url) {
		driver.get(url);
		}
		
		public void filltext(WebElement element, String text) {
		element.sendKeys(text);
		}
		
		public void click(WebElement element) {
		element.click();
		}
		
		public void getURL(WebElement element) {
         String currentUrl = driver.getCurrentUrl();
		}
		
		public void moveTo(WebElement element) {
          a = new Actions(driver);
          a.moveToElement(element).perform();
		}
		
		public void rightClick(WebElement element) {
			a.contextClick(element).perform();

		}
		
		public void dragAndDrop(WebElement source,WebElement destination) {
			a.dragAndDrop(source, destination).perform();




			}
	

}
