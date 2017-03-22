import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	/*
	 * Load the web page Fill out all of the data for contact us, but take a
	 * screenshot of all the data typed in, then clear it. Click on JavaScript
	 * alert and deal with it appropriately
	 */

	public static void main(String[] args) throws IOException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/Practiceform/");

		WebElement name = driver
				.findElementByXPath("html/body/div[1]/div[2]/div[2]/div/aside/div/section[2]/form/div/span[1]/input");
		name.click();
		name.sendKeys("Colin");

		WebElement email = driver
				.findElementByXPath("html/body/div[1]/div[2]/div[2]/div/aside/div/section[2]/form/div/span[2]/input");
		email.click();
		email.sendKeys("colin.cook@keybridgeti.net");

		WebElement phone = driver
				.findElementByXPath("html/body/div[1]/div[2]/div[2]/div/aside/div/section[2]/form/div/span[3]/input");
		phone.click();
		phone.sendKeys("8001112233");

		WebElement country = driver
				.findElementByXPath("html/body/div[1]/div[2]/div[2]/div/aside/div/section[2]/form/div/span[4]/input");
		country.click();
		country.sendKeys("United States of America");

		WebElement company = driver
				.findElementByXPath("html/body/div[1]/div[2]/div[2]/div/aside/div/section[2]/form/div/span[5]/input");
		company.click();
		company.sendKeys("Keybridge");

		WebElement message = driver
				.findElementByXPath("html/body/div[1]/div[2]/div[2]/div/aside/div/section[2]/form/span/textarea");
		message.click();
		message.sendKeys(
				"Thank you so much for allowing me to practice test automation on your website. Please do not add my IP address to the blacklist. Thanks! Colin Cook");

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scrFile, new File("C:\\Users\\Colin Cook\\Desktop\\TestResults.png"));

		//WebElement clear = driver.findElementByClassName("clear-form");
		//clear.click();



	}

}
