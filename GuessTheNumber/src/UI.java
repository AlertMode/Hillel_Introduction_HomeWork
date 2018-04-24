import java.util.Date;

public class UI {
    private static int option;
    private static int operationCounter;
    private static int theGuess;
    private static int theRangeValueAlpha;
    private static int theRangeValueOmega;

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
            System.out.println("Guess The Number");
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

    public int[] inputPortTheValueRange() {
        boolean result = true;
        do{
            System.out.println("----------------------------------------------------");
            System.out.println("Print-in the beginning and ending of the guess'");
            System.out.println("range value!");
            System.out.println("WARNING: The distance between ranges must be");
            System.out.println("not less than 10");
            System.out.println("----------------------------------------------------");
            System.out.println();
            while(result){
                System.out.print("The beginning of the range: ");
                theRangeValueAlpha = SecondaryMethods.checkForInt();
                System.out.println();
                System.out.print("The ending of the range: ");
                theRangeValueOmega = SecondaryMethods.checkForInt();
                System.out.println();
                if (Math.abs(theRangeValueOmega - theRangeValueAlpha) >= 10) {
                    result = false;
                    break;
                } else if(Math.abs(theRangeValueOmega - theRangeValueAlpha) < 10) {
                    System.out.println("Wrong input: the distance is less");
                    System.out.println("than required!");
                    System.out.println();
                } else {
                    System.out.println("Wrong input: ouf of tolerance range.");
                    System.out.println();
                }
                result = true;
            }
            SecondaryMethods.pause();
        }while(SecondaryMethods.repeatTheOperation());
        int[] alphaAndOmega = {theRangeValueAlpha, theRangeValueOmega};
        return alphaAndOmega;
    }
    
    public int inputPortTheGuess() {
            System.out.println("----------------------------------------------------");
            System.out.println("Print-in your guess!");
            System.out.println("WARNING: The admissible value: from 0 till 1000");
            System.out.println("----------------------------------------------------");
            System.out.println();

                System.out.print("Input: ");
                theGuess = SecondaryMethods.checkForInt();
                System.out.println();
                if (theGuess >= 0 && theGuess <= 1000) {
                } else if(theGuess < 0) {
                    System.out.println("Wrong input: negative value.");
                    System.out.println();
                } else {
                    System.out.println("Wrong input: ouf of tolerance range.");
                    System.out.println();
                }
        return theGuess;
    }

    public boolean outputPort(String message) {
        ++operationCounter;
        System.out.println("====================================================");
        System.out.println(message);
        System.out.println("====================================================");
        if (operationCounter == 1) {
            System.out.println(operationCounter + " performed calculation.");
        } else {
            System.out.println(operationCounter + " performed calculations.");
        }
        System.out.println();
        if(message.equals("You've nailed it!")){
            return true;
        } else {
            return false;
        }
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