package Fusion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ErasePolicy {


    public static void EraseP(WebDriver driver) throws InterruptedException {



        Thread.sleep(4000);
      driver.findElement(By.cssSelector("#customerSearchInput")).click();

       driver.get("https://portal.stg.tw-test.net/#/operations?menuKey=swg-customer-home&stackKey=swg-policies");


//Step one login
        driver.get("https://portal.stg.tw-test.net/#/operations?menuKey=swg-customer-home&stackKey=");


        driver.manage().window().maximize();

        Thread.sleep(4000);

        driver.findElement(By.cssSelector("#login-username--material-input")).sendKeys("twSuperAdmin");

        Thread.sleep(4000);

        driver.findElement(By.cssSelector("#login-password")).click();
        driver.findElement(By.cssSelector("#login-password")).sendKeys("P@ssw0rd1");

        Thread.sleep(4000);

        driver.findElement(By.cssSelector("#login-submit-button--material-button")).click();

        //Step two configure
        Thread.sleep(30000);

        WebElement elementCustomerSearch = driver.findElement(By.cssSelector("#customerSearchInput"));
        if (elementCustomerSearch.isDisplayed() && elementCustomerSearch.isEnabled()) {
            elementCustomerSearch.click();
            elementCustomerSearch.sendKeys("twtest_swgcloud13");


            driver.findElement(By.xpath("/html/body/portal-main/div/div/div/portal-router/div/twa-portal-stage[7]/div/div[2]/twa-nav-menu-stage[22]/div/div[2]/twa-swg-customer-home-vc/twa-lazy-view-stack/div/twa-lazy-view[1]/div/twa-swg-customer-home/twa-page/twa-cbox/twa-collapse/div[1]/div/div[1]/twa-swg-search/twa-form/div[1]/twa-form-row[1]/twa-form-column/span[1]/twa-form-item[2]/div/div/div/twa-button[1]/material-button/div/div")).click();


            Thread.sleep(20000);

            driver.findElement(By.xpath("//span[contains(text(), \"1249164\")]")).click();

            Thread.sleep(20000);

            driver.findElement(By.cssSelector("twa-datalist-item.flex:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > twa-label:nth-child(1) > label:nth-child(1)")).click();

            Thread.sleep(20000);


            driver.findElement(By.xpath("/html/body/portal-main/div/div/div/portal-router/div/twa-portal-stage[7]/div/div[2]/twa-nav-menu-stage[22]/div/div[2]/twa-swg-customer-home-vc/twa-lazy-view-stack/div/twa-lazy-view[6]/div/twa-swg-customer-policies/twa-page/div/twa-cbox[2]/twa-collapse/div[1]/twa-tab-panel/twa-tab-strip/div[1]/div/div[1]/div[2]/div/div[1]")).click();

            Thread.sleep(10000);

            driver.findElement(By.xpath("//span[contains(text(), \"Custom URL - www.example.com\")]")).click();


            Thread.sleep(500);


            driver.findElement(By.cssSelector("#rulesGrid--datalist--action-bar--delete-button--icon-button")).click();

            Thread.sleep(500);

            driver.findElement(By.xpath("/html/body/portal-main/div/div/div/portal-router/div/twa-portal-stage[7]/div/div[1]/div[3]/twa-swg-change-set-plugin/div/twa-swg-customer-change/div/twa-button/material-button/div/div")).click();

            Thread.sleep(500);


            WebElement elementClickThis = driver.findElement(By.cssSelector("#changeSetGrid--datalist > div:nth-child(2) > dlmain:nth-child(2) > twa-datalist-table:nth-child(1) > div:nth-child(1) > twa-datalist-column:nth-child(6) > div:nth-child(1) > twa-datalist-format:nth-child(1) > span:nth-child(1)"));
            if (elementClickThis.isDisplayed() && elementClickThis.isEnabled()) {
                elementClickThis.click();



                WebElement elementSubmit = driver.findElement(By.xpath("//*[@id=\"rulesDialog--primary-button--div-label\"]"));
                if (elementSubmit.isDisplayed() && elementSubmit.isEnabled()) {
                    elementSubmit.click();


                }

            }

        }
    }
}
