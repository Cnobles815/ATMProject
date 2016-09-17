package nobles.christopher.ATMGroupProject;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by christophernobles on 9/17/16.
 */
public class Transaction {

    private int transactionID;
    private int customerID;
    private int accountID;
    private enum transactionType;
    private double transactionAmount;
    private Date transactionDate;
    private boolean isSuccessful;

    public int getTransactionID(){
        return transactionID;
    }

    public int getCustomerID(){return customerID;}
    public int getAccountID(){return accountID;}

    public transactionType transactionType(){return transactionType();}

    public double getTransactionAmount(){return transactionAmount;}

    public Date getTransactionDate(){return transactionDate;}

    public boolean getIsSuccessful(){return isSuccessful;}

    public String toString(int input){

        return toString(input);

    }


}
