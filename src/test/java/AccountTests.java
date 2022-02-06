import api.APIOperations;
import com.sforce.soap.partner.sobject.SObject;
import com.sforce.ws.ConnectionException;
import data.utils.DataGenerator;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LeftMenu;
import parameters.AccountRequiredFieldName;




public class AccountTests extends BaseTest {


    @Test
    public void account_created_on_back_end_is_displayed_on_app() throws ConnectionException {


        SObject account = new SObject();
        APIOperations.createSObject(account);

        String accountName = DataGenerator.generateAccountName();
        account.setType(AccountRequiredFieldName.TYPE.getFieldName());
        account.setField(AccountRequiredFieldName.NAME.getFieldName(), accountName);
        account.setField(AccountRequiredFieldName.STATUS.getFieldName(), "New customer");
        account.setField(AccountRequiredFieldName.POSTAL_CODE.getFieldName(), "88888");
        account.setField(AccountRequiredFieldName.VISIT_FREQUENCY.getFieldName(), "Personal frequency");

        HomePage homePage = new HomePage();
        homePage.performSynchronization();

        LeftMenu leftMenu = new LeftMenu();
        leftMenu.openAccountTab();

    }
   /* @Test
    public void account_created_on_back_end_is_displayed_on_app_1() {
        String accountName = RandomStringUtils.randomAlphabetic(10);
        SObject account = null;
        //account = DataGenerator.generateAccount(accountName);
        APIOperations.createSObject(account);

        homepage.performSynchronization()
        leftMenu.openAccountTab
        accountsPage.isAccountPresentInTheList(accountName)

    }
*/

}
