package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class TransactionHistory {

    static WebDriver driver;

    public TransactionHistory(WebDriver driver){

        this.driver=driver;
    }

    public static void transferHistory() throws InterruptedException{

        //Hover on Fund transfer menu
        WebElement fundTransferMenu = driver.findElement(By.xpath("//span[contains(text(),'Fund Transfer')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fundTransferMenu).perform();
        Thread.sleep(3000);

        //Select Transfer History
        WebElement transfer_Histroy = driver.findElement(By.xpath("//a[contains(text(),'Transfer History')]"));
        transfer_Histroy.click();
        Thread.sleep(3000);

        //Select Transfer type
        WebElement transferType = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]"));
        transferType.click();
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.sendKeys("Fund Transfer").build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(3000);

        //Select Account
        WebElement accountType = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/div/div/div[1]/div[2]"));
        accountType.click();
        Thread.sleep(3000);
        act.sendKeys("0214010000242").build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(3000);

        //Select Date
        WebElement calendar = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div[3]/div/div/div/div[1]/span"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", calendar);
        calendar.click();
        Thread.sleep(3000);
        WebElement thirtyDays = driver.findElement(By.xpath("//button[contains(text(),'Last 30 days')]"));
        thirtyDays.click();
        Thread.sleep(3000);
        /*JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].value='Jun 10, 2023 ~ Jun 18, 2023';", calendar);
        Thread.sleep(3000);
*/
        //Click Search
        WebElement searchBtn = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/button"));
        searchBtn.click();
        Thread.sleep(5000);

        //Go to Home
        WebElement back = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[1]/div/div/div/div/div/div/div/a/img"));
        back.click();
        Thread.sleep(3000);


    }
}
