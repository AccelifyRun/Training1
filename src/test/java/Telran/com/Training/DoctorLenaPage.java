package Telran.com.Training;

import Telran.com.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Lena on 8/23/2016.
 */
public class DoctorLenaPage extends Page {


    @FindBy(id = "Top1_HeadLoginView_DisplayName")
    WebElement nameDoctor;
    @FindBy(id = "Top1_HeadLoginView_lastLogin")
    WebElement dateOfLastLogin;
    /*@FindBy(xpath = )
    WebElement imagesProfileI;*/
    @FindBy(id = "BtnPrevPage")
    WebElement prevPage;
    @FindBy(id = "Div1")
    WebElement nextPage;


    public DoctorLenaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


}
