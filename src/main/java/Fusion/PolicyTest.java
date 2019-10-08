package Fusion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class PolicyTest {

    public static void TestScreen(WebDriver driver) throws InterruptedException {



        driver.manage().window().maximize();


        driver.get(" https://portal.stg.tw-test.net/#/operations?menuKey=swg-policy-test&stackKey=");

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);





        WebElement elementUserName = driver.findElement(By.cssSelector("#login-username--material-input"));
        if (elementUserName.isDisplayed() && elementUserName.isEnabled()) {
            elementUserName.click();
            elementUserName.sendKeys("twSuperAdmin");




            WebElement elementPassword = driver.findElement(By.cssSelector("#login-password"));
            if (elementPassword.isDisplayed() && elementPassword.isEnabled()) {
                elementPassword.click();
                elementPassword.sendKeys("P@ssw0rd1");




                WebElement elementLoginButton = driver.findElement(By.cssSelector("#login-submit-button--material-button"));
                if (elementLoginButton.isDisplayed() && elementLoginButton.isEnabled()) {
                    elementLoginButton.click();


                    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);



                    WebElement elementClickThis = driver.findElement(By.cssSelector("div.autocomplete-selector:nth-child(5) > div:nth-child(1) > span:nth-child(1)"));
                    if (elementClickThis.isDisplayed() && elementClickThis.isEnabled()) {
                        elementClickThis.click();




                        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/main/div/div/div[1]/div/twa-input/div/material-input/div/div[1]/label/input"));

                        WebElement elementCustomerNumber = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div/main/div/div/div[1]/div/twa-input/div/material-input/div/div[1]/label/input"));
                        if (elementCustomerNumber.isDisplayed() && elementCustomerNumber.isEnabled()) {
                            elementCustomerNumber.click();
                            elementCustomerNumber.sendKeys("1249164");
                        }




                        WebElement elementCustomerName = driver.findElement(By.cssSelector(".customer-name"));
                        if (elementCustomerName.isDisplayed() && elementCustomerName.isEnabled()) {
                            elementCustomerName.click();
                        }


                        WebElement elementURL = driver.findElement(By.xpath("/html/body/portal-main/div/div/div/portal-router/div/twa-portal-stage[7]/div/div[2]/twa-nav-menu-stage[23]/div/div[2]/twa-swg-policy-test-vc/twa-lazy-view-stack/div/twa-lazy-view[1]/div/twa-swg-policy-test/twa-page/twa-cbox/twa-collapse/div[1]/twa-form/div[1]/twa-form-row/twa-form-column[1]/twa-form-item[2]/div/div[2]/twa-input/div/material-input/div/div[1]/label/input"));
                        if (elementURL.isDisplayed() && elementURL.isEnabled()) {
                            elementURL.click();
                            elementURL.sendKeys("http://www.example.com");
                        }


                        WebElement elementIp = driver.findElement(By.xpath("/html/body/portal-main/div/div/div/portal-router/div/twa-portal-stage[7]/div/div[2]/twa-nav-menu-stage[23]/div/div[2]/twa-swg-policy-test-vc/twa-lazy-view-stack/div/twa-lazy-view[1]/div/twa-swg-policy-test/twa-page/twa-cbox/twa-collapse/div[1]/twa-form/div[1]/twa-form-row/twa-form-column[2]/twa-form-item[2]/div/div[2]/twa-input/div/material-input/div/div[1]/label/input"));
                        if (elementIp.isDisplayed() && elementIp.isEnabled()) {
                            elementIp.click();
                            elementIp.sendKeys("100.20.3.71");
                        }


                        WebElement element = driver.findElement(By.xpath("//*[@id=\"policyTestForm--submit-button--div-label\"]"));
                        if (element.isDisplayed() && element.isEnabled()) {
                            element.click();
                        }


                        try {


                            driver.findElement(By.cssSelector(".final-action-rule > label:nth-child(1)"));

                        } catch (Exception NoSuchElementException) {
                            System.out.println(" THIS URL IS NOT BLOCKED !!!! ");
                        }


                    }
                }


            }
        }
    }
}











        // 100.20.3.71

// http://www.example.com


// 1249164



