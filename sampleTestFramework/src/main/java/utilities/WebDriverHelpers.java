package utilities;

import org.openqa.selenium.WebDriver;

public class WebDriverHelpers {

    public WebDriver driver;


    public String getCurrentPageTitle() {
        return driver.getTitle();
    }

}

