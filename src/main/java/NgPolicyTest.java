import org.junit.FixMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;



@FixMethodOrder



public class NgPolicyTest {


    private static WebDriver driver;


    @BeforeSuite

    public static void main() {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moshe.avidor\\Desktop\\Automation\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\moshe.avidor\\Desktop\\Automation\\geckodriver.exe");


    }


    @Test

    public void Test01() throws InterruptedException, AWTException {

        WebDriver driver = new FirefoxDriver();

        // driver = new ChromeDriver();


        driver.get("https://portal.stg.tw-test.net/#/home?menuKey=dashboard&stackKey=main-dash-nav");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("#login-username--material-input")).sendKeys("twSuperAdmin");

        Thread.sleep(5000);

        Robot robot = new Robot();
        robot.mouseMove(900, 480);


        robot.delay(1500);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1500);


        Thread.sleep(5000);

        driver.findElement(By.cssSelector("#login-password")).sendKeys("P@ssw0rd1");


        Thread.sleep(5000);


        robot.mouseMove(900, 510);


        robot.delay(1500);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1500);


        Thread.sleep(5000);


        robot.mouseMove(800, 100);


        robot.delay(1500);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1500);



        Thread.sleep(8000);


        robot.mouseMove(800, 500);


        robot.delay(1500);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1500);



        Thread.sleep(8000);


        robot.mouseMove(1000, 550);


        robot.delay(1500);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1500);




    }



        }


