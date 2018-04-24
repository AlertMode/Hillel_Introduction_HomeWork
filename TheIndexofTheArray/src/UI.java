import java.util.Date;

public class UI {
    private static int option;
    private static int operationCounter;
    private static int theQuantity;


    public static void loginDisplay() {
        Date today = new Date();
        String userName = System.getProperty("user.name");
        System.out.println("Date: " + today);
        System.out.println("User: " + userName);
        System.out.println("\n");
    }

    public void landingPage() {
        boolean run = true;

        while(run) {
            System.out.println("The Biggest Number Detector");
            System.out.println("====================================================");
            System.out.println("[1] Start");
            System.out.println("[0] Exit");
            System.out.print("Choose the option: ");
            option = SecondaryMethods.checkForInt();
            System.out.println();
            switch(option) {
                case 0:
                    System.out.println("====================================================");
                    System.out.println("Cancelling the program...");;
                    return;
                case 1:
                    return;
                default:
                    System.out.println("ATTENTION!");
                    System.out.println("Out of the given options!");
                    System.out.println("Please, choose among the given options!");
                    System.out.println();
                    run = true;
            }
        }
    }

    public int inputPort() {
        System.out.println("----------------------------------------------------");
        System.out.println("Print-in the quantity of suspects!");
        System.out.println("WARNING: The admissible value: from 10 till 1000");
        System.out.println("----------------------------------------------------");
        System.out.println();

        System.out.print("Input: ");
        theQuantity = SecondaryMethods.checkForInt();
        System.out.println();
        if (theQuantity >= 10 && theQuantity <= 1000) {
        } else if(theQuantity < 0) {
            System.out.println("Wrong input: negative value.");
            System.out.println();
        } else {
            System.out.println("Wrong input: ouf of tolerance range.");
            System.out.println();
        }
        return theQuantity;
    }

    public void outputPort(int result) {
        ++operationCounter;
        System.out.println("====================================================");
        System.out.println("The suspect #" + result + " is the killer!");
        System.out.println("====================================================");
        if (operationCounter == 1) {
            System.out.println(operationCounter + " performed calculation.");
        } else {
            System.out.println(operationCounter + " performed calculations.");
        }
    }

    public boolean exit(){
        boolean result = false;
        if(option == 0) {
            result = true;
        }
        return result;
    }
}