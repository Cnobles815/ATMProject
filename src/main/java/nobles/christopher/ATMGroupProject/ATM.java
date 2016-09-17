package nobles.christopher.ATMGroupProject;
import java.util.Scanner;

/**
 * Created by christophernobles on 9/17/16.
 */
public class ATM {

    Menu menu = new Menu() ;
    UserInput userInput = new UserInput();
    Engine engine = new Engine();


    public void init(){
        Menu menu = new Menu();
        UserInput userInput = new UserInput();
        Engine engine = new Engine();

        menu.renderMainMenu();
    }

    public void mainMenu() {
        menu.renderMainMenu();
        boolean exit = false;
        int userChoice = userInput.prompt();
        while (exit = false)
        {exit = userChoice(this.userInput.prompt());}
    }

    public void userSelection(int userSelection) {
        switch (userChoice) {
            case 1:
                menu.renderNewCustomerMenu();
                break;
            case 2:
                menu.existingCustomerMenu();
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






}
