import java.util.Scanner;

/**
 * Created by kuwu on 2017/06/27.
 */
public class Powers {
    Scanner scnr = new Scanner(System.in);

    public void userNum() {
        System.out.println("Please enter a number: ");
        int input = scnr.nextInt();


        int numSq = (int)(Math.pow(input, 2));
        int numCu = (int)(Math.pow(input, 3));
        String heading1 = "Number";
        String heading2 = "Squared";
        String heading3 = "Cubed";
        String divider = "-----------------------------------------";
        System.out.printf("%-15s %-15s %-15s %n", heading1, heading2, heading3);
        System.out.println(divider);
        System.out.printf("%-15s %-15s %-15s %n", input, numSq, numCu);


    }

    public static char getUserInput() {
        Scanner scnr = new Scanner(System.in); // create a scanner object
        System.out.println("\nEnter 'y' to continue or 'n' to quit");
        // cast uppercase to lowercase
        String userInput = scnr.next().toLowerCase();

        return userInput.charAt(0);
    }

    public static void printInfo() {

        Powers check = new Powers();
        check.userNum();

    }


    public static void main(String[] args) {
        char userChar;
        boolean value = true;

        printInfo();

        do {
            userChar = getUserInput();
            if (userChar == 'y') {
                printInfo();
            } else if (userChar == 'n') {
                value = false;
            } else {
                System.out.println(userChar + " is not y or n, please re-enter again");
            }

        } while (value);


    }

}