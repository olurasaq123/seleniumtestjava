package stepdefinitions.ui;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ConfigUtil;
import utilities.WebDriverHelpers;

import java.util.concurrent.TimeUnit;

public class Hooks extends WebDriverHelpers {

    private WebDriverHelpers _webDriverHelpers;
    private ConfigUtil _configUrl;

    public Hooks(WebDriverHelpers webDriverHelpers){
        this._webDriverHelpers = webDriverHelpers;

    }


    @Before("web")
    public void initialisation() throws Throwable{
        this._configUrl = new ConfigUtil();
        String browserName = _configUrl.loadEnvProfileData("browser");
        switch (browserName)
        {
            case "ie":
                System.out.println("Use internet explorer to run your test automation");
                break;
            case "firefox":
                System.out.println("Use firefox to run your test automation");
                break;
            case "chrome":
                String path = System.getProperty("user.dir");
                System.setProperty("webdriver.chrome.driver", path+"/tools/chromedriver.exe");
                _webDriverHelpers.driver = new ChromeDriver();
                _webDriverHelpers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                _webDriverHelpers.driver.manage().window().maximize();
        }

    }


    @After("web")
    public void shutDown(){
    _webDriverHelpers.driver.quit();
    }
}
