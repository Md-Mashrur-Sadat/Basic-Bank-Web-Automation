package Smoke_Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.xpath;

public class BeneficiaryManage {

    static WebDriver driver;

    public BeneficiaryManage(WebDriver driver){
        this.driver=driver;
    }

    public static void addBeneficiary() throws InterruptedException {

        //click beneficiary manage
        WebElement Benef_Man_Button = driver.findElement(xpath("//span[contains(text(),'Beneficiary Manage')]"));
        Benef_Man_Button.click();
        Thread.sleep(3000);

        //click add beneficiary
        WebElement add_Benef_btn = driver.findElement(linkText("Add Beneficiary"));
        add_Benef_btn.click();
        Thread.sleep(3000);

        //select other bank
        WebElement otherBank = driver.findElement(xpath("//input[@id='add_other_bank']"));
        otherBank.click();
        Thread.sleep(3000);

        //Beneficiary Name
        WebElement benefName = driver.findElement(xpath("//input[@id='add-beneficiary-other-bank-nickname']"));
        benefName.sendKeys("Sadat test1");
        Thread.sleep(3000);

        //Beneficiary Account Number
        WebElement benefAccount = driver.findElement(xpath("//input[@id='add-beneficiary-other-bank-account-number']"));
        benefAccount.sendKeys("1234567890121");
        Thread.sleep(3000);

        //Beneficiary Mobile Number
        WebElement benefMobile = driver.findElement(xpath("//input[@id='add-beneficiary-other-bank-mobile-number']"));
        benefMobile.sendKeys("01311111111");
        Thread.sleep(3000);

       // JavascriptExecutor js = (JavascriptExecutor)driver;
       // js.executeScript("window.scrollBy(0,400)");
        //Beneficiary Bank

        /*
       WebDriverWait wait = new WebDriverWait(driver,10);
       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"other_bank_form\"]/form/div[4]/div/div/div[2]/div")));
       element.click();
       */


        WebElement element = driver.findElement(xpath("//*[@id=\"other_bank_form\"]/form/div[4]/div/div/div[2]/div"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(5000);
        element.click();
        Thread.sleep(5000);
        Actions act = new Actions(driver);
        act.sendKeys("AB BANK LTD.").build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(5000);


        WebElement district = driver.findElement(xpath("//*[@id=\"other_bank_form\"]/form/div[5]/div/div/div[1]"));
        Thread.sleep(5000);
        district.click();
        Thread.sleep(3000);
        act.sendKeys("Chittagong").build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(3000);

        WebElement branch = driver.findElement(xpath("//*[@id=\"other_bank_form\"]/form/div[6]/div/div"));
        Thread.sleep(5000);
        branch.click();
        Thread.sleep(3000);
        act.sendKeys("AGRABAD").build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(3000);

        WebElement benefEmail = driver.findElement(xpath("//input[@id='add-beneficiary-other-bank-email-address']"));
        benefEmail.sendKeys("test@gmail.com");

        WebElement terms = driver.findElement(xpath("//*[@id=\"add-beneficiary-other-bank-is-accept-terms\"]"));
        terms.click();

        WebElement next = driver.findElement(xpath("//*[@id=\"other_bank_form\"]/form/div[10]/button"));
        next.click();
        Thread.sleep(5000);

        WebElement benefOtp = driver.findElement(xpath("//input[@id='mobile_recharge_otp']"));
        benefOtp.sendKeys("12345");
        Thread.sleep(5000);

        WebElement verifyBtn = driver.findElement(xpath("/html/body/div[3]/div/div/div/div/form/div[2]/button[2]"));
        verifyBtn.click();
        Thread.sleep(5000);


        WebElement backHome = driver.findElement(linkText("Back to Home"));
        executor.executeScript("arguments[0].scrollIntoView(true);", backHome);
        Thread.sleep(5000);
        backHome.click();
        Thread.sleep(3000);


        /*
        Actions act = new Actions(driver);
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(3000);
        */

        /*
        WebElement sendtext = driver.findElement(By.name("bank_id"));
        sendtext.sendKeys("AB BANK LTD.");
        Thread.sleep(3000);
        */


        //Actions actions = new Actions(driver);
        //actions.moveToElement(element).click().build().perform();
        Thread.sleep(5000);
/*

        //Beneficiary Manage
        WebElement Benef_Man_Button2 = driver.findElement(xpath("//span[contains(text(),'Beneficiary Manage')]"));
        Benef_Man_Button2.click();
        Thread.sleep(3000);

        //Other Bank
        WebElement otherBank2 = driver.findElement(By.xpath("//label[contains(text(),'Other Bank')]"));
        otherBank2.click();
        Thread.sleep(3000);

        //Action button
        WebElement actBtn = driver.findElement(By.xpath("//*[@id=\"dropdown-basic\"]/img"));
        actBtn.click();
        Thread.sleep(3000);

*/


    }
}
