import java.util.Date;

public class UI {
    private static int option;
    private static int operationCounter;
    private static long theCode;

    public int getOption() {
        return option;
    }

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
            System.out.println("Serial Number Decoder");
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

    public long inputPortSerialNumber() {
        boolean result = true;
        do{
            System.out.println("----------------------------------------------------");
            System.out.println("Print-in the code");
            System.out.println("WARNING! The admissible code's value:");
            System.out.println("From: 100 000 000 000");
            System.out.println("Till: 999 999 999 999");
            System.out.println("----------------------------------------------------");
            System.out.println();
            while(result){
                System.out.print("Input: ");
                theCode = SecondaryMethods.checkForLong();
                System.out.println();
                long alpha = 100000000000L;
                long omega = 999999999999L;
                if (theCode >= alpha && theCode <= omega) {
                    result = false;
                    break;
                } else {
                    System.out.println("Wrong input: ouf of tolerance range.");
                    System.out.println();
                }
                result = true;
            }
            SecondaryMethods.pause();
        }while(SecondaryMethods.repeatTheOperation());
        return theCode;
    }

    public void outputPort(byte idArray) {
        ++operationCounter;
        System.out.println("====================================================");
        System.out.println("The printed-in code: " + theCode);
        System.out.println("The produced quantity of botnarium: " + idArray);
        System.out.println("====================================================");
        if (operationCounter == 1) {
            System.out.println(operationCounter + " performed calculation.");
        } else {
            System.out.println(operationCounter + " performed calculations.");
        }
        System.out.println();
        SecondaryMethods.pause();
    }

    public boolean exit(){
        boolean result = false;
        if(option == 0) {
            result = true;
        }
        return result;
    }
}