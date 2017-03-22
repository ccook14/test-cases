import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;

/**
 * Created by Colin Cook on 12/15/2016.
 */
public class QualificationsTable {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.ie.driver", "C:\\Users\\Colin Cook\\Desktop\\selenium-2.53.1\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();

        driver.get("http://10.0.1.53/opstar_test/");

        driver.manage().window().maximize();

        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement acknowledge = driver.findElement(By.xpath("html/body/div[5]/div[1]/div[2]/div[2]/div[1]/div/div[2]/center/a"));
        acknowledge.click();    //first popup when you go on site

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement applications = //driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[1]/ul[2]/li[5]/a/span"));
                driver.findElement(By.linkText("Applications"));
        applications.click();


        WebElement toTools = driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[1]/ul[2]/li[7]/ul/li[2]/a"));
        toTools.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement traingFolder = driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[1]/ul[2]/li[7]/ul/li[2]/ul/li/a"));
        traingFolder.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement closeBox = driver.findElement(By.id("cboxClose"));
        closeBox.click();       //clicks second popup acknolwedge box

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }


        WebElement textBox = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[1]/div/div[2]/div/form/div/div/span/span[1]/span"));
        textBox.click();

        textBox.sendKeys("ken");        //first three letters of Randy Kenneps last name

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        textBox.sendKeys(Keys.ENTER);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

         WebElement title1 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[1]/div[2]/input"));
         title1.click();
         title1.clear();
         title1.sendKeys("colin automation testing");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement date1 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[1]/div[3]/input"));
        date1.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement halloween = driver.findElement(By.xpath("html/body/div[12]/div[1]/div[2]/table/tbody/tr[6]/td[1]"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        halloween.click();      //clicks 10/31/2016

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        //WebElement expdate1 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[1]/div[4]/input"));
       // expdate1.click();

        WebElement title2 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[3]/div[2]/input"));
        title2.click();
        title2.clear();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        title2.sendKeys("table 2, automation testing");





        }
    }

