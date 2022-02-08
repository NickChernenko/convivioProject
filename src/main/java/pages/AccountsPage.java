package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AccountsPage extends BasePage {

    public By myAccountsTab = MobileBy.name("My Accounts");
    // public By myAccounts = MobileBy.iOSClassChain("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable");


    public void getMyAccountsInfo() {
        $(myAccountsTab).click();
    }

    public static boolean isAccountPresentInTheList(String accountName) {
         By createdAccountName = MobileBy.name(accountName);
        if($(createdAccountName).isEnabled()){
            System.out.println("Account is present");
            return true;
        }else {
            System.out.println("Account isn't present");
        }

        return false;
    }

}
