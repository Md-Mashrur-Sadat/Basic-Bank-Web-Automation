package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Objects;

public class OwnAccountTransfer {

    static WebDriver driver;

    public OwnAccountTransfer(WebDriver driver){

        this.driver=driver;
    }

    public static void transfer_Own() throws InterruptedException{

        //Hover on fund transfer menu
        WebElement fundTransferMenu = driver.findElement(By.xpath("//span[contains(text(),'Fund Transfer')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fundTransferMenu).perform();
        Thread.sleep(3000);

        //Select Own Account Transfer
        WebElement own_Account = driver.findElement(By.xpath("//a[contains(text(),'Own Account Transfer')]"));
        own_Account.click();
        Thread.sleep(3000);

        //Select Account
        WebElement accountFrom = driver.findElement(By.xpath("//*[@id=\"from_account_number\"]/div/div[1]/div[2]"));
        accountFrom.click();
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.sendKeys("0214010000242").build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(3000);

        //Transfer To
        WebElement accountTo = driver.findElement(By.xpath("//*[@id=\"to_account_number\"]/div/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", accountTo);
        Thread.sleep(3000);
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys("0214120000024").build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(3000);

        //Enter Amount
        WebElement amount = driver.findElement(By.xpath("//input[@placeholder='Enter Amount']"));
        amount.sendKeys("20");

        //Enter Narration
        WebElement narration = driver.findElement(By.xpath("//input[@placeholder='Write a note here']"));
        narration.sendKeys("Test Narration text");

        //Terms & Conditions check
        WebElement termsbtn = driver.findElement(By.xpath("//input[@id='checkDefault']"));
        Thread.sleep(3000);
        //JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", termsbtn);
        Thread.sleep(5000);
        termsbtn.click();

        //NEXT
        WebElement next = driver.findElement(By.xpath("//button[@id='submit']"));
        next.click();
        Thread.sleep(3000);

        //NEXT again //body/div[@id='__next']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]
        WebElement next2 = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]"));
        executor.executeScript("arguments[0].scrollIntoView(true);", next2);
        Thread.sleep(3000);
        next2.click();
        Thread.sleep(5000);

        //Enter OTP
        WebElement otp = driver.findElement(By.xpath("//input[@id='mobile_recharge_otp']"));
        otp.sendKeys("12345");

        //Click Verify
        WebElement verify = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[2]"));
        verify.click();
        Thread.sleep(5000);

        //Success Message
        WebElement successMsg = driver.findElement(By.xpath("//h6[contains(text(),'Own Account Fund Transfer Successful')]"));
        String expMsg = "Own Account Fund Transfer Successful";
        //System.out.println(successMsg.getText());

        if(expMsg.equals(successMsg.getText())){

            System.out.println("Own Account Fund Transfer - Test passed");

        }else {
            System.out.println("Own Account Fund Transfer - Test Failed");
        }


        //Back to Home
        WebElement backHome1 = driver.findElement(By.linkText("Back to Home"));
        executor.executeScript("arguments[0].scrollIntoView(true);", backHome1);
        Thread.sleep(5000);
        backHome1.click();
        Thread.sleep(3000);

    }

}
