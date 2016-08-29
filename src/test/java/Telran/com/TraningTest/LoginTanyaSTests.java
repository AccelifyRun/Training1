package Telran.com.TraningTest;

import Telran.com.Training.LoginTanyaSPage;
import Telran.com.pages.LoginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Boss on 01.08.2016.
 */
public class LoginTanyaSTests {
    // private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public static String registered_username = "Tanya";
    public static String registered_password = "12345Tan%";
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public LoginPage loginPage;
    public LoginTanyaSPage loginTanyaSPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {

    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {

        driver = new ChromeDriver();


    }

    @Test
    public void testLoginWithExtData() throws IOException, InterruptedException {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
        // Log.info("TestLoginWithExtData was started....");
        //loginTanyaSPage.waitUntilLoginPageIsLoaded();
        loginTanyaSPage.clickRegisterHyperLink()
                .fillUsernameField("Tanya")
                .fillFirstNameField("Tanya")
                .fillLastNameField("Sul")
                .fillEmailField("tan3su@gmail.com")
                .fillPassword("12345Tan%")
                .fillConfirmPassword("12345Tan%")
                .fillPersonalId("332441153")
                .clickFieldClinicAdmin()
                .clickFieldClinicAdmin()
                .fillClinicaName("Hadassa")
                .clickDropdownNameField()
                .fillBirthday("3.01.1974")
                .fillContactCellTxt("0525670643")
                .fillContactPhoneTxt("0507695005")
                .fillAddressTxt("Volfson")
                .fillHouseNumberTxt("2")
                .fillCityTxt("ראשון לציון");

        // Assert.assertTrue(loginPage.isLoginUnsuccessfulAlertMessageDisplayed());
        // Log.info("TestLoginWithExtData stoped....");
    }


    // test of clicking on Registration link are written in another class

    //@AfterClass(alwaysRun = true)
    //public void tearDown() {
    //  this.driver.quit();
//    }

}
