package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.Constants;
import utilities.SeleniumHelpers;

public class LoginPO {
    WebDriver driver;
    SeleniumHelpers selenium;

    public LoginPO(WebDriver driver){
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);

        PageFactory.initElements(new AjaxElementLocatorFactory(driver, Constants.PAGEFACTORY_WAIT_DURATION), this);
    }

    @FindBy(id = "email")
    private WebElement emailText;

    @FindBy(id = "password")
    private WebElement passwordText;

    @FindBy(xpath = "//*[@id=\"login-form-number\"]/button")
    private WebElement loginPhoneButton;

    @FindBy(xpath = "//*[@id=\"login-form\"]/button")
    private WebElement loginEmailButton;

    @FindBy(xpath = "//*[@id=\"page-phone-otp\"]/div/div/div/div/div/div/div[3]/div[1]/div[2]/span")
    private WebElement phoneNumberLogin;

    @FindBy(id = "phoneNumber1_phone_number")
    private WebElement phoneNumberText;

    @FindBy(xpath = "//p[@class='text-center text-verification-title']")
    private WebElement OTPVerificationText;


    public void fillEmail(String email){
        selenium.enterText(emailText, email, false);
    }

    public void fillPassword(String password){
        selenium.enterText(passwordText, password, false);
    }

    public void clickLoginEmailButton() throws InterruptedException{
        selenium.clickOn(loginEmailButton);
    }
    public void clickLoginPhoneNumberButton() throws InterruptedException{
        selenium.clickOn(loginPhoneButton);
    }
    public void clickPhoneNumberLogin() throws InterruptedException{
        selenium.clickOn(phoneNumberLogin);
    }

    public void fillPhoneNumber(String phoneNumber){
        selenium.enterText(phoneNumberText, phoneNumber, false);
    }

    public String getVerificationPageText(){
        return selenium.getText(OTPVerificationText);
    }
    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public String getPasswordWarningMessage(){
        return passwordText.getAttribute("validationMessage");
    }
    public String getEmailWarningMessage(){
        return emailText.getAttribute("validationMessage");
    }



}
