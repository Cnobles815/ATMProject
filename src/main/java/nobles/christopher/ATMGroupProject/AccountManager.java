package nobles.christopher.ATMGroupProject;

import java.util.ArrayList;

/**
 * Created by christophernobles on 9/17/16.
 */
public class AccountManager {

    private ArrayList<Account> accounts = new ArrayList<Account>();
    private int accountIDCounter;
    enum AccountStatus{OPEN,CLOSED,OFAC}
    public enum AccountType{CHECKING,SAVING,INVESTMENT}

//    private Account getAccountByID(int userID) {
//
//        return;
//    }

    public boolean createAccount(){

        return true;
    }

    public boolean closeAccount(){

        return true;
    }

    public String balanceInquiry(){

        String a = "Troublemaker.";

        return a;
    }

    public boolean deposit(Double depositAmount){

        return true;
    }

    public boolean withdrawal(Double withdrawalAmount){

        return true;
    }

    public boolean transfer (Account destination, Double transferAmount){

        return false;
    }
}
