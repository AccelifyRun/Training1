package Telran.com.TraningTest;

import Telran.com.DataProviders;
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

import static java.lang.Thread.sleep;

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
        registrationLioraPage.fillUserNameField("0104Doctor")
                    .fillFirstNameField("John")
                    .fillLastNameField("Snow")
                    .fillEmailField("bbb@aaa.com")
                    .fillPasswordField("test12345678")
                    .fillConfirmPasswordField("test12345678")
                    .fillPersonallDField("337657852")
                    .fillcontactCellField("34534534547")
                    .fillstreetField("King George")
                    .fillhouseField("8")
                    .fillcityField("Jerusalem")
                    .fillclinicNameField("Test clinic3")
                    .clickOnAddUserButton()
                    .waitUntilDoctorPageIsLoaded();

    }

    @Test
    public void registrationNegative() throws Exception {
        registrationLioraPage.clickOnAddUserButton()
                             .verifyRequiredFieldsValidations();

    }

    @Test (dataProviderClass = DataProviders.class, dataProvider = "loadNegativeRegistrationFromFileLiora")
    public void registrationNegativeWithDataProvider(String userName, String firstName,String lastName,String email,String password,
                                                     String confirmPassword,String personalId,String contactCell,
                                                     String street,String house,String city,String clinicName,
                                                     String number, String message) throws Exception {
        Log.info("Negative registration test");
        registrationLioraPage.fillUserNameField(userName)
                .fillFirstNameField(firstName)
                .fillLastNameField(lastName)
                .fillEmailField(email)
                .fillPasswordField(password)
                .fillConfirmPasswordField(confirmPassword)
                .fillPersonallDField(personalId)
                .fillcontactCellField(contactCell)
                .fillstreetField(street)
                .fillhouseField(house)
                .fillcityField(city)
                .fillclinicNameField(clinicName)
                .clickOnAddUserButton();
        Thread.sleep(2000);
        Assert.assertEquals(registrationLioraPage.waitAndGetTextOfSelectedMessage(number), message, "Message is not correct");
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}
