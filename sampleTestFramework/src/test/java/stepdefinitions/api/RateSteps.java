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

    RateDataModel.RateDataModelBuilder rateDataModelBuilder = RateDataModel.builder();

    private RateDataModel rateDataModel;
    RateDataModel.RateDataModelBuilder rateDataBuilder = RateDataModel.builder();

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

    @Given("that a user make a Post request to set rate")
    public void thatAUserMakeAPostRequestToSetRate(List<Map<String, String>> rateData) {

        rateDataModel = rateDataBuilder
                .rate(Integer.parseInt(rateData.get(0).get("rate")))
                .fromCurrency(rateData.get(0).get("fromCurrency"))
                .toCurrency(rateData.get(0).get("toCurrency")).build();


        response = _rateApi.createNewRate(rateDataModel);
    }

    @Then("the response message should be {string}")
    public void theResponseMessageShouldBe(String successMsg) {

       Assert.assertEquals(response.jsonPath().get("message"), successMsg);
    }
}
