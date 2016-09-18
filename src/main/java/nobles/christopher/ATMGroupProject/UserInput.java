package nobles.christopher.ATMGroupProject;

import java.util.Scanner;

/**
 * Created by christophernobles on 9/17/16.
 */
public class UserInput {
    Scanner userInput = new Scanner(System.in);


    public int prompt() {
        int a = userInput.nextInt();
        return a;
    }

    public double promptDouble() {
        double a = userInput.nextDouble();
        return a;
    }

    public String promptString() {
        String a = userInput.next();
        return a;
    }

    public int getFuckingResponse() {
        int a = userInput.nextInt();
        return a;
    }
}
