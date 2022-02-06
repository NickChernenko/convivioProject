package api;

import com.sforce.soap.partner.sobject.SObject;
import com.sforce.ws.ConnectionException;

public class APIOperations{


    public static void createSObject(SObject account) {


        try {
            WSC.getConnection().create(new SObject[]{account});
        } catch (ConnectionException e) {
            e.printStackTrace();
        }


    }

    public void deleteSObject(String id) {

    }
}
