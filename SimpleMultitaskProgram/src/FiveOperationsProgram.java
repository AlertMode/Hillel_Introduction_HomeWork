import java.util.*;

public class FiveOperationsProgram {

    private double numberA;
    private double numberB;
    private double numberC;
    private double theResult;
    static int option;
    static int performedOperations;

    private void operationSelection() {

        boolean run = true;

        while (run) {

            System.out.println();
            System.out.println("Greetings!");
            System.out.println("Choose the operation to proceed!");
            System.out.println();
            System.out.println("==========================MENU============================");
            System.out.println("[1] a + b * c / 2");
            System.out.println("[2] (a to the second grade + b to the second grade) / 2");
            System.out.println("[3] ( a + b ) / 12 * c % 4 + b");
            System.out.println("[4] (a - b * c ) / ( a + b ) % c");
            System.out.println("[5] | a - b | / ( a + b ) to the third grade - cos( c )");
            System.out.println("[6] Exit the program");
            System.out.println("===========================================================");
            System.out.print("Print-in the operation's number, please: ");

            option = SecondaryMethods.checkerForInt(option);
            switch (option) {
                case 1: dataInput(option);
                    break;
                case 2: dataInput(option);
                    break;
                case 3: dataInput(option);
                    break;
                case 4: dataInput(option);
                    break;
                case 5: dataInput(option);
                    break;
                case 6: return;
                default:
                    System.out.println("\nOut of possible options. \nChoose among the given variants, please!");
                    run = true;
            }
        }
    }

    public static void main(String[] args) {

        dataDisplay();

        FiveOperationsProgram theExecuteObject = new FiveOperationsProgram();

        theExecuteObject.operationSelection();

        System.out.println("");
        if (performedOperations <= 1 ) {
            System.out.println(performedOperations + " operation has been performed during the session.");
        } else {
            System.out.println(performedOperations + " operations have been performed during the session.");
        }
    }

    private void operationsStorage() {

        switch(option) {
            case 1: theResult = numberA + numberB * numberC / 2;
                break;
            case 2: theResult = (Math.pow(numberA, 2) + Math.pow(numberB, 2)) /2;
                break;
            case 3: theResult = (numberA + numberB) / 12 * numberC % 4 + numberB;
                break;
            case 4: theResult = (numberA - numberB * numberC) / (numberA + numberB) % numberC;
                break;
            case 5: theResult = Math.abs(numberA - numberB) / Math.pow(numberA + numberB, 3) - Math.cos(numberC);
                break;
        }

        ++performedOperations;

        theResult = Math.round(theResult * 100.0) / 100.0;

        System.out.println("----------------------------------------------------------");
        System.out.println("The result of the operation #" + option + ": " + theResult);
        System.out.println("----------------------------------------------------------");

    }


    public static void dataDisplay() {

        Date today = new Date();
        String userName = System.getProperty("user.name");

        System.out.println("Date: " + today);
        System.out.println("User: " + userName);
        System.out.println();

    }

    private void dataInput(int option) {

        do{
            System.out.println("\n");

            if ((option == 1 )||(option == 3) ||(option == 4)||(option == 5)) {
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Print-in any three decimal of integer numbers, please!");

                System.out.print("The first number: ");
                numberA = SecondaryMethods.checkForDouble();

                System.out.print("The second number: ");
                numberB = SecondaryMethods.checkForDouble();

                System.out.print("The third number: ");
                numberC = SecondaryMethods.checkForDouble();

                operationsStorage();
            } else if (option == 2) {
                System.out.println("Print-in any two decimal of integer numbers, please!");


                System.out.print("The first number: ");
                numberA = SecondaryMethods.checkForDouble();

                System.out.print("The second number: ");
                numberB = SecondaryMethods.checkForDouble();

                operationsStorage();
            } else {
                System.out.println("The entered option does not exist!");
            }
        } while(SecondaryMethods.repeatTheOperation());
    }
}