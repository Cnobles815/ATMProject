package nobles.christopher.ATMGroupProject;

/**
 * Created by christophernobles on 9/17/16.
 */
public class Account {
    private int accountID;
    private Customer accountOwner;
    private double accountBalance;
    private AccountType accountType;
    private AccountStatus accountStatus;

    //enum AccountType{CHECKING,SAVINGS,INVESTMENT}
    enum AccountStatus{OPEN,CLOSED,OFAC}
    enum AccountType{CHECKING,SAVING,INVESTMENT}

    //getters!

    public int getAccountID(){return accountID;}

    public Customer getAccountOwner(){return accountOwner;}

    public double getAccountBalance(){return accountBalance;}

    public AccountType getAccountType(){return accountType;}

    public AccountStatus getAccountStatus(){return accountStatus;}
}
