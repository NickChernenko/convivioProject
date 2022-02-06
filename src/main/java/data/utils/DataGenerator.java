package data.utils;

import org.apache.commons.lang.RandomStringUtils;

public class DataGenerator {



    public static String generateAccountName(){
        String accountName = RandomStringUtils.randomAlphabetic(10);
        return accountName;

    }

}
