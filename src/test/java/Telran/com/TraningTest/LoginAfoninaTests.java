package Telran.com.TraningTest;

import Telran.com.Training.LoginAfoninaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//@org.testng.annotations.Listeners(FailTestScreenshotListener.class)
public class LoginAfoninaTests {
    // private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public static String username = "3339Doctor";
    public static String password = "LinkCare!!11";
    public LoginAfoninaPage loginAfoninaPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        loginAfoninaPage = PageFactory.initElements(driver, LoginAfoninaPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il");
        loginAfoninaPage.openLoginPage();
    }

    @Test
    public void testLoginWithExtData() {

        // Log.info("TestLoginWithExtData was started....");
        loginAfoninaPage.waitUntilLoginButtonIsLoaded();
        loginAfoninaPage.clickUserName();
        loginAfoninaPage.fillUserNameField(username);
        loginAfoninaPage.clickPassord();
        loginAfoninaPage.fillPassword(password);
        loginAfoninaPage.clickconfirmUsingCheckBox();
        loginAfoninaPage.clickLoginButton();

        // Assert.assertTrue(loginPage.isLoginUnsuccessfulAlertMessageDisplayed());
        // Log.info("TestLoginWithExtData stoped....");
    }


    // test of clicking on Registration link are written in another class

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}