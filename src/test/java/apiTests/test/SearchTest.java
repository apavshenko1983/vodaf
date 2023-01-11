package apiTests.test;

import apiTests.steps.SearchSteps;
import models.SearchModel;
import org.testng.annotations.Test;
import utils.DataProviderForTest;

import java.util.List;

import static utils.DataUrls.AUTOCOMP_URL;
import static utils.DataUrls.SEARCH;


public class SearchTest {
    SearchSteps searchSteps = new SearchSteps();

    @Test(dataProvider = "daData", dataProviderClass = DataProviderForTest.class)
    public void daDataTest(String text, int size, String elemName) {

        List<String> daDataVariants = searchSteps.getAutocompleteInfo(SEARCH.getUrls() +
                AUTOCOMP_URL.getUrls() + text, 200);
        searchSteps.checkListSize(daDataVariants, size);
        searchSteps.checkFirstElement(daDataVariants, elemName);
    }

    @Test
    public void searchTest(){
        List<SearchModel> models = searchSteps.getSearchInfo(SEARCH.getUrls()+"при", 200);
        searchSteps.checkListSize(models,10);
    }
}
