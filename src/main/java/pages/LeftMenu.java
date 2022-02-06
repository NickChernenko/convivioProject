package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LeftMenu extends BasePage {


    public By homeTab = MobileBy.name("ГЛАВНАЯ");
    public By librariesTab = MobileBy.name("LIBRARIES");
    public By chatterTab = MobileBy.name("ЧАТТЕР");
    public By accountsTab = MobileBy.xpath("//XCUIElementTypeStaticText[@name='ACCOUNTS(EU)']");


    public void openAccountTab(){
        $(accountsTab).click();
    }

}
