package Telran.com.TraningTest;

import Telran.com.Training.DoctorRutPage;
import Telran.com.Training.LoginRutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by rutga on 09.08.2016.
 */
public class DoctorRutTest {
    //    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public LoginRutPage loginRutPage;
    public DoctorRutPage doctorRutPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        loginRutPage = PageFactory.initElements(driver, LoginRutPage.class);
        doctorRutPage = PageFactory.initElements(driver, DoctorRutPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() throws IOException, InterruptedException {
        loginRutPage.openLoginPage();
        loginRutPage.waitUntilLoginPageIsLoded();
        loginRutPage.loginDoctor();
        doctorRutPage.waitUntilDoctorsPageIsLoaded();
    }

    @Test
    public void addPatient() {
        doctorRutPage.clickToAddPatient();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}
