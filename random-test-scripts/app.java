package com.colin.cook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

/**
 *  Test Case using Maven, and Selenium
 *  On http://www.seleniumframework.com/Practiceform/
 */
public class App 
{
    public static void main( String[] args )
    {
        //for Selenium 3.0+ Only works with firefox 47.0+
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\Colin Cook\\Desktop\\selenium-java-3.0.1\\gecko\\geckodriver.exe");

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumframework.com/Practiceform/");
        driver.manage().window().maximize();

        WebElement textArea = driver.findElementById("vfb-10");
        textArea.click();
        textArea.clear();
        textArea.sendKeys("Sending some text into this area.");

        WebElement text = driver.findElementById("vfb-9");
        text.click();
        text.clear();
        text.sendKeys("Automation testing whoo!");

        WebElement checkBox = driver.findElementById("vfb-6-1");
        checkBox.click();
        String str1 = driver.findElement(By.id("vfb-6-1")).getAttribute("checked");
        if (str1.equalsIgnoreCase("true")) {
            System.out.println("The checkbox is selected");
        }

        WebElement radio = driver.findElementById("vfb-7-3");
        radio.click();
        String str = driver.findElement(By.id("vfb-7-3")).getAttribute("checked");
        if (str.equalsIgnoreCase("true")) {
            System.out.println("The radio button is selected");

        }

        //This is for the Calender javascript popup

        WebElement date = driver.findElementById("vfb-8");
        date.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement changeMonth = driver.findElementByXPath("html/body/div[6]/div/a[2]/span");
        changeMonth.click();    //Moves month from November to December

        WebElement christmas = driver.findElementByXPath("html/body/div[6]/table/tbody/tr[4]/td[7]/a");
        christmas.click();

        if(driver.getPageSource().contains("12/25/2016")) {
            System.out.println("Pass! The correct date was submitted");
        }
        else {
            System.out.println("Fail! The wrong date is displayed" );
        }

        WebElement site = driver.findElementById("vfb-11");
        site.clear();
        site.sendKeys("http://keybridgeti.com");

        //Best way to deal with drop down menus
        Select dropdown = new Select(driver.findElement(By.id("vfb-12")));
        dropdown.selectByVisibleText("Option 3");

        driver.getTitle();

        assertEquals("Selenium Framework | Practiceform", driver.getTitle());
        //Pass
        if(driver.getTitle().contains("Selenium Framework | Practiceform"))

        System.out.println("Page title contains \"Selenium Framework | Practiceform\" ");
        else
            //fail
        System.out.println("ERROR: Page title doesn't contain \"Selenium Framework | Practiceform\" ");


    }
}
