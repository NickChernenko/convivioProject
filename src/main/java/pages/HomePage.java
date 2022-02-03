package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public MobileElement synchronization_tab = $(By.xpath("//XCUIElementTypeStaticText[@name='СИНХ']"));
    public MobileElement accountsTab = $(By.xpath("//XCUIElementTypeStaticText[@name='ACCOUNTS(EU)']"));
    public MobileElement personalAccountName = $(By.xpath("//XCUIElementTypeTextView[@value='Testing_CT4']"));

    public HomePage performSynchronization() {
        synchronization_tab.click();
        return this;
    }

    public HomePage openAccountTab() {
        accountsTab.click();
        return this;
    }

    public String getAccountName() {
        return personalAccountName.getText();
    }
}
