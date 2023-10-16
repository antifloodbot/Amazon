package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestDataReader {
    private static Properties properties = new Properties();

    static {
        try (InputStream input = TestDataReader.class.getResourceAsStream("/testData.properties")) {
            if (input == null) {
                throw new IOException("Unable to find testData.properties");
            }
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
