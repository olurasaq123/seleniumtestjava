package pages;

import org.openqa.selenium.By;
import utilities.WebDriverHelpers;

public class LoginPage {
    private WebDriverHelpers _webDriverHelper;

    private By userNameTextBox = By.id("user-name");
    private By userPasswordTextBox = By.id("password");
    private By loginButton = By.id("login-button");
    private By productTitleText = By.xpath("//span[@class='title']");

    public LoginPage(WebDriverHelpers webDriverHelpers){
        this._webDriverHelper = webDriverHelpers;
    }

    public void enterUserName(String userName){
    _webDriverHelper.driver.findElement(userNameTextBox).sendKeys(userName);
    }

    public void enterPassWord(String password){
        _webDriverHelper.driver.findElement(userPasswordTextBox).sendKeys(password);
    }

    public void clickLoginButton(){
        _webDriverHelper.driver.findElement(loginButton).click();
    }

    public String productTitleText(){

        return _webDriverHelper.driver.findElement(productTitleText).getText();
    }

}
