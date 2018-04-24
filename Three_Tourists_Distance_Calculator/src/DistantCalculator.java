import java.util.Date;
import java.util.Scanner;

public class DistantCalculator {

    private int numberA;
    private int numberB;
    private int numberC;

    private static int actionCounter;
    private static int option;

    public static void main(String[] args) {

        dateDisplay();

        DistantCalculator theExecuteObject = new DistantCalculator();

        theExecuteObject.landingPage();

    }

    private static void dateDisplay() {

        Date today = new Date();
        String userName = System.getProperty("user.name");

        System.out.println("Date: " + today);
        System.out.println("User: " + userName);
        System.out.println();

    }

    private void landingPage() {

        boolean run = true;

        while(run){

            System.out.println("Three Digit Number Distance Calculator                 ver. 0.2a");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println("Enter the covered distance of three tourist in a row, please!");
            System.out.println();
            System.out.println("EXAMPLE");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Tourist 'A' covered 3 km. Tourist 'B' - 1 km. And 'C' - 8 km.");
            System.out.println("The data should be print-in the following way: 318");
            System.out.println("----------------------------------------------------------------");
            System.out.println();
            System.out.println("WARNING!");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Minimum value: 1");
            System.out.println("Maximum value: 999");
            System.out.println("----------------------------------------------------------------");
            System.out.println();
            System.out.println("[1] Enter the data");
            System.out.println("[0] Exit");
            System.out.println();

            System.out.println("----------------------------------------------------------------");

            if (actionCounter == 1) {
                System.out.println(actionCounter + " performed calculation.");
            } else {
                System.out.println(actionCounter + " performed calculations.");
            }

            System.out.println("----------------------------------------------------------------");

            System.out.println();
            System.out.print("Choose one option: ");
            option = SecondaryMethods.checkerForInt();
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            switch (option) {
                case 1: threeDigitInputPort();
                    break;
                case 0:
                    System.out.println(">>> Cancelling the program...");
                    System.out.println("\n");
                    return;
                default:
                    System.out.println("ATTENTION!");
                    System.out.println("Out of the given options!");
                    System.out.println("Please, choose among the given options!");
                    System.out.println("\n");
                    run = true;
            }
        }
    }

    private void threeDigitInputPort() {

        do {

            int threeDigitNumber = 0;

            System.out.println("INPUT WINDOW");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            threeDigitNumber = threeDigitChecker(threeDigitNumber);

            int twoDigitNumber = threeDigitRegrouper(threeDigitNumber);

            System.out.println("________________________________________________________________");
            System.out.println();
            System.out.println("The first tourist has covered " + numberA + " km.");
            System.out.println("The second tourist has covered " + numberB + " km.");
            System.out.println("The third tourist has covered " + numberC + " km.");
            System.out.println();
            System.out.println("All the three students have covered " + twoDigitNumber + " km in total.");
            System.out.println();

            ++actionCounter;

        }while(SecondaryMethods.repeatTheOperation());

    }

    private int threeDigitChecker (int number){

        boolean run = true;

        Scanner scanner = new Scanner(System.in);

        while (run = true) {

            System.out.print("Print-in three digit number: ");
            number = SecondaryMethods.checkerForInt();
            System.out.println();

            if ((number >= 1) & (number <= 999)) {
                break;
            }
            System.out.println("Wrong input!");
            System.out.println("Enter the appropriate value, please!");
            System.out.println("Press \"Enter\" to continue!");
            scanner.nextLine();
        }
        return number;
    }

    private int threeDigitRegrouper(int number) {

        numberC = number % 10;
        numberB = number / 10 % 10;
        numberA = number / 100;

        int sum = numberA + numberB + numberC;

        return sum;

    }
}