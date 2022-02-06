package driver.utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    protected static IOSDriver<MobileElement> driver;

    public static IOSDriver<MobileElement> getDriver() {

        MutableCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APP, "/var/tmp/PernodRicard.app");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
        capabilities.setCapability(IOSMobileCapabilityType.USE_NEW_WDA, false);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
        capabilities.setCapability("autoAcceptAlerts", false);
        capabilities.setCapability("deviceOrientation", "landscape");
        capabilities.setCapability("includeSafariInWebviews", true);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad (8th generation)");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.2");


        try {

            driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;


    }




}