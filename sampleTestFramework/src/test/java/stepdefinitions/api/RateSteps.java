package stepdefinitions.api;

import dataModel.RateDataModel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import services.RateApi;

import java.util.List;
import java.util.Map;

public class RateSteps {

    private RateApi _rateApi;
    private Response response;
    private RateDataModel rateDataModel;
    RateDataModel.RateDataModelBuilder rateDataModelBuilder = RateDataModel.builder();

    public RateSteps(RateApi rateApi){
        this._rateApi = rateApi;
    }



    @Given("that a user make a Get request to get rate")
    public void thatAUserMakeAGetRequestToGetRate() {
        response = _rateApi.getRate();
    }

    @Then("i should get a {int} status code")
    public void iShouldGetAStatusCode(int statusCode) {
        Assert.assertEquals(statusCode, response.statusCode());
    }

    @And("i should be able to get a correct rate")
    public void iShouldBeAbleToGetACorrectRate(List<Map<String, String>> rateExpectedData)throws Throwable {

      // List<String> rateBody =  response.jsonPath().getList("toCurrency");
       String actualRateCurrency = response.jsonPath().get("toCurrency");
       String expectedCurrency = rateExpectedData.get(0).get("toCurrency");
       Assert.assertEquals(expectedCurrency, actualRateCurrency);
    }
}
