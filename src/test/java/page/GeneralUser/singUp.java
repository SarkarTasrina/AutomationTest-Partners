package page.GeneralUser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class singUp {
    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement singinbtn;
    @FindBy(xpath = "//a[normalize-space()='Sign Up']")
    WebElement singupbtn;


    @FindBy(xpath = "//a[normalize-space()='General User']")
    WebElement generaluserbtn;


    @FindBy(id = "firstName")
    WebElement firstname;

    @FindBy(id=" lastName ")
    WebElement lastname;

    @FindBy(id="userName")
    WebElement username;

    @FindBy(id = "emailId")
    WebElement emailid;

    @FindBy(id="phone")
    WebElement phone;

    @FindBy(id="whatsappNumber")
    WebElement  whatsappNumber;

    @FindBy(xpath = "//span[@id='select2-district-container']")
    WebElement selectDistrict;

    @FindBy(xpath = "(//span[@role='combobox'])[4]")
    WebElement selectarea;

    @FindBy(id= " password ")
    WebElement password;

    @FindBy(id="confirmPassword")
    WebElement confirmPassword;

    @FindBy(xpath = "//label[@for='referenceCode']")
    WebElement referencecode;

    @FindBy(xpath = "//p[contains(text(),'By creating an account you agree to Partner')]")
    WebElement agreepartner;

    @FindBy(xpath = "//input[@id='btnSignUp']")
    WebElement btnSingup;

}
