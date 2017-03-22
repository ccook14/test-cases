package Tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by Colin Cook on 3/22/2017.
 */
public class SouthWestFlights {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://southwest.com");
        driver.manage().window().maximize();

        WebElement departureCity = driver.findElement(By.cssSelector("#air-city-departure"));
        departureCity.sendKeys("OKC");  //Switch with any airport abbreviation
        departureCity.click();

        WebElement arrivalCity = driver.findElement(By.cssSelector("#air-city-arrival"));
        arrivalCity.sendKeys("Atlanta");    //Switch with any airport abbreviation
        arrivalCity.click();


        WebElement departureDate = driver.findElement(By.id("air-date-departure"));
        departureDate.clear();
        departureDate.sendKeys("07/04");    //July 4th flight
        driver.findElement(By.cssSelector("#calendar-july-4"));

        WebElement returnDate = driver.findElement(By.cssSelector("#air-date-return"));
        returnDate.clear();
        returnDate.sendKeys("07/11");

        driver.findElement(By.cssSelector("#jb-booking-form-submit-button")).click();

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\Users\\Colin Cook\\Desktop\\DemoProject\\screenshotsFromTests\\FlightsAvilable.png"));
    }
}
