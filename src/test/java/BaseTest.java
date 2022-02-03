import driver.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    @BeforeMethod
    public static void setupClass() {
        DriverManager.getDriver();
    }

    @AfterMethod
    public void closeApp() {
        DriverManager.getDriver().quit();
    }

}
