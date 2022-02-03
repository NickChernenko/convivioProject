package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class SideMenuComponents extends BasePage {


    public MobileElement homeTab = $(By.name("ГЛАВНАЯ"));
    public MobileElement librariesTab = $(By.name("LIBRARIES"));
    public MobileElement chatterTab = $(By.name("ЧАТТЕР"));
    //public MobileElement chatterTab = $(By.name("CHATTER"));

    public static MobileElement contactTab = $(By.name("CONTACTS"));


}
