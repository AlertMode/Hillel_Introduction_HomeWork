import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Date;

public class UI {
    private static int option;
    private static int operationCounter;
    private static char letter_0;
    private static char letter_1;
    private static char letter_2;
    private static char letter_3;
    private int value;


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
            System.out.println("Array Symbol Counter");
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

    public char[] inputPortLetters() {
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("Print-in the four any characters or symbols!");
            System.out.println("----------------------------------------------------");
            System.out.println();
            System.out.print("The first symbol: ");
            letter_0 = SecondaryMethods.checkerForChar();
            System.out.print("The second symbol: ");
            letter_1 = SecondaryMethods.checkerForChar();
            System.out.print("The third symbol: ");
            letter_2 = SecondaryMethods.checkerForChar();
            System.out.print("The fourth symbol: ");
            letter_3 = SecondaryMethods.checkerForChar();
            System.out.println();
        }while(SecondaryMethods.repeatTheOperation());
        char[] range = {letter_0, letter_1, letter_2, letter_3};
        return range;
    }

    public int inputPortArrayLength(){
        boolean result = true;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("Print-in the length of the array!");
            System.out.println("WARNING: The admissible value: from 100 till 1000");
            System.out.println("----------------------------------------------------");
            System.out.println();
            while (result) {
                System.out.print("Print-in the value: ");
                value = SecondaryMethods.checkForInt();
                if(value >= 100 && value <= 1000){
                    result = false;
                    break;
                }else if (value < 100) {
                    System.out.println("Wrong input: negative value.");
                    System.out.println();
                } else {
                    System.out.println("Wrong input: ouf of tolerance range.");
                    System.out.println();
                }
            }
        }while(SecondaryMethods.repeatTheOperation());
        return value;
    }

    public static int arrayLength(){
        int length;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("Print-in the length of the array!");
            System.out.println("WARNING: The admissible value: from 100 till 1000");
            System.out.println("----------------------------------------------------");
            System.out.println();
            length = SecondaryMethods.checkForInt();
            System.out.println();
        }while(SecondaryMethods.repeatTheOperation());
        return length;
    }

    public void outputPort(int[][] array, char[] symbols) {
        ++operationCounter;
        System.out.println("====================================================");
        arrayDisplayIndex(array, 0);
        System.out.println("====================================================");
        arrayDisplayLetters(array, 1, symbols);
        System.out.println("====================================================");
        int[] result = LogicalUnit.theBiggestNumberArray(array, 1, symbols);
        System.out.println("The greatest value is: " + (char)result[0] + " - "  + result[1]);
        if (operationCounter == 1) {
            System.out.println(operationCounter + " performed calculation.");
        } else {
            System.out.println(operationCounter + " performed calculations.");
        }
        System.out.println();
    }

    private static void arrayDisplayIndex(int array[][], int slot) {
        for (int i = 0; i < array[slot].length; i++) {
            System.out.println("Symbol #" + (i + 1) + " - " + (char)array[slot][i]);
        }
    }

    private static void arrayDisplayLetters(int array[][], int slot, char[] charArray){
        for(int i = 0; i < array[slot].length; i++){
            System.out.println("The quantity of " + charArray[i] + " : " + array[slot][i]);
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