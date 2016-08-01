package Telran.com.TraningTest;

import Telran.com.Training.LoginLenaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Lena on 7/28/2016.
 */
public class LoginLenaTest {

    public static String registred_username = "12345kkk";
    public static String registred_password = "LinkCare1";
    public LoginLenaPage loginLenaPage;
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        loginLenaPage = PageFactory.initElements(driver, LoginLenaPage.class);

        driver = new FirefoxDriver();
    }

    /* @BeforeMethod(alwaysRun = true)
     public void beforeMethodSetUp(){
      // loginLenaPage.openLoginPage();
        // driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
      // loginLenaPage.clickRegisterUser();
        *//* driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
         loginLenaPage.clickRegisterUser();*//*
    }
*/
    @Test
    public void testLogin() {
        // driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
        loginLenaPage.clickRegisterUser();

        loginLenaPage.filluserName("UserName");

       /* loginLenaPage.filluserfirstName("FirstName");
        loginLenaPage.clickDropDownOrganizationType("2");*/
    }

   /* @AfterClass(alwaysRun = true)
    public void tearDown(){
      this.driver.quit();
    }
}
*/
}