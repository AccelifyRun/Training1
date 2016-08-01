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
        registrationRutPage.isOnRegistrationPage();
    }

    @Test
    public void testLoginWithExtData() throws IOException, InterruptedException {
        driver.get("http://dhclinicappv2stg.item-soft.co.il");
        Log.info("TestLoginWithExtData was started....");
        loginRutPage.clickToAddNewUser();
        registrationRutPage.isOnRegistrationPage();
        registrationRutPage.fillFirstNameField("aaa");
        registrationRutPage.fillLastNameField("bbb");
//         Assert.assertTrue(loginPage.isLoginUnsuccessfulAlertMessageDisplayed());
         Log.info("TestLoginWithExtData stoped....");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}