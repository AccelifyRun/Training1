package Telran.com.TraningTest;

/**
 * Created by Andrey on 01/08/2016.
 */
// private static Logger Log = Logger.getLogger(LogLog4j.class.getName());

import Telran.com.Training.LoginPageAndrey;
import Telran.com.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginAndreyTests {

    // private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    public static String registered_username = "Andrey";
    public static String registered_password = "LinkCare777";
    public LoginPage loginPage;
    public LoginPageAndrey loginPageAndrey;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {

    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPageAndrey = PageFactory.initElements(driver, LoginPageAndrey.class);
        driver = new ChromeDriver();

    }

    @Test
    public void testLoginWithExtData() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
        // Log.info("TestLoginWithExtData was started....");
        loginPageAndrey.fillusernameField1("Andrey");
        loginPageAndrey.fillbirthCalendarField("1.1.2009");
        loginPageAndrey.fillclinicNameFieldField("Soroka");
        loginPageAndrey.fillconfirmPasswordField("LinkCare777");
        loginPageAndrey.fillemailField("health@soroka.il");
        loginPageAndrey.labelField("az12");
        loginPageAndrey.filladdUserBtnField("qwer");


        // Assert.assertTrue(loginPage.isLoginUnsuccessfulAlertMessageDisplayed());
        // Log.info("TestLoginWithExtData stoped....");
    }

}
