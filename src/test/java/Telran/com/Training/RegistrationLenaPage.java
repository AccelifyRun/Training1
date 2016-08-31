package Telran.com.Training;

import Telran.com.TraningTest.LogLog4j;
import Telran.com.pages.Page;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by Lena on 7/28/2016.
 */
public class RegistrationLenaPage extends Page {
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    @FindBy(id = "MainContent_LoginUser_RegisterHyperLink")
    WebElement registerHyperLink;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserName")
    WebElement usernameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt")
    WebElement firstnameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_lastNameTxt")
    WebElement lastnameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Email")
    WebElement emailField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Password")
    WebElement passwordField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ConfirmPassword")
    WebElement confirmPasswordField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PersonalIdTxt")
    WebElement personalIdField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_rolesDDl")
    WebElement userroleField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_IsClinicAdmin")
    WebElement clikpositionclinicAdmin;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_clinicNameTxt")
    WebElement clinicnameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL")
    WebElement organizationTypeDropDown;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_dateInput")
    WebElement birthdayDateField;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_CalendarPopupButton")
    WebElement calendarpopupButton;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactCellTxt")
    WebElement contactCellField;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactPhoneTxt")
    WebElement contactPhoneField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_AddressTxt")
    WebElement adressField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_HouseNumberTxt")
    WebElement houseNumberField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CityTxt")
    WebElement cityField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CountryTxt")
    WebElement countryField;
    @FindBy(id = "MainContent_AddNewUser")
    WebElement addnewuserClik;
    @FindBy(id = "MainContent_LinkButton1")
    WebElement cancellinkbuttonClik;
    @FindBy(id = "Top1_HeadLoginStatus")
    WebElement loginButton;
    // public static DoctorLenaPage doctorLenaPage;

    @FindBy(id = "Top1_HeadLoginView_DisplayName")
    WebElement nameDoctor;


    public RegistrationLenaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public RegistrationLenaPage clickRegisterUser() {
        clickElement(registerHyperLink);
        Log.info("Click 'reristration user' button");
        return this;
    }

    public RegistrationLenaPage filluserName(String username) {
        setElementText(usernameField, username);
        Log.info("Filling user name");
        return this;
    }

    public RegistrationLenaPage filluserfirstName(String firstname) {
        setElementText(firstnameField, firstname);
        Log.info("Filling first name");
        return this;
    }

    public RegistrationLenaPage filluserlastName(String lastname) {
        setElementText(lastnameField, lastname);
        Log.info("Filling last name");
        return this;
    }

    public RegistrationLenaPage fillemailField(String email) {
        setElementText(emailField, email);
        Log.info("Filling email");
        return this;
    }

    public RegistrationLenaPage fillpasswordField(String password) {
        setElementText(passwordField, password);
        Log.info("Filling password");
        return this;
    }

    public RegistrationLenaPage fillconfirmpasswordFiel(String password) {
        setElementText(confirmPasswordField, password);
        Log.info("Filling confirm password");
        return this;
    }

    public RegistrationLenaPage fillpersonalId(String id) {
        setElementText(personalIdField, id);
        Log.info("Filling ID");
        return this;
    }

    public RegistrationLenaPage clickuserRole() {
        clickElement(userroleField);
        Log.info("Clicking role ");
        return this;
    }

    public RegistrationLenaPage clickposition() {
        clickElement(clikpositionclinicAdmin);
        Log.info("Click position");
        return this;
    }

    public RegistrationLenaPage fillClinikName(String clinikName) throws InterruptedException {
        scrolltoelement(clinicnameField);
        setElementText(clinicnameField, clinikName);
        Log.info("Filing clinic name");
        return this;
    }

    public RegistrationLenaPage clickOrganizationType() {
        clickElement(organizationTypeDropDown);
        selectValueInDropdown(organizationTypeDropDown, "2");
        Log.info("Click organization type");
        return this;
    }

    public RegistrationLenaPage fillbirthdayDate(String date) {
        setElementText(birthdayDateField, date);
        Log.info("Fill birth DayDate");
        return this;
    }

    public RegistrationLenaPage fillCellPhon(String cellphonevalue) {
        setElementText(contactCellField, cellphonevalue);
        Log.info("Fill cell phone");
        return this;
    }

    public RegistrationLenaPage fillcontactPhone(String phonevalue) {
        setElementText(contactPhoneField, phonevalue);
        Log.info("Contact phone");
        return this;
    }

    public RegistrationLenaPage fillStreet(String street) {
        setElementText(adressField, street);
        return this;
    }

    public RegistrationLenaPage fillHouseNumber(String number) {
        setElementText(houseNumberField, number);
        Log.info("House number");
        return this;
    }

    public RegistrationLenaPage fillCity(String city) {
        setElementText(cityField, city);
        Log.info("Fill city");
        return this;
    }

    public RegistrationLenaPage fillCountry(String country) {
        setElementText(countryField, country);
        Log.info("Fill country");
        return this;
    }

    public RegistrationLenaPage clickNewUser() {
        clickElement(addnewuserClik);
        Log.info("Click 'new user' button");
        return this;
    }

    public RegistrationLenaPage clickCancelButton() {
        clickElement(cancellinkbuttonClik);
        Log.info("click Cancel Button");
        return this;
    }


    public RegistrationLenaPage waitUntilLoginPageIsLoaded() {
        try {
            waitUntilElementIsLoaded(addnewuserClik);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public boolean isOnDoctorPage() {
        Log.info("isOnDoctorPage");
        return exists(nameDoctor);
    }


    public RegistrationLenaPage openRegistrationPage() {
        //driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
        driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
        //driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
        clickElement(registerHyperLink);
        Log.info("Open registration page");
        //clickRegisterUser();
        return this;
    }
}