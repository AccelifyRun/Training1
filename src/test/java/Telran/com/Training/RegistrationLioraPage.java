package Telran.com.Training;

import Telran.com.TraningTest.LogLog4j;
import Telran.com.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by Liora on 8/6/2016.
 */
public class RegistrationLioraPage extends Page{

    private static Logger Log = Logger.getLogger(LogLog4j.class.getName()) ;
    public LoginLioraPage loginLioraPage;

    //enter text fields
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserName")
    WebElement userNameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt")
    WebElement firstNameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_lastNameTxt")
    WebElement lastNameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Email")
    WebElement emailField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Password")
    WebElement passwordField; //15
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ConfirmPassword")
    WebElement confirmPasswordField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PersonalIdTxt")
    WebElement peronalIdField;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_dateInput")
    WebElement birthdayField;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactCellTxt")
    WebElement contactCellField;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactPhoneTxt")
    WebElement phoneField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_AddressTxt")
    WebElement streetField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_HouseNumberTxt")
    WebElement houseField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CityTxt")
    WebElement cityField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CountryTxt")
    WebElement countryField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_clinicNameTxt")
    WebElement clinicNameField;

    //checkboxes
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_IsClinicAdmin")
    WebElement clinicAdminCheckbox;

    //buttons
    @FindBy (id="MainContent_AddNewUser")
    WebElement saveDoctorBtn;
    @FindBy(id = "MainContent_LinkButton1")
    WebElement cancellationButton;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_CalendarPopupButton")
    WebElement calendarButton;
    @FindBy(id = "Top1_HeadLoginStatus")
    WebElement loginStatusButton;

    //dropdowns
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_rolesDDl")
    WebElement roleDropdown;
    @FindBy(id = "//*[contains(text(), 'מטפל')]")
    WebElement roleClinicAdminDropdownOption;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL")
    WebElement organizationDropdown;

    public RegistrationLioraPage(WebDriver driver) {
        super(driver);
    }

    public RegistrationLioraPage openCreateNewUserPage() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
        Log.info("Opened 'Registration Page'");
        return this;
    }

    //enter text
    public RegistrationLioraPage fillUserNameField(String userName) {
        setElementText(userNameField, userName);
        Log.info("Specified 'userName'");
        return this;
    }
    public RegistrationLioraPage fillFirstNameField(String firstName) {
        setElementText(firstNameField, firstName);
        Log.info("Specified 'firstName'");
        return this;
    }
    public RegistrationLioraPage fillLastNameField(String lastName) {
        setElementText(lastNameField, lastName);
        Log.info("Specified 'lastName'");
        return this;
    }
    public RegistrationLioraPage fillEmailField(String email) {

        setElementText(emailField, email);
        Log.info("Specified 'email'");
        return this;
    }
    public RegistrationLioraPage fillPasswordField(String password) {
        setElementText(passwordField, password);
        Log.info("Specified 'password'");
        return this;
    }
    public RegistrationLioraPage fillConfirmPasswordField(String password) {
        setElementText(confirmPasswordField, password);
        Log.info("Specified 'confirm password'");
        return this;
    }
    public RegistrationLioraPage fillPersonallDField(String personalId) {
        setElementText(peronalIdField, personalId);
        Log.info("Specified 'personalId'");
        return this;
    }
    public RegistrationLioraPage fillclinicNameField(String clinicName) {
        setElementText(clinicNameField, clinicName);
        Log.info("Specified 'clinicName'");
        return this;
    }
    public RegistrationLioraPage fillBirthdayField(String birthday) {
        setElementText(birthdayField, birthday);
        Log.info("Specified 'birthday'");
        return this;
    }
    public RegistrationLioraPage fillcontactCellField(String contactCell) {
        setElementText(contactCellField, contactCell);
        Log.info("Specified 'contactCell'");
        return this;
    }
    public RegistrationLioraPage fillphoneField(String phone) {
        setElementText(phoneField, phone);
        Log.info("Specified 'phone'");
        return this;
    }
    public RegistrationLioraPage fillstreetField(String street) {
        setElementText(streetField, street);
        Log.info("Specified 'street'");
        return this;
    }
    public RegistrationLioraPage fillhouseField(String house) {
        setElementText(houseField, house);
        Log.info("Specified 'house'");
        return this;
    }
    public RegistrationLioraPage fillcityField(String city) {
        setElementText(cityField, city);
        Log.info("Specified 'city'");
        return this;
    }
    public RegistrationLioraPage fillcountryField(String country) {
        setElementText(countryField, country);
        Log.info("Specified 'country'");
        return this;
    }

    public RegistrationLioraPage clickOnAddUserButton() throws Exception{
        try {
            scrolltoelement(saveDoctorBtn);
        }
        catch (Exception e){
            Log.info("Couldn't scroll to the element");
        }
        clickElement(saveDoctorBtn);
        Log.info("Clicked on 'saveDoctorBtn'");
        return this;
    }

    public RegistrationLioraPage clickClinicAdminCheckbox() throws Exception{
        try {
            scrolltoelement(clinicAdminCheckbox);
        }
        catch (Exception e){
            Log.info("Couldn't scroll to the element");
        }
        clickElement(clinicAdminCheckbox);
        Log.info("Clicked on 'clinicAdminCheckbox'");
        return this;
    }

    public RegistrationLioraPage waitUntilDoctorPageIsLoaded() {
        loginLioraPage = PageFactory.initElements(driver, LoginLioraPage.class);
        try {
            waitUntilElementIsLoaded(loginLioraPage.addNewUserLink);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.info("Login page loaded successfully");
        return this;
    }

}
