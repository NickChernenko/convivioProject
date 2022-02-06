package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class AccountsTabComponents extends BasePage {

    public By myAccountsTab = MobileBy.name("My Accounts");

    public void getMyAccountsInfo() {
        $(myAccountsTab).click();
    }
}
