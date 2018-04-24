import java.util.Date;

class Interface {

    private int number;
    private static int option;
    private static int operationCounter;

    public static void dataDisplay() {
        Date today = new Date();
        String userName = System.getProperty("user.name");

        System.out.println("Date: " + today);
        System.out.println("User: " + userName);
        System.out.println("\n");
    }

    public void landingPage () {
            boolean run = true;

            while(run) {
                System.out.println("Even Number Detector                   ver. 0.3");
                System.out.println("===============================================");
                System.out.println("[1] Enter a number");
                System.out.println("[0] Exit");
                System.out.println();
                System.out.print("Choose one option: ");

                option = SecondaryMethods.checkerForInt();

                System.out.println();

                switch(option) {
                    case 1:
                        return;
                    case 0:
                        System.out.println("===============================================");
                        System.out.println("Cancelling the program...");
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

    public void setNumber() {
        System.out.println("===============================================");
        System.out.print("Print-in an integer number: ");
        number = SecondaryMethods.checkerForInt();
    }

    public int getNumber() {
        return number;
    }

    public boolean exit(){

        boolean result = false;
        if(option == 0) {
            result = true;
        }
        return result;

    }

    public void errorMessage() {
        System.out.println("Something goes wrong. \nThe operation has been aborted.");
    }

    public void resultOutput(int number, boolean value) {
        String oddOrEven = null;

        ++operationCounter;

        if (value == true) {
            oddOrEven = "even.";
        } else {
            oddOrEven = "odd.";
        }
        System.out.println("-----------------------------------------------");
        System.out.println("The number " + number + " is " + oddOrEven);
        System.out.println();
        if (operationCounter == 1) {
            System.out.println(operationCounter + " performed calculation.");
        } else {
            System.out.println(operationCounter + " performed calculations.");
        }
        System.out.println("-----------------------------------------------");
        System.out.println();
        SecondaryMethods.pause();
        System.out.println();
    }

}
