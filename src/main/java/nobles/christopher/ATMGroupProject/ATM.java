package nobles.christopher.ATMGroupProject;

/**
 * Created by christophernobles on 9/17/16.
 */
public class ATM {

    Menu menu = new Menu();
    UserInput userInput = new UserInput();
    Engine engine = new Engine();


    public void init() {
        Menu menu = new Menu();
        UserInput userInput = new UserInput();
        Engine engine = new Engine();

        menu.renderMainMenu();
    }

    public void mainMenu() {
        menu.renderMainMenu();
        int exit = 0;
        int userChoice = userInput.prompt();
        while (userChoice != 3) {
            mainMenu();
        }
    }

    public void userSelection(int userSelection) {
        switch (userSelection) {
            case 1:
                menu.renderNewCustomerMenu();
                break;
            case 2:
                menu.renderExistingCustomerMenu();
                break;
            case 3:
                menu.output("Good choice.");
                break;
            default:
                menu.INVALID();
                mainMenu();
        }


    }
}







