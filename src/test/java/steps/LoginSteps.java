package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobjects.LoginPO;
import utilities.Constants;
import utilities.SeleniumHelpers;
import utilities.ThreadManager;


public class LoginSteps {
    private WebDriver driver = ThreadManager.getDriver();
    private LoginPO login = new LoginPO(driver);
    private SeleniumHelpers selenium = new SeleniumHelpers(driver);

    @Given("user open to {string}")
    public void userNavigates(String url){
        if (url.equalsIgnoreCase("mister-aladin-login")){
            url = Constants.MISTER_ALADIN_LOGIN_URL;
        }
        selenium.navigateToPage(url);
    }

    @When("user input email {string}")
    public void userInputEmail(String email){
        login.fillEmail(email);
    }

    @And("user input password {string}")
    public void userInputPassword(String password){
        login.fillPassword(password);
    }

    @And("user click login button with valid email and password")
    public void userClickLogin() throws InterruptedException{
        login.clickLoginEmailButton();
    }

    @Then("user should be at the home page")
    public void userAtDashboardPage(){
        Assert.assertFalse(login.getPageTitle().contains("404"));
        Assert.assertTrue(login.getCurrentUrl().contains("https://www.misteraladin.com/"));
    }

    @And("user click to login with phone number")
    public void userClickPhoneNumberLogin() throws InterruptedException{
        login.clickPhoneNumberLogin();
    }

    @When("user input phone number {string}")
    public void userInputPhoneNumber(String phoneNumber){
        login.fillPhoneNumber(phoneNumber);
    }

    @And("user click login button with valid phone number")
    public void userClickLoginWithPhoneNumber() throws InterruptedException{
        login.clickLoginPhoneNumberButton();
    }
    @Then("user should be at the OTP verification page")
    public void userAtOTPVerificationPage(){
        Assert.assertTrue(login.getVerificationPageText().contains("Masukkan kode OTP"));
    }



}
