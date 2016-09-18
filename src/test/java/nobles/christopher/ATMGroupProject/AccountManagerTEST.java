package nobles.christopher.ATMGroupProject;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by christophernobles on 9/17/16.
 */
public class AccountManagerTEST {

//    @Test
//    public void createAccountTEST(){
//        AccountManager accountManager = new AccountManager();
//
//        boolean expectedValue = true;
//        boolean actualValue = accountManager.createAccount();
//        assertEquals("The value should be true" , expectedValue , actualValue);
//    }

    @Test
    public void closeAccountTEST(){
        AccountManager accountManager = new AccountManager();
        boolean expectedValue = true;
        boolean actualValue = accountManager.closeAccount();
        assertEquals("The value should be true" , expectedValue , actualValue);
    }

//    @Test
//    public void balanceInquiryTEST(){
//        AccountManager accountManager = new AccountManager();
//        String expectedValue = "Troublemaker.";
//        String actualValue = accountManager.balanceInquiry();
//        assertEquals("The value should be \"Troublemaker.\"" , expectedValue , actualValue);
//    }

//    @Test
//    public void depositTEST() {
//        AccountManager accountManager = new AccountManager();
//        boolean expectedValue = true;
//        boolean actualValue = accountManager.deposit(5.0);
//        assertEquals("The value should true" , expectedValue , actualValue);
//    }
//
//    @Test
//    public void withdrawalTEST(){
//        AccountManager accountManager = new AccountManager();
//        boolean expectedValue = true;
//        boolean actualValue = accountManager.withdrawal(5.0);
//        assertEquals("The value should be true" , expectedValue , actualValue);
//    }
//
//    @Test
//    public void transferTEST(){
//        AccountManager accountManager = new AccountManager();
//        boolean expectedValue = true;
//        boolean actualValue = accountManager.transfer();
//        assertEquals("The value should be true" , expectedValue , actualValue);
//    }





}
