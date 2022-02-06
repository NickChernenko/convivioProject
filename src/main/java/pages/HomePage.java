package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    public IOSDriver driver;


    public By synchronizationProgressBar = MobileBy.iOSClassChain("**/XCUIElementTypeOther[$label == 'Не сворачивайте приложение и не выключайте екран'$][-1]");
    public By synchronizationTab = MobileBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'СИНХ'`]");

    public void performSynchronization() {
        WebDriverWait wait = new WebDriverWait(driver, 90);
        $(synchronizationTab).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(synchronizationProgressBar)).isEnabled();
    }

    }



