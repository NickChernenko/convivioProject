package data.utils;

import com.github.javafaker.Faker;
import org.apache.commons.lang.RandomStringUtils;

public class DataGenerator {

    public static String accountName;


//    public static String generateAccountName() {
//        Faker faker = new Faker();
//        accountName = faker.name().fullName();
//        System.out.println(accountName);
//        return accountName;
//    }

    public static String generateAccountName() {
        return RandomStringUtils.randomAlphabetic(10);
    }


}
