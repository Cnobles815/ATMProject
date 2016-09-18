package nobles.christopher.ATMGroupProject;

/**
 * Created by christophernobles on 9/17/16.
 */
public class Customer {

    private int customerID;
    private String firstName;
    private String lastName;
    private String userName;
    private String pin;

    Customer(String firstName, String lastName, String pin, int customerID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.customerID = customerID;
    }


    public int getCustomerID() {
        return this.customerID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPin() {
        return this.pin;
    }
}
