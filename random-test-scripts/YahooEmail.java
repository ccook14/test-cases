package com.colin.cook;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class YahooEmail {

	public static void main(String[] args) {
		// Create a program that makes a yahoo email account
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://yahoo.com");

		WebElement signIn = driver.findElementById("uh-mail-link");
		signIn.click();
		
		//xpath expression of the signIn element
		//WebElement signIn = driver.findElementByXPath("html/body/div[4]/div/div[3]/div[2]/div[1]/div/div/div/ul/li[1]/a/span");
		//signIn.click();
		
		
		WebElement signup = driver.findElementById("login-signup");
		signup.click();
		
		
		WebElement firstName = driver.findElementByXPath("html/body/div[1]/div[2]/div/div/form/fieldset/div/div[1]/input");
		firstName.click();
		firstName.sendKeys("Colin");
		
		
		WebElement lastName = driver.findElementById("usernamereg-lastName");
		lastName.click();
		lastName.sendKeys("Cook");
		
		
		WebElement email = driver.findElementById("usernamereg-yid");
		email.click();
		email.sendKeys("colincook167914");
		
		WebElement tabKey = driver.findElementById("usernamereg-yid");
		tabKey.sendKeys(Keys.TAB);	//Tabs the recomendation username away
		tabKey.sendKeys(Keys.TAB);
		
		WebElement emailSelect = driver.findElementByXPath("html/body/div[1]/div[2]/div/div/form/div[1]/div[2]/ul/li[1]");
		emailSelect.click();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement phone = driver.findElementById("usernamereg-phone");
		phone.click();
		phone.sendKeys("8502663886");
		
		WebElement password = driver.findElementById("usernamereg-password");
		password.click();
		password.sendKeys("Hopethisworks14");
		

		
		
		WebElement month = driver.findElementById("usernamereg-month");
		month.click(); //clicks the month drop down
		
		WebElement month3 = driver.findElementByXPath("html/body/div[1]/div[2]/div/div/form/div[4]/div[1]/select/option[4]");
		month3.click(); // selects march
		
		
		WebElement day = driver.findElementById("usernamereg-day");
		day.click(); //clicks on day drop down 
		
		WebElement day24 = driver.findElementByXPath("html/body/div[1]/div[2]/div/div/form/div[4]/div[2]/select/option[25]");
		day24.click();  //clicks on the 24th day
		
		WebElement year = driver.findElementById("usernamereg-year");
		year.click();
		
		WebElement year1992 = driver.findElementByXPath("html/body/div[1]/div[2]/div/div/form/div[4]/div[3]/select/option[26]");
		year1992.click();
		
		
		WebElement gender = driver.findElementById("usernamereg-gender");
		gender.click();
		
		//If you want to select a gender 
		
		//WebElement genderSelect = driver.findElementByXPath("html/body/div[1]/div[2]/div/div/form/div[6]/select/option[3]"); 		this is for male
		//WebElement genderSelect = driver.findElementByXPath("html/body/div[1]/div[2]/div/div/form/div[6]/select/option[2]");		this is for female
		//WebElement genderSelect = driver.findElementByXPath("html/body/div[1]/div[2]/div/div/form/div[6]/select/option[4]");		this is for 'other'
		//genderSelect.click();
		
		
		
		WebElement submit = driver.findElementById("reg-submit-button");
		//submit.click();
		
		driver.quit();
		
	}

}
