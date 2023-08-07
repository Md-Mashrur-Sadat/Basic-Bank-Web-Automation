package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Complain_List {

    static WebDriver driver;

    public Complain_List(WebDriver driver){

        this.driver=driver;
    }

    public static void viewComplain() throws InterruptedException{

        //Hover on Others menu
        WebElement othersMenu = driver.findElement(By.xpath("//span[contains(text(),'Others')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(othersMenu).perform();
        Thread.sleep(3000);

        //Select Feedback/Complain List
        WebElement complainList = driver.findElement(By.xpath("//a[contains(text(),'Feedback/Complain List')]"));
        complainList.click();
        Thread.sleep(3000);

        //Scroll down and up
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //js.executeScript("window.scrollTo(0,0)");

        //Home
        WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
        //js.executeScript("arguments[0].scrollIntoView();", home);
        home.click();
        Thread.sleep(3000);
    }
}
