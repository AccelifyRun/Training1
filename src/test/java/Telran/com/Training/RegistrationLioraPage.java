package Telran.com.Training;

import Telran.com.TraningTest.LogLog4j;
import Telran.com.pages.Page;
import org.openqa.selenium.By;
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
    public DoctorLioraPage doctorLioraPage;

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

    //validation elements
    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_UserNameRequired")
    WebElement noUserNameLabel; //שם משתמש חובה
    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_FirsNameRequired")
    WebElement noFirstNameLabel; //שם פרטי חובה.
    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_LastNameRequired")
    WebElement noLastNameLabel; //שם משפחה חובה
    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_EmailRequired")
    WebElement noEmailLabel; //מייל חובה.
    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_PasswordRequired")
    WebElement noPasswordLabel; //סיסמא חובה.
    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_ConfirmPasswordRequired")
    WebElement noConfirmPasswordLabel; //אישור סיסמא חובה.
    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator1")
    WebElement noPersonalIDLabel;//מספר זהות חוב
    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator2")
    WebElement noPhoneLabel; //מס' פלאפון חובה
    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator3")
    WebElement noStreetLabel; //רחוב חובה
    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator5")
    WebElement noHouseLabel; //מס' בית חובה
    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator4")
    WebElement noCityLabel; //עיר חובה

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_regexEmailValid")
            WebElement incorrectEmail; //פורמט מייל לא תקני
    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_CustomValidator3")
    WebElement incorrectPassword; //סיסמא לא יכולה להכיל את שם המשתמש.
    @FindBy (id = "MainContent_RegisterUser_CreateUserStepContainer_PasswordCompare")
    WebElement notTheSameConfirmPassword; //אשור סיסמה חייב להתאים לסיסמה.
    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_CVPersonalId")
    WebElement incorrectPersonalId; //מספר זהות לא חוקי
    @FindBy (id ="MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator2")
    WebElement incorrectUserName; //אותיות ומספרים בלבד
    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator1")
    WebElement incorrectFirstName; //אותיות בלבד
    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator3")
    WebElement incorrectSurname; //אותיות בלבד

    public RegistrationLioraPage(WebDriver driver) {
        super(driver);
    }

    public RegistrationLioraPage openCreateNewUserPage() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
        Log.info("Opened 'Registration Page'");
        return this;
    }

    public String waitAndGetTextOfSelectedMessage(String number) throws IOException, InterruptedException {
        String locator = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator"+number;
        WebElement elem = driver.findElement(By.id(locator));
        waitUntilElementIsLoaded(elem);
        return elem.getText();
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
        doctorLioraPage = PageFactory.initElements(driver, DoctorLioraPage.class);
        try {
            waitUntilElementIsLoaded(doctorLioraPage.doctorNameLabel);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.info("Doctor page loaded successfully");
        return this;
    }

    public RegistrationLioraPage verifyRequiredFieldsValidations() {
        verifyElementIsPresent(noUserNameLabel);
        verifyText(noUserNameLabel,"שם משתמש חובה");
        verifyElementIsPresent(noFirstNameLabel);
        verifyText(noFirstNameLabel,"שם פרטי חובה.");
        verifyElementIsPresent(noLastNameLabel);
        verifyText(noLastNameLabel,"שם משפחה חובה");
        verifyElementIsPresent(noEmailLabel);
        verifyText(noEmailLabel,"מייל חובה.");
        verifyElementIsPresent(noPasswordLabel);
        verifyText(noPasswordLabel,"סיסמא חובה.");
        verifyElementIsPresent(noConfirmPasswordLabel);
        verifyText(noConfirmPasswordLabel,"אישור סיסמא חובה.");
        verifyElementIsPresent(noPersonalIDLabel);
        verifyText(noPersonalIDLabel,"מספר זהות חובה");
        verifyElementIsPresent(noPhoneLabel);
        verifyText(noPhoneLabel,"מס' פלאפון חובה");
        verifyElementIsPresent(noStreetLabel);
        verifyText(noStreetLabel,"רחוב חובה");
        verifyElementIsPresent(noHouseLabel);
        verifyText(noHouseLabel,"מס' בית חובה");
        verifyElementIsPresent(noCityLabel);
        verifyText(noCityLabel,"עיר חובה");
        Log.info("Validation messages for required fields verified successfully");
        return this;
    }

}
