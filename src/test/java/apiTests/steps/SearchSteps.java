package apiTests.steps;

import adapters.GetAdapters;
import io.restassured.response.ResponseBody;
import models.SearchModel;
import org.testng.Assert;

import java.util.List;

public class SearchSteps {

    public List<String> getAutocompleteInfo(String uri, int code) {
        return response(uri, code).jsonPath().getList("data");
    }

    public List<SearchModel> getSearchInfo(String uri, int code) {
        return response(uri, code).jsonPath().getList("data", SearchModel.class);
    }

    public void checkListSize(List<? extends Object> genericType, int expected) {
        int actual = genericType.size();
        Assert.assertEquals(actual, expected);
    }

    public void checkFirstElement(List<String> list, String name) {
        String actual;
        if (list.size() == 0) {
            actual = "";
        } else {
            actual = list.get(0);
        }
        Assert.assertEquals(actual, name);
    }

    private ResponseBody response(String uri, int code) {
        return new GetAdapters().get(uri, code).getBody();
    }
}
