package Telran.com.Training;

import Telran.com.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by Lena on 7/28/2016.
 */
public class LoginLenaPage extends Page {


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

    public LoginLenaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickRegisterUser() {
        clickElement(registerHyperLink);
    }

    public void filluserName(String username) {
        setElementText(usernameField, username);
    }

    public void filluserfirstName(String firstname) {
        setElementText(firstnameField, firstname);
    }

    public void filluserlastName(String lastname) {
        setElementText(lastnameField, lastname);
    }

    public void fillemailField(String email) {
        setElementText(emailField, email);
    }

    public void fillpasswordField(String password) {
        setElementText(passwordField, password);
    }

    public void fillconfirmpasswordFiel(String password) {
        setElementText(confirmPasswordField, password);
    }

    public void fillpersonalId(String id) {
        setElementText(personalIdField, id);
    }

    public void clickuserRole() {
        clickElement(userroleField);
    }

    public void clickposition() {
        clickElement(clikpositionclinicAdmin);
    }

    public void fillClinikName(String clinikName) {
        setElementText(clinicnameField, clinikName);
    }

    public void clickOrganizationType() {
        clickElement(organizationTypeDropDown);
        selectValueInDropdown(organizationTypeDropDown, "2");
    }

    public void fillbirthdayDate(String date) {
        setElementText(birthdayDateField, date);
    }

    public void fillCellPhon(String cellphonevalue) {
        setElementText(contactCellField, cellphonevalue);
    }

    public void fillcontactPhone(String phonevalue) {
        setElementText(contactPhoneField, phonevalue);
    }

    public void fillAdress(String adress) {
        setElementText(adressField, adress);
    }

    public void fillHouseNumber(String number) {
        setElementText(houseNumberField, number);
    }

    public void fillCity(String city) {
        setElementText(cityField, city);
    }

    public void fillCountry(String country) {
        setElementText(countryField, country);
    }

    public void clickNewUser() {
        clickElement(addnewuserClik);
    }

    public void clickCancelButton() {
        clickElement(cancellinkbuttonClik);
    }

    public LoginLenaPage waitUntilLoginPageIsLoaded() {
        try {
            waitUntilElementIsLoaded(loginButton);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }



}