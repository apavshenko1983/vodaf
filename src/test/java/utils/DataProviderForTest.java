package utils;

import org.testng.annotations.DataProvider;

public class DataProviderForTest {

    @DataProvider(name = "daData")
    public static Object[][] getVariablesDataForAutocomplete() {
        return new Object[][]{
                {"при", 2, "Правила"},
                {"авы", 0, ""}
        };
    }
}
