package Telran.com.TraningTest;

import Telran.com.Training.LoginRutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by rut on 01.08.2016.
 */
public class LoginRutTest {
    public LoginRutPage loginRutPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        loginRutPage = PageFactory.initElements(driver, LoginRutPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
//        driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
        loginRutPage.openLoginPage();
    }

    @Test
    public void clickOnRegistrationNewUser() {
        loginRutPage.clickToAddNewUser();
    }
    @Test
    public void clickOnForgotPassword() {
        loginRutPage.clickToForgotPassword();

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}
