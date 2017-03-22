import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;

import static java.lang.System.out;

/**
 * Created by Colin Cook on 12/16/2016.
 * This test's all of the tables on the right side of the training folder page.
 * It opens the folder and closes the folder. then Saves the folder.
 */
public class openCloseTables {

    public static void main(String[] args) throws IOException {



        System.setProperty("webdriver.ie.driver", "C:\\Users\\Colin Cook\\Desktop\\selenium-2.53.1\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();

        driver.get("http://10.0.1.53/opstar_test/");



        out.println("Launching Internet Explorer browser..");
        driver.manage().window().maximize();

        try {
            Thread.sleep(3000); // pauses for 3 seconds
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        out.println("The title of the page being tested is:   " + driver.getTitle());

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

        textBox.sendKeys("ken");        //first three letters of someones name

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

        WebElement table1 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div/a[2]"));
        table1.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        table1.click();

        out.println("The Designations folder has been successfully opened and closed");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement table2 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/a[2]"));
        table2.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        table2.click();
        out.println("The Waivers folder has been successfully opened and closed");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement table3 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[3]/div/div[1]/div/a[2]"));
        table3.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        table3.click();
        out.println("The Professional Licenses/ Certificates / Medical folder has been opened and closed");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement table4 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[4]/div/div[1]/div/a[2]"));
        table4.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        table4.click();
        out.println("The First Aid folder has been succesfully opened and closed");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement table5 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[5]/div/div[1]/div/a[2]"));
        table5.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        table5.click();
        out.println("The Star folder has been successfully opened and closed");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement table6 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[6]/div/div[1]/div/a[2]"));
        table6.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        table6.click();
        out.println("The Training Courses and Tests folder has been successfully opened and closed");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement table7 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[7]/div/div[1]/div/a[2]"));
        table7.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        table7.click();
        out.println("The Professional Development / Individual Development Plan folder has been successfully opened and closed");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement table8 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[8]/div/div[1]/div/a[2]"));
        table8.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        table8.click();
        out.println("The FLETC Certificates folder has been successfully opened and closed");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement table9 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[9]/div/div[1]/div/a[2]"));
        table9.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        table9.click();
        out.println("The Miscellaneous folder has been succesfully opened and closed");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement qualifications = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[1]/div/a[2]"));
        qualifications.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        qualifications.click();
        out.println("The Qualifications folder has been successfully opened and closed");



        // I should program test scripts like this in the future

//        try {
//            WebElement xbox = driver.findElement(By.id("cboxClose"));
//            xbox.click();
//        } catch(Exception e) {
//            System.err.print("NO NO NO that ");
//        }


    }

}
