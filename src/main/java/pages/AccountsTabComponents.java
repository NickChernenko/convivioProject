package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class AccountsTabComponents extends BasePage {

    public MobileElement myAccountsTab = $(By.name("My Accounts"));

    public void getMyAccountInfo(String account_name) {
        $(By.name(account_name)).click();
    }
}
