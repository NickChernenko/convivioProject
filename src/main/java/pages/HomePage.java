package pages;

import driver.utils.DriverManager;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {


    //public By synchronizationProgressBar = MobileBy.iOSClassChain("**/XCUIElementTypeOther[$label == 'Не сворачивайте приложение и не выключайте екран'$][-1]");
    public By synchronizationProgressBar = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Не сворачивайте приложение и не выключайте экран'`]");
    public By synchronizationTab = MobileBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'СИНХ'`]");

    public void performSynchronization() {
        $(synchronizationTab).click();

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 90);
        boolean synchronization = wait.until(ExpectedConditions.invisibilityOfElementLocated(synchronizationProgressBar));
        if (synchronization) {
            System.out.println("Synchronization completed");
        } else {
            System.out.println("Synchronization error");
        }
    }

}



