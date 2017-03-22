import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by Colin Cook on 12/6/2016.
 */
public class OpstarStarFolder {

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

        //WebElement applications = //driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[1]/ul[2]/li[5]/a/span"));
        //driver.findElement(By.linkText("Applications"));
        //applications.click();


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

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //Takes a screenshot to verify we're inside the training folder
        FileUtils.copyFile(scrFile, new File("C:\\Users\\Colin Cook\\Desktop\\QA Test cases\\Opstar\\Training Folder\\InsideTestFolder.png"));


        WebElement starFolder = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[5]/div/div[1]/div/a[2]/i"));
        starFolder.click();     //expands the star folder


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement starTitle = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[5]/div/div[2]/table/tbody/tr/td[2]/input"));
        starTitle.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }


        starTitle.clear();
        starTitle.sendKeys("Is this working? Test1");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement starIssueDate = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[5]/div/div[2]/table/tbody/tr/td[3]/input"));
        starIssueDate.click();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }


        WebElement christmas = driver.findElement(By.xpath("html/body/div[22]/div[1]/div[2]/table/tbody/tr[4]/td[7]/div"));
        christmas.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }


        WebElement saveFolder = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[5]/div/div[2]/table/tbody/tr/td[5]/span[1]/i"));
        saveFolder.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        FileUtils.copyFile(scrFile, new File("C:\\Users\\Colin Cook\\Desktop\\QA Test cases\\Opstar\\Training Folder\\StarFolderSaved1.png"));

        WebElement title2 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[5]/div/div[2]/table/tbody/tr[2]/td[2]/input"));
        title2.click();
        title2.clear();
        title2.sendKeys("Test2 Colin");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement issueDate2 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[5]/div/div[2]/table/tbody/tr[2]/td[3]/input"));
        issueDate2.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement christmasEve = driver.findElement(By.xpath("html/body/div[24]/div[1]/div[2]/table/tbody/tr[4]/td[6]/div"));
        christmasEve.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement save2 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[5]/div/div[2]/table/tbody/tr[2]/td[5]/span[1]/i"));
        save2.click();


        //Saves a screenshot of the folder to see how many items it has saved inside of the folder at top in (1) < like that
        FileUtils.copyFile(scrFile, new File("C:\\Users\\Colin Cook\\Desktop\\QA Test cases\\Opstar\\Training Folder\\StarFolderSaved2.png"));


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }



    }


}


