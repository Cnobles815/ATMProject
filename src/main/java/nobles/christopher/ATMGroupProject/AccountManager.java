package nobles.christopher.ATMGroupProject;

import java.util.ArrayList;

/**
 * Created by christophernobles on 9/17/16.
 */
public class AccountManager {

    private ArrayList<Account> accounts = new ArrayList<Account>();
    private int accountIDCounter = 0;

    public Account createAccount(Customer customer, AccountType type) {
        Account account = new Account(accountIDCounter, customer, type);
        accounts.add(account);
        accountIDCounter++;
        return account;


    }

    public boolean closeAccount() {

        return true;
    }

//    private Account getAccountByID(int userID) {
//
//        return;
//    }

    public String balanceInquiry(Account account) {

        String balance = String.valueOf(account.getAccountBalance());

        return balance;
    }

    public double deposit(Account account, Double depositAmount) {

        double balance = account.getAccountBalance();

        double answer = balance + depositAmount;

        return answer;
    }

    public double withdrawal(Account account, Double withdrawalAmount) {

        double balance = account.getAccountBalance();

        double answer = balance - withdrawalAmount;


        return answer;
    }

    public boolean transfer(Account sendingAccount, Account recievingAccount, Double transferAmount) {
        withdrawal(sendingAccount, transferAmount);
        deposit(recievingAccount, transferAmount);

        return false;
    }

    public void getAccountByID(int accountID) {

    }

    enum AccountStatus {OPEN, CLOSED, OFAC}

    public enum AccountType {CHECKING, SAVING, INVESTMENT}


}
