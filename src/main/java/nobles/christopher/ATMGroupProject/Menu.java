package nobles.christopher.ATMGroupProject;

/**
 * Created by christophernobles on 9/17/16.
 */
public class Menu {
    Engine engine = new Engine();
    UserInput userInput = new UserInput();

    public boolean customerMenus(Customer value) {


        return false;
    }

    public void output(String param) {
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

    public boolean getUserLastName() {
        System.out.println("Please enter your LAST name.");
        return false;
    }

    public boolean renderMainMenu() {
        output("                          [[WELCOME]]" +
                "\n You have gained access to the least secure ATM on Earth." +
                "\n If you weren't broke before, you probably are now." +
                "\n-------------------------------------------------------");
        output("[1] New Customer" +
                "\n[2] Existing Customer Login" +
                "\n[3] Exit");
        return false;
    }

    public boolean renderAccounts() {
        output("You actually have accounts here. Bad choice.");
        output("Your accounts are listed below:");
        return false;
    }

    public boolean renderAccountsMenu() {
        output("[1] Credit" +
                "\n[2] Debit" +
                "\n[3] Transfer" +
                "\n[4] Close Account");
        return false;
    }

    public boolean INVALID() {
        output("YOU CANNOT DO THAT STOP IT BAD");
        return false;
    }

    public boolean renderExistingCustomerMenu() {
        output("ENTER ID:");
        userInput.prompt();


        return false;
    }

    public boolean renderNewCustomerMenu() {
        output("You're actually making an account here. I won't judge." +
                "\nEnter FIRST NAME:");
        String firstName = userInput.promptString();
        output("Enter LAST NAME: ");
        String lastName = userInput.promptString();
        output("Enter PIN");
        String pin = userInput.promptString();
        Customer newCustomer = engine.createNewCustomer(firstName, lastName, pin);
        //renderAccountsMenu(newCustomer);
        return false;
    }
}


