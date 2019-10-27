package Fusion;

import org.junit.FixMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;



@FixMethodOrder


public class NgMain {


    private static WebDriver driver;


    @BeforeSuite

    public static void main() {

        System.setProperty(DriverConstans.FirefoxDriver1, DriverConstans.FirefoxDriver2);
        driver = new FirefoxDriver();
        //  driver = new ChromeDriver();


    }


    @Test

    public void Test01_PolicyLogIn() throws InterruptedException, AWTException {


        PolicyLogin.Browsers(driver);


    }


    @Test

    public void Test02_ConfigurationSetup() throws InterruptedException, AWTException {

        Configuration.ConfigurePolicy(driver);

    }


    @Test

    public void Test03_PolicyTesting() throws InterruptedException {
        driver = new FirefoxDriver();

        PolicyTest.TestScreen(driver);

        Thread.sleep(3000);

        driver.get("https://portal.stg.tw-test.net/#/operations?menuKey=swg-customer-home&stackKey=");


    }






    @Test

    public void Test04_Erase() throws InterruptedException {


        ErasePolicy.EraseP(driver);

    }
    }



//    @AfterSuite
//    public void SetupTestTeardown() {
//
//        driver.close();






