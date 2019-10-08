package Fusion;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PolicyLogin {


    public static void Browsers(WebDriver driver) throws InterruptedException {

        //WebDriver driver = new FirefoxDriver();

        //driver = new ChromeDriver();


        driver.get("https://portal.stg.tw-test.net/#/operations?menuKey=swg-customer-home&stackKey=");


        driver.manage().window().maximize();

        Thread.sleep(4000);

        driver.findElement(By.cssSelector("#login-username--material-input")).sendKeys("twSuperAdmin");

        Thread.sleep(4000);

        driver.findElement(By.cssSelector("#login-password")).click();
        driver.findElement(By.cssSelector("#login-password")).sendKeys("P@ssw0rd1");

        Thread.sleep(4000);

        driver.findElement(By.cssSelector("#login-submit-button--material-button")).click();

        Thread.sleep(40000);



    }



}
