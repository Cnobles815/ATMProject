package nobles.christopher.ATMGroupProject;

import java.util.ArrayList;

/**
 * Created by christophernobles on 9/17/16.
 */
public class Engine {

    Customer customer;
    CustomerManager customerManager = new CustomerManager();
    Account account;
    AccountManager accountManager = new AccountManager();
    Transaction transaction;
    TransactionManager transactionManager = new TransactionManager();

    public Customer createNewCustomer(String firstName, String lastName, String pin) {


        return customerManager.createCustomer(firstName, lastName, pin);
    }

    public Customer authenticate(int accountNumber, int pin) {
       // Customer customer = customerManager.getCustomerID(userID);
        if (customer.getPin().equals(pin)) {
            return customer;
        }
            return customer;
    }

//    ArrayList<Account> getCustomerAccounts(Customer customer) {
//        return accountManager.getCustomerAccounts(customer);
//    }


//    public boolean deposit(Account userAccount, double amount) {
//        accountManager.deposit(userAccount, amount);
//        return false;
//    }

    public boolean transfer(Account senderAccount, Account receiverAccount, double amount) {

        accountManager.withdrawal(senderAccount, amount);
        accountManager.deposit(receiverAccount, amount);
        return false;

    }

    public boolean withdrawal(Account userAccount, double amount) {
        accountManager.withdrawal(userAccount, amount);
        return false;
    }

    //public void

    boolean closeAccount() {

        return false;
    }

}
