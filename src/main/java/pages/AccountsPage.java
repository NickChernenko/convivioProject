package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AccountsPage extends BasePage {

    public By myAccountsTab = MobileBy.name("My Accounts");

    public void getMyAccountsInfo() {
        $(myAccountsTab).click();
    }
}
