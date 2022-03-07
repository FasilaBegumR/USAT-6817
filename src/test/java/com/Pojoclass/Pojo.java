package com.Pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Base;

public class Pojo extends Base{
	
	public Pojo()  {
		
		PageFactory.initElements(driver, this);
		}

		@FindBy(name="username")
		private WebElement email;

		@FindBy(name="password")
		private WebElement pass;

		@FindBy(xpath="//input[@type='submit']")
		private WebElement login;

		public WebElement getEmail() {
		return email;
		}

		public WebElement getPass() {
		return pass;
		}

		public WebElement getLogin() {
		return login;
		}
	

}
