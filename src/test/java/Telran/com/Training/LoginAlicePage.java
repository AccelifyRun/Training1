package Telran.com.Training;

import Telran.com.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Лис on 24.07.2016.
 */
public class LoginAlicePage extends Page {

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserName")
    WebElement usernameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt")
    WebElement userFirstnameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_lastNameTxt")
    WebElement userLastnameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Email")
    WebElement userEmailField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Password")
    WebElement userPasswordField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ConfirmPassword")
    WebElement userPassConfField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PersonalIdTxt")
    WebElement userPersIDfield;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_rolesDDl")
    WebElement userRole;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_IsClinicAdmin")
    WebElement isClinicAdminField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_clinicNameTxt")
    WebElement clinicNameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL")
    WebElement organizationNameDropDown;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_dateInput")
    WebElement userBDayField;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactCellTxt")
    WebElement userCellphoneField;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactPhoneTxt")
    WebElement userlandlinePhoneField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_AddressTxt")
    WebElement userStreetField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_HouseNumberTxt")
    WebElement userHouseNumField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CityTxt")
    WebElement userCityField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CountryTxt")
    WebElement userCountryField;
    @FindBy(id = "MainContent_AddNewUser")
    WebElement confirmAddUserBtn;
    @FindBy(id = "MainContent_LinkButton1")
    WebElement cancelAddUserBtn;

    public LoginAlicePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillUsernameField(String username) {
        setElementText(usernameField, username);
    }

    public void fillUserFirstnameField(String userfirstname) {
        setElementText(userFirstnameField, userfirstname);
    }

    public void fillUserLastnameField(String userlastname) {
        setElementText(userLastnameField, userlastname);
    }

    public void fillUserEmailField(String useremail) {
        setElementText(userEmailField, useremail);
    }

    public void fillUserPasswordField(String password) {
        setElementText(userPasswordField, password);
    }

    public void fillUserPassConfField(String password) {
        setElementText(userPassConfField, password);
    }

    public void fillUserPersIDfield(String id) {
        setElementText(userPersIDfield, id);
    }

    public void clickUserRole() {
        clickElement(userRole);
    }

    public void clickClinicAdminField() {
        clickElement(isClinicAdminField);
    }

    public void fillClinicNameField(String clinicName) {
        setElementText(clinicNameField, clinicName);
    }

    public void clickOrganizationNameField() {
        clickElement(organizationNameDropDown);
    }

    public void clickDropdownNameField() {
        clickElement(organizationNameDropDown);
        selectValueInDropdown(organizationNameDropDown, "2");
    }

    public void fillUserBDayField(String bday) {
        setElementText(userBDayField, bday);
    }

    public void fillUserCellphoneField(String cellphone) {
        setElementText(userCellphoneField, cellphone);
        //choose String couse it might be a number with signs "-" or "." "("
    }

    public void fillUserlandlinePhoneField(String linephone) {
        setElementText(userlandlinePhoneField, linephone);
    }

    public void fillUserStreetField(String street) {
        setElementText(userStreetField, street);
    }

    public void fillUserHouseNumField(String housenum) {
        setElementText(userHouseNumField, housenum);
        //choose String couse it might be a number with letter "11A"
    }

    public void fillUserCityField(String city) {
        setElementText(userCityField, city);
    }

    public void fillUserCountryField(String country) {
        setElementText(userCountryField, country);
    }

    public void clickConfirmAddUserBtn() {
        clickElement(confirmAddUserBtn);
    }

    public void clickCancelAddUserBtn() {
        clickElement(cancelAddUserBtn);
    }

}
