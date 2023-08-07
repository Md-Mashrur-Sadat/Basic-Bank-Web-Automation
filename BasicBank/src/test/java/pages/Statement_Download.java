package pages;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Statement_Download {

    static WebDriver driver;

    public Statement_Download(WebDriver driver){

        this.driver=driver;
    }

    public static void downloadStatement() throws InterruptedException{

        //Statement Download
        WebElement statementDownload = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[1]/div/div/div/div/div/div/div[5]/a/div/img"));
        statementDownload.click();
        Thread.sleep(3000);

        //Calendar
        WebElement calendar = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
        calendar.click();
        Thread.sleep(3000);
        WebElement selectDate = driver.findElement(By.xpath("//button[contains(text(),'Last month')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", selectDate);
        //selectDate.click();
        Thread.sleep(3000);

        //Click Download Statement
        WebElement downloadStatement = driver.findElement(By.xpath("//button[contains(text(),'Download Statement')]"));
        downloadStatement.click();
        Thread.sleep(3000);

        //Back to Home
        WebElement back = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
        back.click();
    }
}
