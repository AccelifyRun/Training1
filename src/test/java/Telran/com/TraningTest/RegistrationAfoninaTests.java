package Telran.com.TraningTest;

import Telran.com.Training.RegisrtationAfoninaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

//@org.testng.annotations.Listeners(FailTestScreenshotListener.class)
public class RegistrationAfoninaTests {

    public RegisrtationAfoninaPage registrationAfoninaPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
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
        registrationAfoninaPage.waitUntilAddNewUserIsLoaded();
        registrationAfoninaPage.waitUntilClinicNameIsLoaded();
        registrationAfoninaPage.clickclinicName();
        registrationAfoninaPage.fillclinicName("CCC");
        registrationAfoninaPage.clickUserName();
        registrationAfoninaPage.fillUserNameField("AAABB");
        registrationAfoninaPage.clickFirstName();
        registrationAfoninaPage.fillFirstName("AAAA");
        registrationAfoninaPage.clickLastName();
        registrationAfoninaPage.fillLastName("BBB");
        registrationAfoninaPage.clickEmail();
        registrationAfoninaPage.fillEmail("aaaaa@gmail.com");
        registrationAfoninaPage.clickPassord();
        registrationAfoninaPage.fillPassword("zaq1@WSX");
        registrationAfoninaPage.clickConfirmPassord();
        registrationAfoninaPage.fillConfirmPassord("zaq1@WSX");
        registrationAfoninaPage.clickPersonalId();
        registrationAfoninaPage.fillPersonalId("25777236");
        registrationAfoninaPage.clickIsClinicAdmin();
        /*registrationAfoninaPage.clickclinicName();
        registrationAfoninaPage.fillclinicName("CCC");*/
        registrationAfoninaPage.clickbirthday();
        registrationAfoninaPage.fillbirthday("11/11/2009");
        registrationAfoninaPage.clickContactPhone();
        registrationAfoninaPage.fillContactPhone("0553333333");
        registrationAfoninaPage.clickContactCell();
        registrationAfoninaPage.fillContactCell("091111111");
        registrationAfoninaPage.clickAddress();
        registrationAfoninaPage.fillAddress("address");
        registrationAfoninaPage.clickHouseNumber();
        registrationAfoninaPage.fillHouseNumber("11");
        registrationAfoninaPage.clickCity();
        registrationAfoninaPage.fillCity("City");//*
        registrationAfoninaPage.clickDropdownNameField();
        registrationAfoninaPage.clickDropdownNameField();
       /* registrationAfoninaPage.clickDropdownPrivateDoctor();
        registrationAfoninaPage.clickLetOrganization();
        registrationAfoninaPage.clickMindyTest();
        registrationAfoninaPage.clickMCHC();*/
        registrationAfoninaPage.clickAddNewUser();
        //registrationAfoninaPage.clickLinkButton1();
        registrationAfoninaPage.waitUntilAddNewUserIsDisappeared("MainContent_AddNewUser");
        registrationAfoninaPage.waitUntilAddedUserIsLoaded();
        registrationAfoninaPage.verifyAddedUserIsPresent();





      /* RegisrtationAfoninaPage.waitUntilRegisterHyperLinkIsLoaded();
        RegisrtationAfoninaPage.clickRegisterHyperLink();
        RegisrtationAfoninaPage.waitUntilAddNewUserIsLoaded();
        loginPage.clickToAddNewUser();
        loginPage.fillusernameField("Username");*/

        // Assert.assertTrue(loginPage.isLoginUnsuccessfulAlertMessageDisplayed());
        // Log.info("TestLoginWithExtData stoped....");
    }


    // test of clicking on Registration link are written in another class

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}