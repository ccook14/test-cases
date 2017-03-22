import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailSetup {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");
		
		
		WebElement create = driver.findElementByXPath("html/body/div/div[2]/div[2]/div[2]/div/div/p[1]/span[2]/a");
		create.click();
		
		WebElement firstname = driver.findElementById("FirstName");
		firstname.sendKeys("Colin");
		
		WebElement lastname = driver.findElementById("LastName");
		lastname.sendKeys("Cook");
		
		WebElement username = driver.findElementById("GmailAddress");
		username.sendKeys("javaTestByColin14");
		
		WebElement password = driver.findElementById("Passwd");
		password.sendKeys("TestPassword12345");
		
		WebElement confirmPassword = driver.findElementById("PasswdAgain");
		confirmPassword.sendKeys("TestPassword12345");
		
		WebElement month = driver.findElementByXPath("html/body/div[1]/div[2]/div/div[1]/div/form/div[5]/fieldset/label[1]/span/div");
		month.click();  //opens up month tab
		
		
		//month.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div/form/div[5]/fieldset/label[1]/span/div[2]/div[3]/div"));
		
		WebElement march = driver.findElementByClassName("goog-menuitem-content");
		march.click();
		
		WebElement BDay = driver.findElementById("BirthDay");
		BDay.click();
		BDay.sendKeys("24");
		
		WebElement birthYear = driver.findElementByXPath("html/body/div[1]/div[2]/div/div[1]/div/form/div[5]/fieldset/label[3]/span");
		birthYear.sendKeys("1992");
		
		WebElement gender = driver.findElementByXPath("html/body/div[1]/div[2]/div/div[1]/div/form/div[5]/fieldset/label[3]/span");
		gender.click();
		
		WebElement male = driver.findElementByXPath("html/body/div[1]/div[2]/div/div[1]/div/form/div[6]/label/div/div[2]/div[2]");
		male.click();
		
		WebElement phoneNumber = driver.findElementById("RecoveryPhoneNumber");
		phoneNumber.sendKeys("8001112234");
		
		
		
		
	}

}
