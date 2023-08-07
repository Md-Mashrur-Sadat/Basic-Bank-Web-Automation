package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Add_Feedback {

    static WebDriver driver;

    public Add_Feedback(WebDriver driver){

        this.driver = driver;
    }

    public static void createFeedback() throws InterruptedException{

        //Hover on Others menu
        WebElement othersMenu = driver.findElement(By.xpath("//span[contains(text(),'Others')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(othersMenu).perform();
        Thread.sleep(3000);

        //Select Add Feedback/Complain
        WebElement addFeedback = driver.findElement(By.xpath("//a[contains(text(),'Add Feedback/Complains')]"));
        addFeedback.click();
        Thread.sleep(3000);

        //Complain/Feedback
        WebElement feedback = driver.findElement(By.xpath("//textarea[@id='complain-or-feedback-input-remarks']"));
        feedback.sendKeys("Balance is not showing correct amount");
        Thread.sleep(3000);

        //File upload
        WebElement uploadElement = driver.findElement(By.xpath("//input[@id='formFile']"));
        uploadElement.sendKeys("C:\\Users\\mashrur.sadat\\IdeaProjects\\BasicBank\\images\\Motor-vaja-01F.jpg");
        Thread.sleep(3000);

        //Rate Experience
        WebElement emoji = driver.findElement(By.xpath("//label[@for='feedbackradio2']"));
        emoji.click();
        Thread.sleep(3000);

        //Submit
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();
        Thread.sleep(7000);

        //Close
        WebElement close = driver.findElement(By.xpath("//button[contains(text(),'Close')]"));
        close.click();
        Thread.sleep(3000);

    }
}
