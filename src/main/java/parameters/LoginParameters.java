package parameters;

public enum LoginParameters {

    USERNAME("arne.hack.auto@pernod-ricard.com.eursb6pc"),
    PASSWORD("Salesforce4!"),
    AUTHENDPOINT("https://test.salesforce.com/services/Soap/u/53.0");


    private final String value;

    LoginParameters(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
