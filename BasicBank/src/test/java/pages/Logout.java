package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {

    static WebDriver driver;

    public Logout(WebDriver driver){

        this.driver=driver;
    }

    public static void signOut() throws InterruptedException{

        //Logout
        WebElement logout = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/div[2]/a[2]"));
        logout.click();
    }


}
