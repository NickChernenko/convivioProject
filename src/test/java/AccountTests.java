import api.APIOperations;
import com.sforce.soap.partner.Connector;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.soap.partner.sobject.SObject;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;
import data.utils.DataGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.HomePage;
import pages.LeftMenu;
import parameters.AccountRequiredFieldName;


public class AccountTests extends BaseTest {
    @Test
    public void tc_001() throws ConnectionException {
//          ConnectorConfig config = new ConnectorConfig();
//        config.setUsername("arne.hack.auto@pernod-ricard.com.eursb6pc");
//        config.setPassword("Salesforce4!");
//        config.setAuthEndpoint("https://test.salesforce.com/services/Soap/u/53.0");
//
//        PartnerConnection connection = Connector.newConnection(config);
//        SObject account = new SObject();
//        String accountName = DataGenerator.generateAccountName();
//        account.setType("EUR_CRM_Account__c");
//        account.setField("Name", accountName);
//        connection.create(new SObject[]{account});
//        System.out.println(accountName);
        HomePage homePage = new HomePage();
        homePage.performSynchronization();

        LeftMenu leftMenu = new LeftMenu();
        leftMenu.openAccountTab();
        String accountName = "Mykola Chernenko";
        Assert.assertTrue(AccountsPage.isAccountPresentInTheList(accountName));

    }

    @Test
    public void account_created_on_back_end_is_displayed_on_app() {

        SObject account = new SObject();

        String accountName = DataGenerator.generateAccountName();
        account.setType(AccountRequiredFieldName.TYPE.getFieldName());
        account.setField(AccountRequiredFieldName.NAME.getFieldName(), accountName);
        account.setField(AccountRequiredFieldName.STATUS.getFieldName(), "New customer");
        account.setField(AccountRequiredFieldName.POSTAL_CODE.getFieldName(), "88888");
        account.setField(AccountRequiredFieldName.VISIT_FREQUENCY.getFieldName(), "Personal frequency");
        APIOperations.createSObject(account);

        HomePage homePage = new HomePage();
        homePage.performSynchronization();

        LeftMenu leftMenu = new LeftMenu();
        leftMenu.openAccountTab();
        Assert.assertTrue(AccountsPage.isAccountPresentInTheList(accountName));
    }
   /* @Test
    public void account_created_on_back_end_is_displayed_on_app_1() {
        String accountName = RandomStringUtils.randomAlphabetic(10);
        SObject account = null;
        account = DataGenerator.generateAccount(accountName);
        APIOperations.createSObject(account);

        homepage.performSynchronization()
        leftMenu.openAccountTab
        accountsPage.isAccountPresentInTheList(accountName)

    }
*/

}
