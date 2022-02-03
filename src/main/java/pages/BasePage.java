package pages;

import driver.utils.DriverManager;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;


public abstract class BasePage {


    public static MobileElement $(By by) {
        return DriverManager.getDriver().findElement(by);
    }

    public List<MobileElement> $$(By by) {
        return DriverManager.getDriver().findElements(by);
    }


}
