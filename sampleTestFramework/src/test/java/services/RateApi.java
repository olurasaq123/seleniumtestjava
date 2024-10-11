package services;

import com.google.gson.Gson;
import dataModel.RateDataModel;
import io.restassured.response.Response;
import utilities.ApiHelpers;

public class RateApi extends ApiHelpers {

    public static String rateAPI = "/api/Rate/get-rate";
    public static String rateAPIPost = "/api/Rate/set-rate";
    Response response;

    public Response createNewRate(RateDataModel rateDataModel){

        response = givenConfig().when().body(gson().toJson(rateDataModel))
                .post(rateAPIPost);
        return response;
    }

    public Response getRate(){

        response = givenConfig().when()
                .get(rateAPI);
        return response;
    }

    public Response updateRate(RateDataModel rateDataModel){
        response = givenConfig().when().body(gson().toJson(rateDataModel))
                .put(rateAPIPost);
        return response;
    }

    public Response deleteRate(){

        response = givenConfig().when()
                .delete(rateAPI);
        return response;
    }
}
