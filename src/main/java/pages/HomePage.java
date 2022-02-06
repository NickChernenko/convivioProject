package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class HomePage extends BasePage {


    public By accountsTab = MobileBy.xpath("//XCUIElementTypeStaticText[@name='ACCOUNTS(EU)']");
    public By synchronizationProgressBar = MobileBy.iOSClassChain("**/XCUIElementTypeOther[$label == 'Не сворачивайте приложение и не выключайте екран'$][-1]");
    public By synchronizationTab = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'СИНХ'`]");

    public void performSynchronization() {
        $(synchronizationTab).click();

    }
    public HomePage openAccountTab() {
        $(accountsTab).click();
        return this;
    }


}
