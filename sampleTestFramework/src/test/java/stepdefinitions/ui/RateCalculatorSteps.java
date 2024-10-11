package stepdefinitions.ui;

import groovyjarjarantlr4.v4.codegen.model.chunk.RulePropertyRef_parser;
import io.cucumber.java.en.Given;
import org.openqa.selenium.devtools.v85.page.Page;
import utilities.PageObjectHelper;
import utilities.WebDriverHelpers;

import java.time.Duration;

public class RateCalculatorSteps {

    private WebDriverHelpers webDriverHelpers;
    private PageObjectHelper pageObjectHelper;
    public RateCalculatorSteps(WebDriverHelpers _webDriverHelpers, PageObjectHelper _pageObjectHelpers) {
        this.webDriverHelpers = _webDriverHelpers;
        this.pageObjectHelper = _pageObjectHelpers;
    }


    @Given("that a user loads an application under test$")
    public void launchApplication() throws InterruptedException{
        webDriverHelpers.driver.get("https://main--exchange-rate-calculator-2024.netlify.app/");
        Thread.sleep(Duration.ofSeconds(3));
        String pg = webDriverHelpers.getCurrentPageTitle();
        System.out.println(pg);

    }
}
