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

    Account (int accountID, Customer customer, AccountManager.AccountType type){
        this.accountBalance = 0;
        this.accountStatus = Account.AccountStatus.OPEN;
        this.accountID = accountID;
        this.accountOwner = customer;
    }

    //getters!

    public int getAccountID(){return this.accountID;}

    public Customer getAccountOwner(){return this.accountOwner;}

    public double getAccountBalance(){return this.accountBalance;}

    public AccountType getAccountType(){return this.accountType;}

    public AccountStatus getAccountStatus(){return this.accountStatus;}

    public void setAccountBalance(double balance){this.accountBalance = balance;}

    public void setAccountStatus(AccountStatus  status){this.accountStatus = status;}
    }
}
