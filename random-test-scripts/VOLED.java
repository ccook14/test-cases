package com.colin.cook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Colin Cook on 11/30/2016.
 * This is an Automation test case that completes the VOLED Introduction prototype on Dango
 */
public class VOLED {

    public static void main(String[] args) throws IOException {

    WebDriver driver = new FirefoxDriver();
    driver.get("dango url");

        WebElement username = driver.findElement(By.xpath("html/body/div/div/form/input[2]"));
        username.sendKeys("username");

        WebElement password = driver.findElement(By.xpath("html/body/div/div/form/input[3]"));
        password.sendKeys("password");

        WebElement signIn = driver.findElement(By.xpath("html/body/div/div/form/button"));
        signIn.click();

        driver.manage().window().maximize();
        String parentHandle = driver.getWindowHandle(); // get the current window handle

        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement voled = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/section/div/div/div/section/div/ul/section/ul/li[36]/span")));


        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)", "");    //Scrolls down the webpage JS

        voled.click();

        WebElement sample = driver.findElement(By.id("42_196"));
        sample.click();

        WebElement launch = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div/section/div/ul/section/ul/li[36]/ul/li/ul/li/a[2]/img"));
        launch.click();


        /*
        Remember when a new window is launched you need to switch frames to the new window!!
         */
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //10 second wait for introduction slide



        try {
            Thread.sleep(40000); // pauses for 40 seconds (have to wait for audio to complete to be able to move to next slide)
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }

        String page1Url = driver.getCurrentUrl();
        System.out.println("Slide ones URL is:   " + page1Url);

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(scrFile, new File("C:\\Users\\Colin Cook\\Desktop\\QA Test cases\\Navy VOLED\\testStarted.png"));

        //WebElement next = driver.findElement(By.id("next-btn"));
        //next.click();

        WebElement nextSlide = driver.findElement(By.xpath("html/body/div[1]/footer/div[2]/button[2]"));
        nextSlide.click();

        /*************
        SLIDE 2
         ************/

        String pageUrl = driver.getCurrentUrl();
        System.out.println("The current URL being tested is:   " + pageUrl);

        String pageTitle = driver.getTitle();
        System.out.println("The title of the page is:  " + pageTitle);

        try {
            Thread.sleep(15000); // pauses for 15 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement steps = driver.findElement(By.id("VOLED_T1_F20-1"));
        steps.click();


        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }


        WebElement steps1 = driver.findElement(By.xpath("html/body/div[4]/div[1]/button"));     //clicks first JS popup
        steps1.click();

        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        nextSlide.click();

        /********
         SLIDE 3
         ***********/

        /**************
        Drag and Drop Functionality
         (still working on this)
         ********/

        // Configure the action
//        Actions builder = new Actions(driver);

//        builder.keyDown(Keys.CONTROL)
//                .click((WebElement) By.xpath("html/body/div[1]/div[2]/div[1]/section/ul/li[1]"));
//                .click((WebElement) By.xpath("html/body/div[1]/div[2]/div[1]/section/ul/li[4]"));
//                .keyUp(Keys.CONTROL);

// Then get the action:
//        Action selectMultiple = builder.build();

// And execute it:
//        selectMultiple.perform();

        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement submit = driver.findElement(By.className("submit"));
        submit.click();

        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }


        WebElement incorrect = driver.findElement(By.xpath("html/body/div[4]/div[1]/button"));
        incorrect.click();

        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        submit.click();

        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement incorrect1 = driver.findElement(By.xpath("html/body/div[4]/div[1]/button"));
        incorrect1.click();


        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        nextSlide.click();

        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement select1 = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/section/ul/li[1]"));
        select1.click();        //Selects the first answer

        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        submit.click();

        /*******
        SLIDE 4
         ********/

        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement incorrect2 = driver.findElement(By.xpath("html/body/div[4]/div[1]/button"));
        incorrect2.click();


        WebElement correctAnswer = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/section/ul/li[2]"));
        correctAnswer.click();

        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        submit.click();

        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement incorrect3 = driver.findElement(By.xpath("html/body/div[4]/div[1]/button"));
        incorrect3.click();

        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        nextSlide.click();

        /**********
         Slide 5
         **********/

        /*****
        Long video on the last slide
         ******/

        try {
            Thread.sleep(290000); // pauses for 4 minutes 50 seconds for the long video on slide 5/5
        } catch (InterruptedException e) {

            e.printStackTrace();
        }


        File scrFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //takes screenshot of finished Congratulations JS popup
        FileUtils.copyFile(scrFile1, new File("C:\\Users\\Colin Cook\\Desktop\\QA Test cases\\Navy VOLED\\testComplete.png"));

        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement complete = driver.findElement(By.xpath("html/body/div[4]/div[1]/button"));
        complete.click();

        WebElement exit = driver.findElement(By.id("exit-btn"));
        exit.click();


        driver.switchTo().window(parentHandle);      //Switches back to original window (Dango dashboard)


        driver.close();


}
}
