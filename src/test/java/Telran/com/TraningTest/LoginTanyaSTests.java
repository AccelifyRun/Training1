package Telran.com.TraningTest;

import Telran.com.Training.LoginTanyaSPage;
import Telran.com.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Boss on 01.08.2016.
 */
public class LoginTanyaSTests {

    // private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public static String registered_username = "Tanya";
    public static String registered_password = "12345Tan%";
    public LoginPage loginPage;
    public LoginTanyaSPage loginTanyaSPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginTanyaSPage = PageFactory.initElements(driver, LoginTanyaSPage.class);
        driver = new ChromeDriver();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {


    }

    @Test
    public void testLoginWithExtData() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
        // Log.info("TestLoginWithExtData was started....");
        loginTanyaSPage.clickRegisterHyperLink();
        loginTanyaSPage.fillUsernameField("Tanya");
        loginTanyaSPage.fillFirstNameField("Tanya");
        loginTanyaSPage.fillLastNameField("Sul");
        loginTanyaSPage.fillEmailField("tan3su@gmail.com");
        loginTanyaSPage.fillPassword("12345Tan%");
        loginTanyaSPage.fillConfirmPassword("12345Tan%");
        loginTanyaSPage.fillPersonalId("332441153");
        loginTanyaSPage.clickFieldClinicAdmin();
        loginTanyaSPage.clickFieldClinicAdmin();
        loginTanyaSPage.fillClinicaName("Hadassa");
        loginTanyaSPage.clickDropdownNameField();
        loginTanyaSPage.fillBirthday("3.01.1974");
        loginTanyaSPage.fillContactCellTxt("0525670643");
        loginTanyaSPage.fillContactPhoneTxt("0507695005");
        loginTanyaSPage.fillAddressTxt("Volfson");
        loginTanyaSPage.fillHouseNumberTxt("2");
        loginTanyaSPage.fillCityTxt("ראשון לציון");

        // Assert.assertTrue(loginPage.isLoginUnsuccessfulAlertMessageDisplayed());
        // Log.info("TestLoginWithExtData stoped....");
    }


    // test of clicking on Registration link are written in another class

    //@AfterClass(alwaysRun = true)
    //public void tearDown() {
    //  this.driver.quit();
//    }

}
