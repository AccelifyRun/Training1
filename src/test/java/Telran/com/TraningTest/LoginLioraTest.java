package Telran.com.TraningTest;

import Telran.com.Training.LoginLioraPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Liora on 8/6/2016.
 */
public class LoginLioraTest {
    public LoginLioraPage loginLioraPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        //driver = new InternetExplorerDriver();
        loginLioraPage = PageFactory.initElements(driver, LoginLioraPage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodSetUp() {
//        driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
        loginLioraPage.openLoginPage();
    }

    @Test
    public void clickOnRegistrationNewUser() {

        loginLioraPage.clickToAddNewUser();
        loginLioraPage.waitUntilRegPageIsLoaded();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        this.driver.quit();
    }
}
