package api;

import com.sforce.soap.partner.Connector;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;
import parameters.LoginParameters;

public class WSC {
  public static  PartnerConnection connection;

    private static PartnerConnection createConnection() {

        ConnectorConfig config = new ConnectorConfig();
        config.setUsername(LoginParameters.USERNAME.getValue());
        config.setPassword(LoginParameters.PASSWORD.getValue());
        config.setAuthEndpoint(LoginParameters.AUTHENDPOINT.getValue());
        try {
            return Connector.newConnection(config);
        } catch (ConnectionException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static PartnerConnection getConnection() {
        if (connection == null) {
            connection = createConnection();
        }


        return connection;
    }
}
