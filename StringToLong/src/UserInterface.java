import java.util.Date;

public class UserInterface {

    private static int option;
    private static int operationCounter;
    private static String fullName;

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
            System.out.println("Prisoner ID Generator");
            System.out.println("====================================================");
            System.out.println("[1] Enter the data");
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

    public String inputPort() {

        do{
            System.out.println("----------------------------------------------------");
            System.out.println("Print in a prisoner's first name and last name!");
            System.out.println("----------------------------------------------------");
            System.out.println();
            System.out.print("Prisoner: ");
            fullName = SecondaryMethods.checkerForStringLine();
            System.out.println();
        }while(SecondaryMethods.repeatTheOperation());
        return fullName;
    }

    public void outputPort(long idNumber) {
        ++operationCounter;
        System.out.println("====================================================");
        System.out.println("Prisoner: " + fullName);
        System.out.println("ID number: " + idNumber);
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
