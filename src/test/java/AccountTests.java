import api.APIOperations;
import com.sforce.soap.partner.sobject.SObject;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import parameters.AccountRequiredFieldName;


public class AccountTests extends BaseTest {


    @Test
    public void account_created_on_back_end_is_displayed_on_app() {
        String accountName = RandomStringUtils.randomAlphabetic(10);


        APIOperations APIOperations = new APIOperations();
        SObject account = new SObject();

        account.setType(AccountRequiredFieldName.TYPE.getField_name());
        account.setField(AccountRequiredFieldName.NAME.getField_name(), accountName);
        account.setField(AccountRequiredFieldName.STATUS.getField_name(), "New customer");
        account.setField(AccountRequiredFieldName.POSTAL_CODE.getField_name(), "80411");
        account.setField(AccountRequiredFieldName.VISIT_FREQUENCY.getField_name(), "Personal frequency");
        APIOperations.createSObject(account);

        HomePage homepage = new HomePage();
        String actual = homepage.performSynchronization().openAccountTab().getAccountName();


        Assert.assertEquals(actual, accountName);


    }

    @Test
    public void account_created_on_back_end_is_displayed_on_app_1() {
        String accountName = RandomStringUtils.randomAlphabetic(10);
        SObject account = null;
        //account = DataGenerator.generateAccount(accountName);
        APIOperations.createSObject(account);
        /*
        homepage.performSynchronization()
        leftMenu.openAccountTab
        accountsPage.isAccountPresentInTheList(accountName)
         */
    }

}
