package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.By.linkText;

public class BEFTN_Transfer {

    static WebDriver driver;

    public BEFTN_Transfer(WebDriver driver){

        this.driver=driver;
    }

    public static void transfer_BEFTN() throws InterruptedException{

        //Hover on fund transfer menu
        WebElement fundTransferMenu = driver.findElement(By.xpath("//span[contains(text(),'Fund Transfer')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fundTransferMenu).perform();
        Thread.sleep(3000);

        //Select BEFTN
        WebElement other_BEFTN = driver.findElement(By.xpath("//a[contains(text(),'Other Bank Fund Transfer - BEFTN')]"));
        other_BEFTN.click();
        Thread.sleep(3000);

        //Select Account
        WebElement account = driver.findElement(By.xpath("//*[@id=\"from_account_number\"]/div/div[1]"));
        account.click();
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.sendKeys("0214010000242").build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(3000);

        //Select Beneficiary
        WebElement selectBeneficiary = driver.findElement(By.xpath("//*[@id=\"to_account_number\"]/div/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", selectBeneficiary);
        Thread.sleep(3000);
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys("1234567890121").build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(3000);

        //Enter Amount
        WebElement amount = driver.findElement(By.xpath("//input[@placeholder='Enter Amount']"));
        amount.sendKeys("20"); //Minimum amount 20

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

        //NEXT again
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
        WebElement successMsg = driver.findElement(By.xpath("//h6[contains(text(),'Other Bank Fund Transfer Successful')]"));
        String expMsg = "Other Bank Fund Transfer Successful";
        //System.out.println(successMsg.getText());

        if(expMsg.equals(successMsg.getText())){

            System.out.println("BEFTN Fund Transfer - Test passed");

        }else {
            System.out.println("BEFTN Fund Transfer - Test Failed");
        }

        //Back to Home
        WebElement backHome1 = driver.findElement(linkText("Back to Home"));
        executor.executeScript("arguments[0].scrollIntoView(true);", backHome1);
        Thread.sleep(5000);
        backHome1.click();
        Thread.sleep(3000);

    }
}
