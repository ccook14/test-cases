import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;

import static java.lang.System.out;


/**
 * Created by Colin on 12/20/2016.
 */
public class ToTrainingFolder {

    public static void main(String[] args) throws IOException {


        System.setProperty("webdriver.ie.driver", "C:\\Users\\Colin Cook\\Desktop\\Opstar Training Folder\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();

        driver.get("http://10.0.1.53/opstar_test/");


        out.println("Launching Internet Explorer browser..");
        driver.manage().window().maximize();
        try {
            Thread.sleep(1000); // pauses for 1 second
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        out.println("The title of the page being tested is:  " + driver.getTitle());

        WebElement acknowledge = driver.findElement(By.xpath("html/body/div[5]/div[1]/div[2]/div[2]/div[1]/div/div[2]/center/a"));
        acknowledge.click();    //first popup when you go on site
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement applications = driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[1]/ul[2]/li[7]/a"));
        //driver.findElement(By.linkText("Training Folder"));
        System.out.println(applications.getText());
        applications.click();


        WebElement toTools = driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[1]/ul[2]/li[7]/ul/li[2]/a"));
        toTools.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement traingFolder = driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[1]/ul[2]/li[7]/ul/li[2]/ul/li/a"));
        traingFolder.click();
        System.out.println("The Training Folder has been selected");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }


        WebElement closeBox = driver.findElement(By.id("cboxClose"));
        closeBox.click();       //clicks second popup acknolwedge box
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }


        WebElement textBox = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[1]/div/div[2]/div/form/div/div/span/span[1]/span"));
        textBox.click();
        textBox.sendKeys("ken");
        textBox.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        /***************
         THIS IS WHERE THE QUALIFICATIONS FOLDER STARTS
         ******************/

        WebElement image1 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[1]/div[1]/span/a/img"));
        image1.click();
        image1.sendKeys(Keys.ESCAPE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }


        WebElement table1 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[1]/div[2]/input"));
        table1.clear();
        table1.sendKeys("Testing table 1, Opstar Test");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement date1 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[1]/div[3]/input"));
        date1.click();
        date1.clear();
        date1.sendKeys("12/25/2016");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        // WebElement save = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[1]/div[5]/span[1]/i"));
        //save.click();

        WebElement image2 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[3]/div[1]/span/a/img"));
        image2.click();
        image2.sendKeys(Keys.ESCAPE);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement title2 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[3]/div[2]/input"));
        title2.clear();
        title2.sendKeys("Testing table 2, Opstar test 2");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement date2 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[3]/div[3]/input"));
        date2.click();
        date2.clear();
        date2.sendKeys("01/01/2017");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        // WebElement save2 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[3]/div[3]/div[3]/div[5]/span[1]/i"));
        //save2.click();

        WebElement closeQualifications = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[1]/div/div/div[1]/div/a[2]"));
        closeQualifications.click();

        System.out.println("The Qualifications folder has been tested");

        /***************
         THIS IS WHERE THE DESIGNATIONS FOLDER STARTS
         ******************/

        WebElement Designations = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr/td[1]/span/a/img"));
        Designations.click();
        Designations.sendKeys(Keys.ESCAPE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement DesignationsTitle = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr/td[2]/input"));
        DesignationsTitle.clear();
        DesignationsTitle.sendKeys("Testing the Desiganations title box, Opstar Test");

        WebElement DesignationsIssue = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr/td[3]/input"));

        DesignationsIssue.clear();
        DesignationsIssue.sendKeys("03/24/2017");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        // WebElement saveDesignations = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/table/tbody/tr/td[5]/span[1]/i"));
        //saveDesignations.click();

        WebElement closeDesignations = driver.findElement(By.xpath(".//*[@id='student_folder_wrapper']/div[2]/div[1]/div/div[1]/div/a[2]"));
        closeDesignations.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println("The Designations box has been tested");

        /***************
         THIS IS WHERE THE WAIVERS FOLDER STARTS
         ******************/

        WebElement waivers = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/a[2]"));
        waivers.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement waiversFile = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/table/tbody/tr/td[1]/span/a/img"));
        waiversFile.click();
        waiversFile.sendKeys(Keys.ESCAPE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement waiversTitle = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/table/tbody/tr/td[2]/input"));
        waiversTitle.clear();
        waiversTitle.sendKeys("Testing the Waivers folder, Opstar test");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement issueDateWaivers = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/table/tbody/tr/td[3]/input"));
        issueDateWaivers.clear();
        issueDateWaivers.sendKeys("01/16/2016");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        //WebElement saveWaivers = driver.findElement(By.xpath(".//*[@id='student_folder_wrapper']/div[2]/div[2]/div/div[2]/table/tbody/tr/td[5]/span[1]/i"));
        //saveWaivers.click();

        WebElement closeWaivers = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/div/a[2]"));
        closeWaivers.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println("The waivers folder has been tested");
        /***************
         THIS IS WHERE THE PROFESSIONAL LICENSES FOLDER STARTS
         ******************/

        WebElement proLicensesCert = driver.findElement(By.xpath(".//*[@id='student_folder_wrapper']/div[2]/div[3]/div/div[1]/div/a[2]"));
        proLicensesCert.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement imagePro = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[3]/div/div[2]/table/tbody/tr/td[1]/span/a/img"));
        imagePro.click();
        imagePro.sendKeys(Keys.ESCAPE);

        WebElement proTitle = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[3]/div/div[2]/table/tbody/tr/td[2]/input"));
        proTitle.clear();
        proTitle.sendKeys("OpSTAR Automation testing this title box");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement proIssueDate = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[3]/div/div[2]/table/tbody/tr/td[3]/input"));
        proIssueDate.clear();
        proIssueDate.sendKeys("05/04/2017");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement proClose = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[3]/div/div[1]/div/a[2]"));
        proClose.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println("The professional Licenses, Certificates, Medical folder has been tested");
        /***************
         THIS IS WHERE THE FIRSTAID FOLDER STARTS
         ******************/

        WebElement firstAid = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[4]/div/div[1]/div/a[2]"));
        firstAid.click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement firstAidImage = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[4]/div/div[2]/table/tbody/tr/td[1]/span/a/img"));
        firstAidImage.click();
        firstAidImage.sendKeys(Keys.ESCAPE);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement firstAidTitle = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[4]/div/div[2]/table/tbody/tr/td[2]/input"));
        firstAidTitle.clear();
        firstAidTitle.sendKeys("KeyBridge automation testing using Selenium");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement firstAidDate = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[4]/div/div[2]/table/tbody/tr/td[3]/input"));
        firstAidDate.clear();
        firstAidDate.sendKeys("02/02/2017");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement closeFirstAid = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[4]/div/div[1]/div/a[2]"));
        closeFirstAid.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println("The First Aid folder has been tested");
        /***************
         THIS IS WHERE THE STAR FOLDER STARTS
         ******************/

        WebElement starOpen = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[5]/div/div[1]/div/a[2]"));
        starOpen.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        WebElement starImage1 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[5]/div/div[2]/table/tbody/tr[1]/td[1]/span/a/img"));
        starImage1.click();
        starImage1.sendKeys(Keys.ESCAPE);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement starTitle1 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[5]/div/div[2]/table/tbody/tr[1]/td[2]/input"));
        starTitle1.clear();
        starTitle1.sendKeys("KeyBridge OpSTAR automation testing");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement starIssueDate1 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[5]/div/div[2]/table/tbody/tr[1]/td[3]/input"));
        starIssueDate1.clear();
        starIssueDate1.sendKeys("03/17/2017");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }


        WebElement starTitle2 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[5]/div/div[2]/table/tbody/tr[2]/td[2]/input"));
        starTitle2.clear();
        starTitle2.sendKeys("CPB Automation Testing");

        // WebElement starIssueDate2 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[5]/div/div[2]/table/tbody/tr[2]/td[3]/input"));
        // starIssueDate2.click();

        WebElement closeStarFolder = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[5]/div/div[1]/div/a[2]"));
        closeStarFolder.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println("The Star Folder has been tested");

        /***************
         THIS IS WHERE THE TRAINING COURSES AND TESTS FOLDER STARTS
         ******************/
        WebElement openCourseAndTests = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[6]/div/div[1]/div/a[2]"));
        openCourseAndTests.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement lastFive = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[6]/div/div[1]/h4/span[2]"));
        lastFive.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement showAll = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[6]/div/div[1]/h4/span[3]"));
        showAll.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement closeTrainingCourse = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[6]/div/div[1]/div/a[2]"));
        closeTrainingCourse.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println("The Training Courses and Tests folder has been tested");
        /***************
         THIS IS WHERE THE PROFESSIONAL DEVELOPMENT FOLDER STARTS
         ******************/

        WebElement proDevelopment = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[7]/div/div[1]/div/a[2]"));
        proDevelopment.click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement proImage = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[7]/div/div[2]/table/tbody/tr/td[1]/span/a/img"));
        proImage.click();
        proImage.sendKeys(Keys.ESCAPE);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement proTitle2 = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[7]/div/div[2]/table/tbody/tr/td[2]/input"));
        proTitle2.clear();
        proTitle2.sendKeys("Testing the PRO Development box");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        WebElement proDevelopmentDate = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[7]/div/div[2]/table/tbody/tr/td[3]/input"));
        proDevelopmentDate.clear();
        proDevelopmentDate.sendKeys("03/24/2017");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement closeProDevelopment = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[7]/div/div[1]/div/a[2]"));
        closeProDevelopment.click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println("The Professional Development / Individual Development Plan Folder has been tested");
        /***************
         THIS IS WHERE THE FLETC CERTIFICATES FOLDER STARTS
         ******************/

        WebElement fletcOpen = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[8]/div/div[1]/div/a[2]"));
        fletcOpen.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement fletcImage = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[8]/div/div[2]/table/tbody/tr/td[1]/span/a/img"));
        fletcImage.click();
        fletcImage.sendKeys(Keys.ESCAPE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        WebElement fletcTitle = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[8]/div/div[2]/table/tbody/tr/td[2]/input"));
        fletcTitle.clear();
        fletcTitle.sendKeys("Testing the FLETC Certificates folder");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement fletcDate = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[8]/div/div[2]/table/tbody/tr/td[3]/input"));
        fletcDate.clear();
        fletcDate.sendKeys("03/24/2017");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement closeFLETC = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[8]/div/div[1]/div/a[2]"));
        closeFLETC.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println("The FLETC Certificates Folder has been tested");
        /***************
         THIS IS WHERE THE MISCELLANEOUS CERTIFICATES FOLDER STARTS
         ******************/

        WebElement openMisc = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[9]/div/div[1]/div/a[2]"));
        openMisc.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        WebElement miscImage = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[9]/div/div[2]/table/tbody/tr/td[1]/span/a/img"));
        miscImage.click();
        miscImage.sendKeys(Keys.ESCAPE);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        WebElement miscTitle = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[9]/div/div[2]/table/tbody/tr/td[2]/input"));
        miscTitle.clear();
        miscTitle.sendKeys("Testing the the Misc box");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        WebElement miscDate = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[9]/div/div[2]/table/tbody/tr/td[3]/input"));
        miscDate.clear();
        miscDate.sendKeys("12/25/2016");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        WebElement closeMisc = driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div[2]/div[2]/div[9]/div/div[1]/div/a[2]"));
        closeMisc.click();
        System.out.println("The Miscellaneous folder has been tested");

        System.out.println("The Training Folder automation test has successfully passed!");


    }
}



