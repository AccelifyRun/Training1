package Telran.com.pages;


import Telran.com.LogLog4j;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by Iakov Volf,Oleg
 */
public class DoctorsPage extends Page {
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName()); //Необходимо для написания логов
    @FindBy(id = "MainContent_LoginUser_Password")
    WebElement passwordField;
    @FindBy(id = "MainContent_LoginUser_RegisterHyperLink")
    WebElement goToRegLink;
    @FindBy(id = "MainContent_LoginUser_LoginButton")
    WebElement loginButton;
    @FindBy(xpath = "//span[@id='Top1_HeadLoginView_DisplayName']")
    private WebElement namesField;
    //buttons
    @FindBy(xpath = "//a[@class='forgot']")
    private WebElement forgotPassLink;
    //alerts
    @FindBy(xpath = "//div[@id='MainContent_LoginUser_LoginUserValidationSummary']/ul/li[contains(text(),'שם משתמש חובה')]")
    private WebElement wrongUsernameAlert;

    @FindBy(xpath = "//div[@id='MainContent_LoginUser_LoginUserValidationSummary']/ul/li[contains(text(),'סיסמא חובה.')]")
    private WebElement wrongPasswordAlert;


    @FindBy(xpath = "//a[@class='LinkBtnPatients GreenBtn']")
    private WebElement goToPatientButton;

    @FindBy(id = "MainContent_ItemLinkButton3")
    private WebElement addPatientButton;
    //*[@id='MainContent_ItemLinkButton3']

    public DoctorsPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "http://dhclinicappv2stg.item-soft.co.il/SecurityInfrastructure/Accounts.aspx";
        PageFactory.initElements(driver, this);
    }

    public DoctorsPage openMainPage(WebDriver driver) {
        driver.get(PAGE_URL);
        return this;
    }

    //Fill the fileds
    public void openPatientPage(String teudat) {
        Log.info("Open patient page by teudat <" + teudat + ">");
        String locator = "//td[contains(text(),'" + teudat + "')]/../*//*[@class='LinkBtnPatients GreenBtn']";
        WebElement greenButton = driver.findElement(By.xpath(locator));
        Log.info("Clicking 'Green' button");
        greenButton.click();
    }

    public DoctorsPage waitUntilMainPageIsLoaded() throws IOException, InterruptedException {
        Log.info("Waiting for Main page is loaded");
        waitUntilElementIsLoaded(namesField);
        return this;
    }

    public void clickOnGoToPatientButton() {
        Log.info("Clicking 'Go to patient' button");
        clickElement(goToPatientButton);
    }

    public void openRegistrationPage() {
        Log.info("Opening Registration page");
        clickElement(goToRegLink);

    }

    public void openForgotPassPage() {
        clickElement(forgotPassLink);

    }

    public DoctorsPage clickOnAddPatient() throws InterruptedException {
        Log.info("Clicking 'Add patient' button");
        clickElement(addPatientButton);
        Log.info("Trying thread sleep 5000");
        Thread.sleep(5000);
        Log.info("Trying to switch to frame 0");
        driver.switchTo().frame(0);
        return this;
    }

    public boolean isOnDoctorPage() {
        Log.info("Checking if we are on the Main page");
        return exists(namesField);
    }

    public boolean isPatientExists(String tz) {
        Log.info("Checking if patient with ID " + tz + " exists");
        String locator = "//td[contains(text(),'" + tz + "')]/../*//*[@class='LinkBtnPatients GreenBtn']";
        return exists(driver.findElement(By.xpath(locator)));
    }
    //check alert presence

    public boolean alertMessageNotValidUsername() {

        return exists(wrongUsernameAlert);
    }
    //div[@id='MainContent_LoginUser_LoginUserValidationSummary']/ul/li[1]

    public boolean alertMessageNotValidPassword() {
        return exists(wrongPasswordAlert);
    }

}
