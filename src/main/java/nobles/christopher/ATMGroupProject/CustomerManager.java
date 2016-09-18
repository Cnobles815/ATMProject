package nobles.christopher.ATMGroupProject;

import java.util.ArrayList;

/**
 * Created by christophernobles on 9/17/16.
 */
public class CustomerManager {

    private ArrayList<Customer> customerList = new ArrayList<Customer>();
    private int customerIDCounter;

    public Customer createCustomer(String firstName, String lastName, String pin) {
        Customer newCustomer = new Customer(firstName, lastName, pin, customerIDCounter);
        customerList.add(newCustomer);
        customerIDCounter++;
        return newCustomer;
    }

    public int getCustomerIDCounter(Customer customer) {

        return customer.getCustomerID();

    }

}
