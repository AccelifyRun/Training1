package Telran.com.TraningTest;

import Telran.com.LogLog4j;
import Telran.com.Training.LoginRutPage;
import Telran.com.Training.RegistrationRutPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by rut on 01.08.2016.
 */
public class RegistrationRutTest {

    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public LoginRutPage loginRutPage;
    public RegistrationRutPage registrationRutPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        loginRutPage = PageFactory.initElements(driver, LoginRutPage.class);
        registrationRutPage = PageFactory.initElements(driver, RegistrationRutPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() throws IOException, InterruptedException {
        loginRutPage.openLoginPage();
        loginRutPage.clickToAddNewUser();
        registrationRutPage.waitUntilRegPageIsLoaded();
    }

    @Test
    public void testLoginWithExtData() throws IOException, InterruptedException {
//        Log.info("TestLoginWithExtData was started...");
        registrationRutPage.fillUsernameField("0055Doctor");
        registrationRutPage.fillFirstNameField("name");
        registrationRutPage.fillLastNameField("lastname");
        registrationRutPage.fillMailField("0055Doctor@yopmail.com");
        registrationRutPage.fillPasswordField("LinkCare!!11");
        registrationRutPage.fillConfirmPasswordField("LinkCare!!11");
        registrationRutPage.filllDField("423282763");
        registrationRutPage.fillClinicNameField("BestClinic");
        registrationRutPage.fillBirthdayField("11122012");
        registrationRutPage.fillMobilePhoneField("1111111111");
        registrationRutPage.fillPhoneField("222222222");
        registrationRutPage.fillStreetField("Morgentau");
        registrationRutPage.fillHouseField("5");
        registrationRutPage.fillCityField("Jerusalem");
        registrationRutPage.clickOnAddUserButton();

//        assertFalse("We are not on the Registration page", registrationRutPage.isOnRegistrationPage());

//         Assert.assertTrue(loginPage.isLoginUnsuccessfulAlertMessageDisplayed());
//         Log.info("TestLoginWithExtData stoped...");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}
