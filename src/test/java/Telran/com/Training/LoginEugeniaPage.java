package Telran.com.Training;

import Telran.com.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Kirill on 24/07/2016.
 */
public class LoginEugeniaPage extends Page
{
    public LoginEugeniaPage (WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy (id="MainContent_LoginUser_RegisterHyperLink")
    WebElement registernewuser;

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_UserName")
    WebElement usernameField;

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt")
    WebElement firstnameField;

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_lastNameTxt")
    WebElement lastnameField;

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_Email")
    WebElement emailField;

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_Password")
    WebElement password;

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_ConfirmPassword")
    WebElement confirmPassword;

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_PersonalIdTxt")
    WebElement personalID;

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_rolesDDl")
    WebElement rolesDDl;

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_clinicNameTxt")
    WebElement clinicName;

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_IsClinicAdmin")
    WebElement isClinicAdmin;

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL")
    WebElement organizationDDL;

    @FindBy (id="ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_dateInput")
    WebElement birthdayField;

    @FindBy (id="ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactCellTxt")
    WebElement contactCell;

    @FindBy (id="ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactPhoneTxt")
    WebElement contactPhone;

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_AddressTxt")
    WebElement addressfield;

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_HouseNumberTxt")
    WebElement housenumberfield;

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_CityTxt")
    WebElement cityfield;

    @FindBy (id="MainContent_RegisterUser_CreateUserStepContainer_CountryTxt")
    WebElement countryfield;

    public void addNewUser ()
    {
        clickElement(registernewuser);
    }

    public void fillusernameField (String username)
    {
        setElementText(usernameField, username);
    }

    public void filllastnameField(String lastname)
    {
        setElementText(lastnameField, lastname);
    }

    public void fillemailField(String email)
    {
        setElementText(emailField, email);
    }

    public void fillpassword(String password1)
    {
        setElementText(password, password1);
    }

    public void fillconfirmPassword(String passsword1)
    {
        setElementText(confirmPassword, passsword1);
    }

    public void fillpersonalID(String ID)
    {
        setElementText(personalID, ID);
    }

    public void fillclinicName(String clinicname)
    {
        setElementText(clinicName, clinicname);
    }

    public void fillbirthday (String birthday)
    {
        setElementText (birthdayField, birthday);
    }

    public void fillcontactCell (String cell)
    {
        setElementText(contactCell, cell);
    }

    public void fillcontactPhone (String phone)
    {
        setElementText(contactPhone, phone);
    }

    public void filladdress (String address)
    {
        setElementText(addressfield, address);
    }

    public void fillhousenumber (String housenumber)
    {
        setElementText(housenumberfield, housenumber);
    }

    public void fillcityfield (String city)
    {
        setElementText(cityfield, city);
    }

    public void fillcountryfield (String country)
    {
        setElementText(countryfield, country);
    }

    public void clickrolesDDl ()
    {
        clickElement(rolesDDl);
    }

    public void clickIsclinicadmin ()
    {
        clickElement(isClinicAdmin);
    }
    public void selectOrganizationDDL ()
    {
        clickElement(organizationDDL);
    }
}
