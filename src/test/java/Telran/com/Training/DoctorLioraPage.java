package Telran.com.Training;

import Telran.com.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

/**
 * Created by Liora on 8/17/2016.
 */
public class DoctorLioraPage extends Page{

    @FindBy(id = "Top1_HeadLoginStatus")
    WebElement exitStatusButton;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl04_PatientTracking")
    WebElement toPatientPageLink;
    @FindBy(id = "MainContent_AddNewItem")
    WebElement addPatientButton;
    @FindBy(id = "Top1_HeadLoginView_DisplayName")
    WebElement doctorNameLabel;

    public DoctorLioraPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
