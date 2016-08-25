package Telran.com.TraningTest;

import Telran.com.DataProviders;
import Telran.com.LogLog4j;
import Telran.com.Training.DoctorRutPage;
import Telran.com.Training.LoginRutPage;
import Telran.com.Training.RegistrationRutPage;
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
 * Created by rut on 01.08.2016.
 */
public class RegistrationRutTest {

    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public LoginRutPage loginRutPage;
    public RegistrationRutPage registrationRutPage;
    public DoctorRutPage doctorRutPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        loginRutPage = PageFactory.initElements(driver, LoginRutPage.class);
        registrationRutPage = PageFactory.initElements(driver, RegistrationRutPage.class);
        doctorRutPage = PageFactory.initElements(driver, DoctorRutPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() throws IOException, InterruptedException {
        loginRutPage.openLoginPage();
        loginRutPage.isOnLoginPage();
        loginRutPage.clickToAddNewUser();
        registrationRutPage.waitUntilRegPageIsLoaded();
    }

    @Test
    public void registrationPositive() throws InterruptedException, IOException {
        Log.info("Test registrationPositive was started...");

        registrationRutPage
                .fillUsernameField("2255Doctor")
                .fillFirstNameField("name")
                .fillLastNameField("lastname")
                .fillMailField("2255Doctor@yopmail.com")
                .fillPasswordField("LinkCare!!11")
                .fillConfirmPasswordField("LinkCare!!11")
                .filllDField("550454433")
                .fillClinicNameField("BestClinic2")
                .fillBirthdayField("11122012")
                .fillMobilePhoneField("1111111111")
                .fillPhoneField("222222222")
                .fillStreetField("Morgentau")
                .fillHouseField("5")
                .fillCityField("Jerusalem")
                .clickOnAddUserButton();

        Thread.sleep(5000);
        Assert.assertTrue(doctorRutPage.isOnDoctorPage(), "Something is wrong, we are on Registration Page");
//        Assert.assertTrue(registrationRutPage.isOnRegistrationPage(), "Something is wrong, we are on Registration Page");
        Log.info("Assert is passed");
        Log.info("Test registrationPositive stoped...");
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "loadNegativeDataForRegistrationRut")
    public void registrationNegative(String username, String firstName, String lastName, String email, String password,
                                     String confirmPassword, String id, String clinicName, String birthday, String mobile,
                                     String phone, String street, String house) throws InterruptedException, IOException {
        Log.info("Test registrationNegative was started..");

        registrationRutPage
                .fillUsernameField(username)
                .fillFirstNameField(firstName)
                .fillLastNameField(lastName)
                .fillMailField(email)
                .fillPasswordField(password)
                .fillConfirmPasswordField(confirmPassword)
                .filllDField(id)
                .fillClinicNameField(clinicName)
                .fillBirthdayField(birthday)
                .fillMobilePhoneField("1111111111")
                .fillPhoneField("222222222")
                .fillStreetField("Morgentau")
                .fillHouseField("5")
                .fillCityField("Jerusalem")
                .clickOnAddUserButton();
        Thread.sleep(5000);

        Assert.assertTrue(registrationRutPage.isOnRegistrationPage(), "Something is wrong, we are on Doctor's Page");
        Log.info("Assert is passed");
        Log.info("Test registrationNegative stoped...");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}
