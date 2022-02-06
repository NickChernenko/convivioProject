package data.utils;

import org.apache.commons.lang.RandomStringUtils;

public class DataGenerator {


    public static String generateAccountName() {
        return RandomStringUtils.randomAlphabetic(10);
    }

}
