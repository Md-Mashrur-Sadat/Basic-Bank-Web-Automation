import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;

public class mainclass {
    //public static void main(String[] args) throws InterruptedException, IOException
    WebDriver driver;
    @BeforeTest
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mashrur.sadat\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ibuat.basicbanklimited.com/");
        System.out.println(driver.getTitle() + " - Automation by Md. Mashrur Sadat");
    }
        //Login

    @Test(priority = 0)
    public void runLogin() throws InterruptedException {
            login objLogin = new login(driver);
            objLogin.signin();
        }


        @Test(priority = 1)
        //Own Account Transfer
        public void runOwnAccountTransfer() throws InterruptedException {
            OwnAccountTransfer objOwnAccountTransfer = new OwnAccountTransfer(driver);
            objOwnAccountTransfer.transfer_Own();
        }
/*
        //Basic Bank Transfer
        BasicBankTransfer objBasicBankTransfer = new BasicBankTransfer(driver);
        objBasicBankTransfer.transfer_Basic();

        //Add Beneficiary
        BeneficiaryManage objBenManage = new BeneficiaryManage(driver);
        objBenManage.addBeneficiary();


        //Fund Transfer - BEFTN
        BEFTN_Transfer objBEFTN_Transfer = new BEFTN_Transfer(driver);
        objBEFTN_Transfer.transfer_BEFTN();

        //Fund Transfer - RTGS
        RTGS_Transfer objRTGS_Transfer = new RTGS_Transfer(driver);
        objRTGS_Transfer.transfer_RTGS();

        //Transaction History
        TransactionHistory objTransactionHistory = new TransactionHistory(driver);
        objTransactionHistory.transferHistory();




        //Find ATM/Branch
        ATM_Branch_Finder objATM = new ATM_Branch_Finder(driver);
        objATM.findBranchAtm();

        //Transaction Limit
        Transaction_Limit objTransaction_Limit = new Transaction_Limit(driver);
        objTransaction_Limit.customizeLimit();

        //Add Feedback/Complain
        Add_Feedback objAdd_Feedback = new Add_Feedback(driver);
        objAdd_Feedback.createFeedback();

        //Complain List
        Complain_List objComplain_List = new Complain_List(driver);
        objComplain_List.viewComplain();

        //Statement Download
        Statement_Download objStatement = new Statement_Download(driver);
        objStatement.downloadStatement();

        //Logout
        Logout objLogout = new Logout(driver);
        objLogout.signOut();

        driver.close();
*/

}
