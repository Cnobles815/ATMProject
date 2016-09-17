package nobles.christopher.ATMGroupProject;

/**
 * Created by christophernobles on 9/17/16.
 */
public class Menu {

    public boolean customerMenus(Customer value) {



        return false;
    }

    public void output(String param){
        System.out.println(param);
    }

    public String generateGreeting() {

        String greeting = ("[[WELCOME]]" +
                "\n You are currently accessing the least secure ATM on Earth" +
                "\n If you weren't broke before, you probably are now.");

        return greeting;
    }

    public String getUserFirstName() {
        String userName = ("Please enter your FIRST name.");
        return userName;
    }

    public boolean getUserLastName(){
        System.out.println("Please enter your LAST name.");
    }

    public void renderMainMenu() {
        output("[[WELOME]]" +
                "\n You have gained access to the least secure ATM on Earth" +
                "\n If you weren't broke before, you probably are now." +
                "\n-------------------------------------------------------");
        output("[1] New Customer" +
                "\n[2] Existing Customer Login" +
                "\n[3] Exit");
    }

    public void renderAccounts() {
        output("You actually have accounts here. Bad choice.");
        output("Your accounts are listed below:");
    }

    public void renderNewCustomerMenu() {
        output()
    }

    public void renderAccountsMenu() {
        output("[1] Credit" +
                "\n[2] Debit" +
                "\n[3] Transfer" +
                "\n[4] Close Account");
    }

    public void INVALID() {
        output("YOU CANNOT DO THAT STOP IT BAD");
    }
}


