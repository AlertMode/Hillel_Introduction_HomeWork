import java.util.Date;

public class UI {
    private static int option;
    private static int operationCounter;
    private static int minimum;
    private static int maximum;


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
            System.out.println("Prime Numbers");
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

//    public int[] inputPort() {
//        boolean run = true;
//        System.out.println("----------------------------------------------------");
//        System.out.println("Print-in the minimum and the maximum value of the rate!");
//        System.out.println("WARNING: The admissible value: from 1 till 10000");
//        System.out.println("----------------------------------------------------");
//        System.out.println();
//        System.out.print("Minimum Value ");
//        minimum = inputPlugin(minimum);
//        System.out.print("Maximum Value ");
//        System.out.println();
//        maximum = inputPlugin(maximum);
//        int[] range = {minimum, maximum};
//        return range;
//    }

    public void outputPort(int[] array) {
        ++operationCounter;
        System.out.println("====================================================");
        LogicalUnit.assigner(array);
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

//    public static int inputPlugin(int number){
//        boolean run = true;
//        while(run) {
//            System.out.print("Input: ");
//            number = SecondaryMethods.checkForInt();
//            System.out.println();
//            if (number >= 1 && number <= 1000) {
//                run = false;
//                break;
//            } else if (number < 0) {
//                System.out.println("Wrong input: negative value.");
//                System.out.println();
//            } else {
//                System.out.println("Wrong input: ouf of tolerance range.");
//                System.out.println();
//            }
//        }
//        return number;
//    }
}