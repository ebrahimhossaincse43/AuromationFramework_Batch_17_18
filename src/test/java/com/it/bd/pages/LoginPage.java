package com.it.bd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.it.bd.drivers.PageDriver;
import com.it.bd.utilities.CommonMethods;

public class LoginPage extends CommonMethods{
	
	/*
	 * 1. PageFactory init
	 * 2. Locators
	 * 3. Function
	 */
	
	public LoginPage() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	
	@FindBys({
		@FindBy(xpath = "//input[@name='username']"),
		@FindBy(xpath = "//input[@placeholder='Username']"),
		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
	})
	WebElement userName;
	
	@FindBys({
		@FindBy(xpath = "//input[@name='password']")
	})
	WebElement password;
	
	@FindBys({
		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button")
	})
	WebElement loginButton;
	
	
	public void login() throws InterruptedException {
		timeout();
		try {
			if(userName.isDisplayed()) {
				userName.sendKeys("Admin");
				timeout();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			if(password.isDisplayed()) {
				password.sendKeys("admin123");
				timeout();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			if (loginButton.isDisplayed()) {
				loginButton.click();
				timeout(5000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

}
