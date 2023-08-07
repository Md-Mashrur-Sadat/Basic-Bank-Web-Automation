package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class login {
    static WebDriver driver;


    public login(WebDriver driver){

        this.driver = driver;
    }

    public static void signin() throws InterruptedException {

        //Enter UserID
        WebElement userId = driver.findElement(By.id("login-input-user-id"));
        userId.sendKeys("TestAutomate");
        Thread.sleep(3000);

        //Enter Password
        WebElement password = driver.findElement(By.id("login-input-user-password"));
        password.sendKeys("Pass123##");
        Thread.sleep(3000);

        //Get Login OTP
        WebElement loginOtp = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]"));
        loginOtp.click();
        Thread.sleep(5000);


        WebElement otp = driver.findElement(By.xpath("//input[@id='login-otp-input-otp']"));
        otp.sendKeys("12345");
        Thread.sleep(3000);

        WebElement submitOTP = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]"));
        submitOTP.click();
        Thread.sleep(5000);



    }
}
