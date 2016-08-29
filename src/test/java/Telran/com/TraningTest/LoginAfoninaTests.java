package Telran.com.TraningTest;

import Telran.com.DataProviders;
import Telran.com.Training.DoctorAfoninaPage;
import Telran.com.Training.LoginAfoninaPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import org.testng.log4testng.Logger;

//@org.testng.annotations.Listeners(FailTestScreenshotListener.class)
public class LoginAfoninaTests {

    public static String username = "5555Doctor";
    public static String password = "LinkCare!!11";
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public LoginAfoninaPage loginAfoninaPage;
    public DoctorAfoninaPage doctorAfoninaPage;
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
    public void testLoginWithExtData() throws InterruptedException {

        // Log.info("TestLoginWithExtData was started....");
        loginAfoninaPage.waitUntilLoginButtonIsLoaded()
                .fillUserNameField(username)
                .fillPassword(password)
                .clickconfirmUsingCheckBox()
                .clickLoginButton();
        Thread.sleep(5000);
        Assert.assertTrue(loginAfoninaPage.isOnLoginPage(), "Something is wrong");

        // Assert.assertTrue(loginPage.isLoginUnsuccessfulAlertMessageDisplayed());
        // Log.info("TestLoginWithExtData stoped....");
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "loadInvalidLoginFromFile")
    public void testNegativeLogin(String username, String password) throws InterruptedException {

        // Log.info("TestLoginWithExtData was started....");
        loginAfoninaPage.waitUntilLoginButtonIsLoaded()
                .fillUserNameField(username)
                .fillPassword(password)
                .clickconfirmUsingCheckBox()
                .clickLoginButton();
        // doctorAfoninaPage.waitUntilExitIsLoaded();
        // Assert.assertTrue(doctorAfoninaPage.isOnDoctorPage(), "We are not is on the doctor's page");


        // Assert.assertTrue(loginPage.isLoginUnsuccessfulAlertMessageDisplayed());
        // Log.info("TestLoginWithExtData stoped....");
    }

    @Test
    public void testNegativeLoginWithExtData() throws InterruptedException {

        // Log.info("TestLoginWithExtData was started....");
        loginAfoninaPage.waitUntilLoginButtonIsLoaded()
                .fillUserNameField(username)
                .fillPassword(password)
                .clickconfirmUsingCheckBox()
                .clickLoginButton();
        doctorAfoninaPage.waitUntilExitIsLoaded();
        Assert.assertTrue(doctorAfoninaPage.isOnDoctorPage(), "We are not is on the doctor's page");


        // Assert.assertTrue(loginPage.isLoginUnsuccessfulAlertMessageDisplayed());
        // Log.info("TestLoginWithExtData stoped....");
    }
    // test of clicking on Registration link are written in another class

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}