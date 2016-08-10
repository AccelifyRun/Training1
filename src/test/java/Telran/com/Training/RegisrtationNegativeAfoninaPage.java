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
public class RegisrtationNegativeAfoninaPage extends Page {
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserNameRequired")
    WebElement userNameRequired;
    @FindBy(id = " MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator2")
    WebElement userNameValidstor2;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_FirsNameRequired")
    WebElement firstNameRequired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator1")
    WebElement firstNameValidator1;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_LastNameRequired")
    WebElement lastNameRequaired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator3")
    WebElement lastNameValidator3;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_EmailRequired")
    WebElement EmaiRequired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_regexEmailValid")
    WebElement EmaiValid;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CustomValidator2")
    WebElement EmaiValidator2;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PasswordRequired")
    WebElement PasswordRequired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CustomValidator3")
    WebElement PasswordValidator3;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ConfirmPasswordRequired")
    WebElement ConfirmPassordRequired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PasswordCompare")
    WebElement ConfirmPassordCompare;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator1")
    WebElement PersonalIdValidator1;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CVPersonalId")
    WebElement PersonalIdCV;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator2")
    WebElement ContactCellRequiredFieldValidator2;

    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactPhoneTxt']")
    WebElement ContactPhone;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator3")
    WebElement AddressRequired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator4")
    WebElement AddressValidator4;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator5")
    WebElement HouseNumbeRequired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator5")
    WebElement HouseNumbeValidator5;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator4")
    WebElement CityRequired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator6")
    WebElement CityValidator6;


    public RegisrtationNegativeAfoninaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, this);
    }


    public void waitUntilAddNewUserIsDisappeared(String id) throws IOException, InterruptedException {
        new WebDriverWait(driver, 25).until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
    }


    public boolean verifyAddedUserIsPresent(WebElement element) {
        try {
            element.getTagName();
            return true;
        } catch (NoSuchElementException e) {
            //  Log.info("---------------------------------");
            //  Log.info("element " + element + " can not be found by  element.getTagName()");
            //   Log.info("---------------------------------");
            return false;
        }
    }

    public boolean verifyuserNameRequiredIsPresent() {
        try {
            userNameRequired.getTagName();
            return true;
        } catch (NoSuchElementException e) {
            //  Log.info("---------------------------------");
            //  Log.info("element " + element + " can not be found by  element.getTagName()");
            //   Log.info("---------------------------------");
            return false;
        }
    }

    public boolean verifyfirstNameRequiredPresent() {
        try {
            firstNameRequired.getTagName();
            return true;
        } catch (NoSuchElementException e) {
            //  Log.info("---------------------------------");
            //  Log.info("element " + element + " can not be found by  element.getTagName()");
            //   Log.info("---------------------------------");
            return false;
        }
    }

    public boolean verifylastNameRequairedIsPresent() {
        try {
            lastNameRequaired.getTagName();
            return true;
        } catch (NoSuchElementException e) {
            //  Log.info("---------------------------------");
            //  Log.info("element " + element + " can not be found by  element.getTagName()");
            //   Log.info("---------------------------------");
            return false;
        }
    }

    public boolean verifyEmaiRequiredIsPresent() {
        try {
            EmaiRequired.getTagName();
            return true;
        } catch (NoSuchElementException e) {
            //  Log.info("---------------------------------");
            //  Log.info("element " + element + " can not be found by  element.getTagName()");
            //   Log.info("---------------------------------");
            return false;
        }
    }

    public boolean verifyPasswordRequiredIsPresent() {
        try {
            PasswordRequired.getTagName();
            return true;
        } catch (NoSuchElementException e) {
            //  Log.info("---------------------------------");
            //  Log.info("element " + element + " can not be found by  element.getTagName()");
            //   Log.info("---------------------------------");
            return false;
        }
    }
}

