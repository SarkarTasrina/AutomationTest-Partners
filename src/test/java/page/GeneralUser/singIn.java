package page.GeneralUser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class singIn {
    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement singinbtn;
    @FindBy(xpath = " //a[contains(text(),'Sign In')]//i[@class='fa fa fa-user']")
    WebElement singinclick;
    @FindBy(xpath = "//div[text()='G - User  ']")
    WebElement guserSingin;

    @FindBy (id = "emailId")
    WebElement emailidFillup;
    @FindBy (id = "password")
    WebElement passwordfillup;
    @FindBy(id = "btnLogin")
    WebElement singinbtnguser;


}
