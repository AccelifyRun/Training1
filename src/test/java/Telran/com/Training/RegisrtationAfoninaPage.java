package Telran.com.Training;

import Telran.com.pages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

/**
 * Created by Natalia on 7/24/2016.
 */
public class RegisrtationAfoninaPage extends Page {
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserName")
    WebElement userName;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt")
    WebElement firstName;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_lastNameTxt")
    WebElement lastName;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Email")
    WebElement Email;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Password")
    WebElement Password;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ConfirmPassword")
    WebElement ConfirmPassord;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PersonalIdTxt")
    WebElement PersonalId;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_rolesDDl")
    WebElement rolesDDI;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_IsClinicAdmin")
    WebElement IsClinicAdmin;
    @FindBy(xpath = " //*[@id='MainContent_RegisterUser_CreateUserStepContainer_clinicNameTxt']")
    WebElement clinicName;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL")
    WebElement OrganizationDDL;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_dateInput")
    WebElement birthday;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_CalendarPopupButton")
    WebElement CalendarPopupButton;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactCellTxt")
    WebElement ContactCell;
    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactPhoneTxt']")
    WebElement ContactPhone;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_AddressTxt")
    WebElement Address;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_HouseNumberTxt")
    WebElement HouseNumber;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CityTxt")
    WebElement City;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CountryTxt")
    WebElement Country;
    @FindBy(id = "MainContent_AddNewUser")
    WebElement AddNewUser;
    @FindBy(id = "MainContent_LinkButton1")
    WebElement LinkButton1;


    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_organizationNameTxt")
    WebElement OrganizationNameTxt;

    @FindBy(xpath = " //*[@id='MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL']//option[@value=\"2\"]")
    WebElement PrivateDoctor;

    @FindBy(xpath = " //*[@id='MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL']//option[@value=\"6\"]")
    WebElement LetOrganization;

    @FindBy(xpath = " //*[@id='MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL']//option[@value=\"19\"]")
    WebElement MindyTest;

    @FindBy(xpath = " //*[@id='MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL']//option[@value=\"32\"]")
    WebElement MCHC;

    @FindBy(id = "Top1_HeadLoginView_DisplayName")
    WebElement AddedUser;

    public RegisrtationAfoninaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, this);
    }

    public void clickEmail() {
        clickElement(Email);
    }

    public void fillEmail(String email) {
        setElementText(Email, email);
    }

    public void fillUserNameField(String username) {
        setElementText(userName, username);
    }

    public void fillFirstName(String firstNameTxt) {
        setElementText(firstName, firstNameTxt);
    }

    public void fillLastName(String lastNameTxt) {
        setElementText(lastName, lastNameTxt);
    }

    public void fillPassword(String password) {
        setElementText(Password, password);
    }

    public void fillConfirmPassord(String confirmPassord) {
        setElementText(ConfirmPassord, confirmPassord);
    }

    public void fillPersonalId(String PersonalIdTxt) {
        setElementText(PersonalId, PersonalIdTxt);
    }

    public void fillrolesDDI(String RolesDDI) {
        setElementText(rolesDDI, RolesDDI);
    }

    public void fillIsClinicAdmin(String isClinicAdmin) {
        setElementText(IsClinicAdmin, isClinicAdmin);
    }

    public void fillclinicName(String clinicNameTxt) throws InterruptedException {
        scrolltoelement(clinicName);
        setElementText(clinicName, clinicNameTxt);
    }

    public void fillOrganizationDDL(String organizationDDL) {
        setElementText(OrganizationDDL, organizationDDL);
    }

    public void fillbirthday(String dateInput) {
        setElementText(birthday, dateInput);
    }

    public void fillCalendarPopupButton(String calendarPopupButton) {
        setElementText(CalendarPopupButton, calendarPopupButton);
    }

    public void fillContactCell(String ContactCellTxt) {
        setElementText(ContactCell, ContactCellTxt);
    }

    public void fillContactPhone(String ContactPhoneTxt) {
        setElementText(ContactPhone, ContactPhoneTxt);
    }

    public void fillAddress(String AddressTxt) {
        setElementText(Address, AddressTxt);
    }

    public void fillHouseNumber(String HouseNumberTxt) {
        setElementText(HouseNumber, HouseNumberTxt);
    }

    public void fillCity(String CityTxt) {
        setElementText(City, CityTxt);
    }

    public void fillCountry(String CountryTxt) {
        setElementText(Country, CountryTxt);
    }

    public void fillLinkButton1(String linkButton1) {
        setElementText(LinkButton1, linkButton1);
    }

    public void fillAddNewUser(String newUser) {
        setElementText(AddNewUser, newUser);
    }

    public void fillConfirmPassorw(String Password) {
        setElementText(ConfirmPassord, Password);
    }

    public void clickUserName() {
        clickElement(userName);
    }

    public void clickFirstName() {
        clickElement(firstName);
    }

    public void clickLastName() {
        clickElement(lastName);
    }

    public void clickPassord() {
        clickElement(Password);
    }

    public void clickConfirmPassord() {
        clickElement(ConfirmPassord);
    }

    public void clickPersonalId() {
        clickElement(PersonalId);
    }

    public void clickrolesDDI() {
        clickElement(rolesDDI);
    }

    public void clickIsClinicAdmin() {
        clickElement(IsClinicAdmin);
    }

    public void clickclinicName() {
        clickElement(clinicName);
    }

    public void clickOrganizationDDL() {
        clickElement(OrganizationDDL);
    }

    public void clickbirthday() {
        clickElement(birthday);
    }

    public void clickCalendarPopupButton() {
        clickElement(CalendarPopupButton);
    }

    public void clickContactCell() {
        clickElement(ContactCell);
    }

    public void clickContactPhone() {
        clickElement(ContactPhone);
    }

    public void clickAddress() {
        clickElement(Address);
    }

    public void clickHouseNumber() {
        clickElement(HouseNumber);
    }

    public void clickCity() {
        clickElement(City);
    }

    public void clickCountry() {
        clickElement(Country);
    }

    public void clickAddNewUser() {
        clickElement(AddNewUser);
    }

    public void clickLinkButton1() {
        clickElement(LinkButton1);
    }

    public void clickDropdownNameField() {
        clickElement(rolesDDI);
    }

    public void clickDropdownPrivateDoctor() {
        clickElement(PrivateDoctor);
    }


    public void clickLetOrganization() {
        clickElement(OrganizationNameTxt);
        clickElement(LetOrganization);
    }

    public void clickMindyTest() {
        clickElement(OrganizationNameTxt);
        clickElement(MindyTest);
    }

    public void clickMCHC() {
        clickElement(OrganizationNameTxt);
        clickElement(MCHC);
    }

    public void openLoginRegistrationPage() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
    }

    public void waitUntilAddNewUserIsLoaded() {
        try {
            new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(AddNewUser));
        } catch (Exception e) {
            // Log.info("---------------------------------");
            // Log.info("element " + element + " can not be found by ExpectedConditions.visibilityOf(element)");
            //  Log.info("---------------------------------");
            e.printStackTrace();
        }
    }

    public void waitUntilClinicNameIsLoaded() {
        try {
            new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(clinicName));
        } catch (Exception e) {
            // Log.info("---------------------------------");
            // Log.info("element " + element + " can not be found by ExpectedConditions.visibilityOf(element)");
            //  Log.info("---------------------------------");
            e.printStackTrace();
        }
    }


    public void waitUntilAddNewUserIsDisappeared(String id) throws IOException, InterruptedException {
        new WebDriverWait(driver, 25).until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
    }

    public void waitUntilAddedUserIsLoaded() {
        try {
            new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(AddedUser));
        } catch (Exception e) {
            // Log.info("---------------------------------");
            // Log.info("element " + element + " can not be found by ExpectedConditions.visibilityOf(element)");
            //  Log.info("---------------------------------");
            e.printStackTrace();
        }
    }

    public boolean verifyAddedUserIsPresent() {
        try {
            AddedUser.getTagName();
            return true;
        } catch (NoSuchElementException e) {
            //  Log.info("---------------------------------");
            //  Log.info("element " + element + " can not be found by  element.getTagName()");
            //   Log.info("---------------------------------");
            return false;
        }
    }
}

