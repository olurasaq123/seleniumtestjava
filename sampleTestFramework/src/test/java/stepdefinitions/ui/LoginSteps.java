package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigUtil;
import utilities.WebDriverHelpers;

public class LoginSteps {

    private WebDriverHelpers _webDriverHelpers;
    private LoginPage _loginPage;
    private ConfigUtil _configUrl;

    public LoginSteps(WebDriverHelpers webDriverHelpers, LoginPage loginPage){

        this._webDriverHelpers = webDriverHelpers;
        this._loginPage = loginPage;
    }

    @Given("that a user launch sauce demo website")
    public void thatAUserLaunchSauceDemoWebsite() throws Throwable{
        this._configUrl = new ConfigUtil();
        _webDriverHelpers.driver.get(_configUrl.loadEnvProfileData("baseUrl"));
    }

    @When("a user enter userName {string}")
    public void aUserEnterUserName(String userName) {
        _loginPage.enterUserName(userName);
    }

    @And("a user enter password {string}")
    public void aUserEnterPassword(String passWord) {
        _loginPage.enterPassWord(passWord);
    }

    @And("click login button")
    public void clickLoginButton() {
        _loginPage.clickLoginButton();
    }

    @Then("the user should be login successfully")
    public void theUserShouldBeLoginSuccessfully() {
        Assert.assertEquals(_loginPage.productTitleText(), "Products");
    }
}

