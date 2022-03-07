package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Baseclass.Base;
import com.Pojoclass.Pojo;

import io.cucumber.java.en.*;

public class Step extends Base{
	Pojo l;
	
	
	@Given("Open the Seedlive login page through Chrome Browser")
	public void open_the_Seedlive_login_page_through_Chrome_Browser() {
		launchbrowser();
		maxBrowser();
		launchUrl("https://dev.seedlive.com/logout.i?selectedMenuItem=105");
	}

	@When("Login using Valid Seedlive credentials")
	public void login_using_Valid_Seedlive_credentials() {
		 l = new Pojo();
			filltext(l.getEmail(), "orxanovic94@gmail.com");
			filltext(l.getPass(), "Orxan@123");
		
	}

	@When("Enter the login button")
	public void enter_the_login_button() {
		l = new Pojo();
		click(l.getLogin());
		
		
	}

	@Then("Seedlive Home page displayed.")
	public void seedlive_Home_page_displayed() {
		String Url = driver.getCurrentUrl();

		if (Url.contains("login")) {

		System.out.println("Seedlive Home page displayed");

		} else {

		System.out.println("Seedlive Homepage not displayed");

		}
	    
		
		
	}

	@Given("User click on administration tab")
	public void user_click_on_administration_tab() throws InterruptedException {
		WebElement Admin = driver.findElement(By.xpath("(//a[@href='#'])[2]"));
		Admin.click();
		Thread.sleep(3000);
	}

	@When("User select edit customer and Give customer name in {string} field")
	public void user_select_edit_customer_and_Give_customer_name_in_field(String string) throws InterruptedException {
		WebElement EC = driver.findElement(By.xpath("(//a[@title='View or Edit a Customer'])[1]"));
		EC.click();
		Thread.sleep(3000);
	}

	@When("Click on Search button")
	public void click_on_Search_button() {
		WebElement CustName = driver.findElement(By.id("customerName"));
		CustName.sendKeys("orkhantestsub3");
		WebElement Search = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		Search.click();
	}

	@When("select the Customer name and Edit the details")
	public void select_the_Customer_name_and_Edit_the_details() {
		WebElement Cust = driver.findElement(By.xpath("//option[@value='19783']"));
		Cust.click();
		WebElement Phn = driver.findElement(By.id("phone"));
		Phn.clear();
		Phn.sendKeys("9876543287");
	}

	@When("click on Save Changes button")
	public void click_on_Save_Changes_button() throws InterruptedException {
		WebElement Savechng = driver.findElement(By.id("editInformation"));
		Savechng.click();
		Thread.sleep(3000);
	}

	@Then("Customer detail updated for first time")
	public void customer_detail_updated_for_first_time() {
		System.out.println("Customer detail updated first time");
	}

	@Given("Refresh the page")
	public void refresh_the_page() {
		driver.navigate().refresh();
	}

	@When("Edit the customer details for second times")
	public void edit_the_customer_details_for_second_times() throws InterruptedException {
		WebElement Addr = driver.findElement(By.id("address1"));
		Addr.clear();
		Addr.sendKeys("102 deerlna");
		Thread.sleep(2000);
	}

	@Then("Customer detail Updated for second time")
	public void customer_detail_Updated_for_second_time() {
		WebElement Savechng = driver.findElement(By.id("editInformation"));
		Savechng.click();
		
		
	}



}
