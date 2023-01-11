package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.http.ContentType.JSON;

public class RequestSpec {

    public final static RequestSpecification REQ_SPEC = new RequestSpecBuilder().
            setBaseUri(DataUrls.BASIC_API_URL.getUrls()).
            setContentType(JSON).
            setAccept("*/*").
            build();
}
