import java.util.Date;

public class UI {
    private static int option;
    private static int operationCounter;
    private static int shuttlesQuantity;

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
            System.out.println("Space shuttles' enumerator             Japan Edition");
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

    public int inputPortShuttlesQuantity() {
        boolean result = true;
        do{
            System.out.println("----------------------------------------------------");
            System.out.println("Print-in the space shuttles' value range!");
            System.out.println("WARNING: The admissible value: from 200 till 999");
            System.out.println("----------------------------------------------------");
            System.out.println();
            while(result){
                System.out.print("Input: ");
                shuttlesQuantity = SecondaryMethods.checkForInt();
                System.out.println();
                if (shuttlesQuantity >= 200 && shuttlesQuantity <= 999) {
                    result = false;
                    break;
                } else if(shuttlesQuantity < 0) {
                    System.out.println("Wrong input: negative value.");
                    System.out.println("Where the hell have you seen \"negative quantity\"?");
                    System.out.println();
                } else {
                    System.out.println("Wrong input: ouf of tolerance range.");
                    System.out.println();
                }
                result = true;
            }
            SecondaryMethods.pause();
        }while(SecondaryMethods.repeatTheOperation());
        return shuttlesQuantity;
    }

    public void outputPort(int[] idArray) {
        ++operationCounter;
        System.out.println("====================================================");
        System.out.println("The space shuttles' quantity: " +  shuttlesQuantity);
        System.out.println();
        cyclicPrint(idArray);
        System.out.println("====================================================");
        if (operationCounter == 1) {
            System.out.println(operationCounter + " performed calculation.");
        } else {
            System.out.println(operationCounter + " performed calculations.");
        }
        System.out.println();
        SecondaryMethods.pause();
    }

    private static void cyclicPrint(int[] idArray) {
            for(int counterB = 0, counterC = 1; counterB < idArray.length; counterB++, counterC++){
                System.out.println("The shuttle #" + counterC + " : " + idArray[counterB]);
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