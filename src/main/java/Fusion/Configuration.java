package Fusion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class Configuration {


    public static void ConfigurePolicy(WebDriver driver) throws InterruptedException {


        WebElement elementCustomerSearch = driver.findElement(By.cssSelector("#customerSearchInput"));
        if (elementCustomerSearch.isDisplayed() && elementCustomerSearch.isEnabled()) {
            elementCustomerSearch.click();
            elementCustomerSearch.sendKeys("twtest_swgcloud13");


            driver.findElement(By.xpath("/html/body/portal-main/div/div/div/portal-router/div/twa-portal-stage[7]/div/div[2]/twa-nav-menu-stage[22]/div/div[2]/twa-swg-customer-home-vc/twa-lazy-view-stack/div/twa-lazy-view[1]/div/twa-swg-customer-home/twa-page/twa-cbox/twa-collapse/div[1]/div/div[1]/twa-swg-search/twa-form/div[1]/twa-form-row[1]/twa-form-column/span[1]/twa-form-item[2]/div/div/div/twa-button[1]/material-button/div/div")).click();


            Thread.sleep(20000);

driver.findElement(By.xpath("//span[contains(text(), \"1249164\")]")).click();

//            WebElement elementCustomerUserNumber = driver.findElement(By.xpath("//span[contains(text(), \"1249164\")]"));
//            if (elementCustomerSearch.isDisplayed() && elementCustomerSearch.isEnabled()) {
//                elementCustomerSearch.click();


                Thread.sleep(20000);

             //   driver.get("https://portal.stg.tw-test.net/#/operations?menuKey=swg-customer-home&stackKey=swg-policies");

driver.findElement(By.cssSelector("twa-datalist-item.flex:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > twa-label:nth-child(1) > label:nth-child(1)")).click();

               Thread.sleep(20000);

                      driver.findElement(By.xpath("/html/body/portal-main/div/div/div/portal-router/div/twa-portal-stage[7]/div/div[2]/twa-nav-menu-stage[22]/div/div[2]/twa-swg-customer-home-vc/twa-lazy-view-stack/div/twa-lazy-view[6]/div/twa-swg-customer-policies/twa-page/div/twa-cbox[2]/twa-collapse/div[1]/twa-tab-panel/twa-tab-strip/div[1]/div/div[1]/div[2]/div/div[1]")).click();

//                WebElement elementRuleOne = driver.findElement(By.xpath("/html/body/portal-main/div/div/div/portal-router/div/twa-portal-stage[7]/div/div[2]/twa-nav-menu-stage[22]/div/div[2]/twa-swg-customer-home-vc/twa-lazy-view-stack/div/twa-lazy-view[6]/div/twa-swg-customer-policies/twa-page/div/twa-cbox[2]/twa-collapse/div[1]/twa-tab-panel/twa-tab-strip/div[1]/div/div[1]/div[2]/div/div[1]"));
//                if (elementRuleOne.isDisplayed() && elementRuleOne.isEnabled()) {
//                    elementRuleOne.click();


                       Thread.sleep(10000);

                     driver.findElement(By.xpath("//*[@id=\"rulesGrid--datalist--action-bar--add-button--icon-button\"]")).click();


//                    WebElement elementRuleTwo = driver.findElement(By.xpath("//*[@id=\"rulesGrid--datalist--action-bar--add-button--icon-button\"]"));
//                    if (elementRuleTwo.isDisplayed() && elementRuleTwo.isEnabled()) {
//                        elementRuleTwo.click();


                        Thread.sleep(10000);

                        driver.findElement(By.cssSelector("#ruleTypesDD > select-dropdown-button:nth-child(1) > div:nth-child(1) > span:nth-child(2)")).click();


                        Thread.sleep(20000);


                        driver.findElement(By.cssSelector("#ruleTypesDD > select-dropdown-button:nth-child(1) > div:nth-child(1) > span:nth-child(2)"));

                        Thread.sleep(5000);


//This one is for Rule Type

         //   driver.findElement(By.xpath("/html/body/div[1]/div[17]/div/div/div/div[2]/div/div[2]/div/material-list/div/div[5]/twa-select-dropdown-item/span")).click();

                        Actions actionObject = new Actions(driver);
                        actionObject = actionObject.sendKeys(Keys.ARROW_DOWN);
                        actionObject.perform();

                        Thread.sleep(500);

                        actionObject = actionObject.sendKeys(Keys.ARROW_DOWN);
                        actionObject.perform();

                        Thread.sleep(500);

                        actionObject = actionObject.sendKeys(Keys.ARROW_DOWN);
                        actionObject.perform();


                        Thread.sleep(500);

                        actionObject = actionObject.sendKeys(Keys.ARROW_DOWN);
                        actionObject.perform();

                        Thread.sleep(500);


                        Thread.sleep(500);

                        actionObject = actionObject.sendKeys(Keys.ENTER);
                        actionObject.perform();

                        Thread.sleep(500);


//This one is for Action

                        Thread.sleep(2000);


                        driver.findElement(By.cssSelector("#actionsDD")).click();


                        Thread.sleep(10000);

                        driver.findElement(By.cssSelector(".options-wrapper > div:nth-child(3)")).click();


                        Thread.sleep(10000);

                        driver.findElement(By.cssSelector("#urlInput")).click();
                        Thread.sleep(500);

                        driver.findElement(By.cssSelector("#urlInput")).sendKeys("www.example.com");

                        Thread.sleep(10000);

                        driver.findElement(By.cssSelector("div.pane:nth-child(10) > material-dialog:nth-child(1) > focus-trap:nth-child(1) > div:nth-child(2) > div:nth-child(1) > footer:nth-child(4) > div:nth-child(1) > twa-button:nth-child(1)")).click();


                        Thread.sleep(40000);


                        driver.findElement(By.xpath("/html/body/portal-main/div/div/div/portal-router/div/twa-portal-stage[7]/div/div[1]/div[3]/twa-swg-change-set-plugin/div/twa-swg-customer-change/div/twa-button/material-button/div/div")).click();


                        Thread.sleep(10000);

                        driver.findElement(By.cssSelector("#changeSetGrid--datalist > div:nth-child(2) > dlmain:nth-child(2) > twa-datalist-table:nth-child(1) > div:nth-child(1) > twa-datalist-column:nth-child(6) > div:nth-child(1) > twa-datalist-format:nth-child(1) > span:nth-child(1)")).click();

                        Thread.sleep(10000);


                        Thread.sleep(20000);


                        driver.findElement(By.xpath("//*[@id=\"rulesDialog--primary-button--div-label\"]")).click();

                        Thread.sleep(20000);

                        driver.close();


                    }


                }

            }







