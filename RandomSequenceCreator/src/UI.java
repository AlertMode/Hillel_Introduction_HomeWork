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
            System.out.println("Random Sequence Creator");
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

    public int[] inputPort() {
        do {
            boolean result = true;
            System.out.println("----------------------------------------------------");
            System.out.println("Print-in the minimum and the maximum value of the rate!");
            System.out.println("WARNING: The admissible value: from 1 till 10000");
            System.out.println("----------------------------------------------------");
            System.out.println();
            while (result) {
                System.out.print("Minimum Value ");
                minimum = inputPlugin(minimum);
                System.out.print("Maximum Value ");
                maximum = inputPlugin(maximum);
                System.out.println();
                if (maximum - minimum >= 10) {
                    result = false;
                    break;
                } else if (Math.abs(maximum - minimum) < 10) {
                    System.out.println("Wrong input: the distance is less");
                    System.out.println("than required!");
                    System.out.println();
                } else {
                    System.out.println("Wrong input: ouf of tolerance range.");
                    System.out.println();
                }
                result = true;
            }
        }while(SecondaryMethods.repeatTheOperation());
        int[] range = {minimum, maximum};
        return range;
    }

    public void outputPort(int[] array) {
        ++operationCounter;
        System.out.println("====================================================");
        arrayDisplay(array);
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

    public static void arrayDisplay(int array[]){
        for(int j = 0; j < array.length; j++){
            System.out.println("Program #" + array[j]);
        }
    }

    public static int inputPlugin(int number){
        boolean run = true;
        while(run) {
            System.out.print("Input: ");
            number = SecondaryMethods.checkForInt();
            System.out.println();
            if (number >= 1 && number <= 10000) {
                run = false;
                break;
            } else if (number < 0) {
                System.out.println("Wrong input: negative value.");
                System.out.println();
            } else {
                System.out.println("Wrong input: ouf of tolerance range.");
                System.out.println();
            }
        }
        return number;
    }
}