package parameters;

public enum AccountRequiredFieldName {
    TYPE("EUR_CRM_Account__c"),
    NAME("Name"),
    STATUS("EUR_CRM_Status__c"),
    POSTAL_CODE("EUR_CRM_Postal_Code__c"),
    VISIT_FREQUENCY("EUR_CRM_Visit_frequency__c");

    private final String field_name;

    AccountRequiredFieldName(String field_name) {
        this.field_name = field_name;

    }

    public String getField_name() {
        return field_name;
    }

}
