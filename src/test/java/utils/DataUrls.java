package utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static utils.PropertyHelper.getProperties;

@AllArgsConstructor
@Getter
public enum DataUrls {
    BASIC_API_URL(getProperties("baseAPIUrl")),
    SEARCH(getProperties("search")),
    AUTOCOMP_URL(getProperties("dadata"));
    private final String urls;
}
