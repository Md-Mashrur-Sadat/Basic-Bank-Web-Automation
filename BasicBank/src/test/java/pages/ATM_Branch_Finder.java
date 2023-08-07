package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ATM_Branch_Finder {

    static WebDriver driver;

    public ATM_Branch_Finder(WebDriver driver){

        this.driver=driver;

    }

    public static void findBranchAtm() throws InterruptedException{

        //Hover on Others menu
        WebElement othersMenu = driver.findElement(By.xpath("//span[contains(text(),'Others')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(othersMenu).perform();
        Thread.sleep(3000);

        //Select ATM/Branch transfer
        WebElement atmBranch = driver.findElement(By.xpath("//a[contains(text(),'ATM/Branch Finder')]"));
        atmBranch.click();
        Thread.sleep(3000);

        //Search Input
        WebElement searchInput = driver.findElement(By.xpath("//input[@id='atm-and-branch-input-search']"));
        searchInput.sendKeys("Dilkusha Branch ATM");
        Thread.sleep(3000);

        //Select Type
        WebElement type = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/div/div/div[1]/div[2]"));
        type.click();
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.sendKeys("ATM").build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(3000);

        //Select Division
        WebElement division = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div[3]/div/div/div[1]/div[2]"));
        division.click();
        Thread.sleep(3000);
        act.sendKeys("Dhaka").build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(3000);

        //Select District
        WebElement district = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div[4]/div/div/div[1]/div[2]"));
        district.click();
        Thread.sleep(3000);
        act.sendKeys("Dhaka").build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(3000);

        //Click Search
        WebElement searchBtn = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]"));
        searchBtn.click();
        Thread.sleep(3000);

        //Go to Home
        WebElement back = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
        back.click();
        Thread.sleep(3000);

    }
}
