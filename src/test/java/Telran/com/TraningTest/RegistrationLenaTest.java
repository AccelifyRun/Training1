package Telran.com.TraningTest;

import Telran.com.Training.RegistrationLenaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Lena on 7/28/2016.
 */
public class RegistrationLenaTest {
    public static String registred_username = "doctor12";
    public static String registred_firstname = "firstDoctor";

    public RegistrationLenaPage registrationLenaPage;
    public WebDriver driver;


    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new FirefoxDriver();
        registrationLenaPage = PageFactory.initElements(driver, RegistrationLenaPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
        registrationLenaPage.openRegistrationPage();
    }

    @Test
    public void registrationPage() {
        try {
            registrationLenaPage.waitUntilLoginPageIsLoaded()
                    .filluserName(registred_username)
                    .filluserfirstName(registred_firstname)
                    .filluserlastName("lastDoctor")
                    .fillemailField("doctor12@youpmail.com")
                    .fillpasswordField("123456.doc")
                    .fillconfirmpasswordFiel("123456.doc")
                    .fillpersonalId("317195881")
                    .clickuserRole()
                    .clickposition()
                    .fillClinikName("Clinik")
                    .clickOrganizationType()
                    .fillbirthdayDate("12.12.12")
                    .fillCellPhon("0511234567")
                    .fillcontactPhone("081234567")
                    .fillStreet("top")
                    .fillHouseNumber("12")
                    .fillCity("City")
                    .fillCountry("Country")
                    .clickNewUser()

                    .isOnDoctorPage();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }


    }


}