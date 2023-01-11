package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyHelper {

    private static final String URI_PATH = "src/test/resources/project.properties";

    public static String getProperties(String properName) {
        Properties properties = new Properties();
        File propertyFile = null;
        try {
            propertyFile = new File(URI_PATH);
            properties.load(new FileReader(propertyFile));
            return properties.getProperty(properName);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read property file:" + propertyFile.getAbsolutePath());
        }
    }
}
