package Telran.com.TraningTest;

import Telran.com.Training.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Liora on 8/13/2016.
 */
public class RegitrationLioraTest {
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public LoginLioraPage loginLioraPage;
    public RegistrationLioraPage registrationLioraPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        loginLioraPage = PageFactory.initElements(driver, LoginLioraPage.class);
        registrationLioraPage = PageFactory.initElements(driver, RegistrationLioraPage.class);

    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() throws IOException, InterruptedException {
        loginLioraPage.openLoginPage()
                      .clickToAddNewUser()
                      .waitUntilRegPageIsLoaded();
        driver.manage().window().maximize();
    }

    @Test
    public void registrationPositive() throws Exception {
        registrationLioraPage.fillUserNameField("0102Doctor")
                    .fillFirstNameField("John")
                    .fillLastNameField("Snow")
                    .fillEmailField("aaa@aaa.com")
                    .fillPasswordField("test12345678")
                    .fillConfirmPasswordField("test12345678")
                    .fillPersonallDField("337657852")
                    .fillcontactCellField("34534534547")
                    .fillstreetField("King George")
                    .fillhouseField("8")
                    .fillcityField("Jerusalem")
                    .fillclinicNameField("Test clinic1")
                    .clickOnAddUserButton()
                    .waitUntilDoctorPageIsLoaded();

        //Thread.sleep(5000);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}
