package Telran.com.TraningTest;

import Telran.com.Training.RegisrtationAfoninaPage;
import Telran.com.Training.RegisrtationNegativeAfoninaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

//@org.testng.annotations.Listeners(FailTestScreenshotListener.class)
public class RegistrationNegativeAfoninaTests {

    public RegisrtationNegativeAfoninaPage registrationNegativeAfoninaPage;
    public RegisrtationAfoninaPage registrationAfoninaPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        registrationNegativeAfoninaPage = PageFactory.initElements(driver, RegisrtationNegativeAfoninaPage.class);
        registrationAfoninaPage = PageFactory.initElements(driver, RegisrtationAfoninaPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
        registrationAfoninaPage.openLoginRegistrationPage();
    }

    @Test
    public void test() throws IOException, InterruptedException {

        // Log.info("TestLoginWithExtData was started....");

        registrationAfoninaPage.waitUntilClinicNameIsLoaded();
        registrationAfoninaPage.clickAddNewUser();
        registrationNegativeAfoninaPage.verifyuserNameRequiredIsPresent();
        registrationNegativeAfoninaPage.verifyfirstNameRequiredPresent();
        registrationNegativeAfoninaPage.verifylastNameRequairedIsPresent();
        registrationNegativeAfoninaPage.verifyEmaiRequiredIsPresent();
        registrationNegativeAfoninaPage.verifyPasswordRequiredIsPresent();


        // Assert.assertTrue(loginPage.isLoginUnsuccessfulAlertMessageDisplayed());
        // Log.info("TestLoginWithExtData stoped....");
    }


    // test of clicking on Registration link are written in another class

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}