package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class Transaction_Limit {

    static WebDriver driver;

    public Transaction_Limit(WebDriver driver){

        this.driver=driver;
    }

    public static void customizeLimit() throws InterruptedException{

        //Hover on Others menu
        WebElement othersMenu = driver.findElement(By.xpath("//span[contains(text(),'Others')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(othersMenu).perform();
        Thread.sleep(3000);

        //Select ATM/Branch transfer
        WebElement transactionLimit = driver.findElement(By.xpath("//a[contains(text(),'Transaction Limit')]"));
        transactionLimit.click();
        Thread.sleep(3000);

        //Click Customize
        WebElement customize = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[2]/div/div/div/div[1]/table/tfoot/tr/td[2]/button"));
        customize.click();
        Thread.sleep(5000);

        //Daily Transaction Limit
        WebElement transLimit = driver.findElement(By.xpath("//input[@id='transaction_limit']"));
        //transLimit.clear();
        String inputText = transLimit.getAttribute("value");
        if( inputText != null ) {
            for(int i=0; i<inputText.length();i++) {
                transLimit.sendKeys(Keys.BACK_SPACE);
            }
        }

        transLimit.sendKeys("3"); //Default value:2
        Thread.sleep(3000);

        //Daily Amount Limit
        WebElement amountLimit = driver.findElement(By.xpath("//input[@id='amount_limit']"));
        //amountLimit.clear();
        String inputText2 = amountLimit.getAttribute("value");
        if( inputText2 != null ) {
            for(int i=0; i<inputText2.length();i++) {
                amountLimit.sendKeys(Keys.BACK_SPACE);
            }
        }

        amountLimit.sendKeys("201");    //Default Value: 200
        Thread.sleep(3000);

        //Update
        WebElement update = driver.findElement(By.xpath("//button[contains(text(),'Update')]"));
        update.click();
        Thread.sleep(3000);

        //Home
        WebElement home = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
        home.click();
        Thread.sleep(3000);
    }
}
