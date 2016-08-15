package Telran.com.TraningTest;

import Telran.com.Training.DoctorAfoninaPage;
import Telran.com.Training.LoginAfoninaPage;
import Telran.com.Training.RegisrtationAfoninaPage;
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

//import org.testng.log4testng.Logger;

//@org.testng.annotations.Listeners(FailTestScreenshotListener.class)
public class RegistrationAfoninaTests {

    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public RegisrtationAfoninaPage registrationAfoninaPage;
    public LoginAfoninaPage loginAfoninaPage;
    public DoctorAfoninaPage doctorAfoninaPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        registrationAfoninaPage = PageFactory.initElements(driver, RegisrtationAfoninaPage.class);
        loginAfoninaPage = PageFactory.initElements(driver, LoginAfoninaPage.class);
        doctorAfoninaPage = PageFactory.initElements(driver, DoctorAfoninaPage.class);

    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
        registrationAfoninaPage.openLoginRegistrationPage();
    }
    @Test
    public void testRegistrationPositiveCancel() throws IOException, InterruptedException {

        Log.info("TestRegistrationPositiveCancel was started....");
        registrationAfoninaPage.waitUntilAddNewUserIsLoaded()
                .waitUntilClinicNameIsLoaded()
                .clickUserName()
                .fillUserNameField("ADoctor")
                .clickFirstName()
                .fillFirstName("DoctorFirstName")
                .clickLastName()
                .fillLastName("DoctorLastName")
                .clickEmail()
                .fillEmail("DoctorLastName@gmail.com")
                .clickPassord()
                .fillPassword("zaq1@WSX")
                .clickConfirmPassord()
                .fillConfirmPassord("zaq1@WSX")
                .clickPersonalId()
                .fillPersonalId("25777236")
                //  .clickIsClinicAdmin()
                .clickclinicName()
                .fillclinicName("ClinicName")
                .clickbirthday()
                .fillbirthday("11/11/2009")
                .clickContactPhone()
                .fillContactPhone("0553333333")
                .clickContactCell()
                .fillContactCell("091111111")
                .clickAddress()
                .fillAddress("address")
                .clickHouseNumber()
                .fillHouseNumber("11")
                .clickCity()
                .fillCity("City")
                .selectValueInOrganizationDDLText("תת ארגון")
                .clickLinkButton1();

        Assert.assertTrue(loginAfoninaPage.isOnLoginPage(), "Something is wrong");
        Log.info("TestRegistrationPositiveCancel ended");
    }

    @Test
    public void testRegistrationPositive() throws IOException, InterruptedException {

        Log.info("TestRegistrationPositive was started....");
        registrationAfoninaPage.waitUntilAddNewUserIsLoaded()
                .waitUntilClinicNameIsLoaded()
                .clickUserName()
                .fillUserNameField("ADoctor")
                .clickFirstName()
                .fillFirstName("DoctorFirstName")
                .clickLastName()
                .fillLastName("DoctorLastName")
                .clickEmail()
                .fillEmail("DoctorLastName@gmail.com")
                .clickPassord()
                .fillPassword("zaq1@WSX")
                .clickConfirmPassord()
                .fillConfirmPassord("zaq1@WSX")
                .clickPersonalId()
                .fillPersonalId("25777236")
                //  .clickIsClinicAdmin()
                .clickclinicName()
                .fillclinicName("ClinicName")
                .clickbirthday()
                .fillbirthday("11/11/2009")
                .clickContactPhone()
                .fillContactPhone("0553333333")
                .clickContactCell()
                .fillContactCell("091111111")
                .clickAddress()
                .fillAddress("address")
                .clickHouseNumber()
                .fillHouseNumber("11")
                .clickCity()
                .fillCity("City")
                .selectValueInOrganizationDDLText("תת ארגון")
                .clickAddNewUser()
                .waitUntilAddNewUserIsDisappeared("Top1_HeadLoginView_DisplayName");

        Assert.assertTrue(doctorAfoninaPage.isOnDoctorPage(), "Something wrong");
        // Assert.assertTrue(loginPage.isLoginUnsuccessfulAlertMessageDisplayed());
        Log.info("TestRegistrationPositive stoped....");
    }


    // test of clicking on Registration link are written in another class

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}