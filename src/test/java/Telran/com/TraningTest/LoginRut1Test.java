package Telran.com.TraningTest;

import Telran.com.Training.LoginRutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by rut on 01.08.2016.
 */
public class LoginRut1Test {
    public LoginRutPage loginRutPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        loginRutPage = PageFactory.initElements(driver, LoginRutPage.class);
//        driver = new ChromeDriver();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
    }

    @Test
    public void testLogin() {
        loginRutPage.clickToAddNewUser();
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}
