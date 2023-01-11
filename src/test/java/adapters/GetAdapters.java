package adapters;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static utils.RequestSpec.REQ_SPEC;

public class GetAdapters {

    public Response get(String url, int statuscode){


        return given().spec(REQ_SPEC).
                when().get(url).
                then().
                statusCode(statuscode).
                log().all().
                extract().response();
    }
}
