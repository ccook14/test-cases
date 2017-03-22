import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;

/**
 * Created by Colin Cook on 12/9/2016.
 *
 * This test script is testing the funcionality of the Qualifications Table on the Training Folder page.
 * We are verifying that links are functioning withing the Qualifications Table.
 * Note: images might be broken
 */
public class QualificationsLinkIcon {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.ie.driver", "C:\\Users\\Colin Cook\\Desktop\\selenium-2.53.1\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();


        //WebDriver driver = new FirefoxDriver();
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

        //File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(scrFile, new File("C:\\Users\\Colin Cook\\Desktop\\QA Test cases\\Opstar\\Training Folder\\InsideTestFolder.png"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement image1 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[1]/div[1]/span/a/img"));
        image1.click();
        image1.sendKeys(Keys.ESCAPE);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement image2 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[3]/div[1]/span/a/img"));
        image2.click();
        image2.sendKeys(Keys.ESCAPE);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement image3 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[5]/div[1]/span/a/img"));
        image3.click();
        image3.sendKeys(Keys.ESCAPE);


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement image4 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[7]/div[1]/span/a/img"));
        image4.click();
        image4.sendKeys(Keys.ESCAPE);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement image5 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[9]/div[1]/span/a/i"));
        image5.click();
        image5.sendKeys(Keys.ESCAPE);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement image6 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[10]/div[1]/span/a/i"));
        image6.click();
        image6.sendKeys(Keys.ESCAPE);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement image7 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[11]/div[1]/span/a/i"));
        image7.click();
        image7.sendKeys(Keys.ESCAPE);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement hideTab = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[1]/div/a[2]/i"));
        hideTab.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hideTab.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement save = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[1]/div/span/i"));
        save.click();


        //driver.close();


    }
}
