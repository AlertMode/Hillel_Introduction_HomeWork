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
            System.out.println("The Teams' Average Age Counter");
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
        boolean run = true;
        System.out.println("----------------------------------------------------");
        System.out.println("Print-in the quantity of members for the both teams!");
        System.out.println("WARNING: The admissible value: from 25 till 40");
        System.out.println("----------------------------------------------------");
        System.out.println();

        while(run) {
            System.out.print("Input: ");
            theQuantity = SecondaryMethods.checkForInt();
            System.out.println();
            if (theQuantity >= 25 && theQuantity <= 40) {
                run = false;
                break;
            } else if (theQuantity < 0) {
                System.out.println("Wrong input: negative value.");
                System.out.println();
            } else {
                System.out.println("Wrong input: ouf of tolerance range.");
                System.out.println();
            }
        }
        return theQuantity;
    }

    public void outputPort(int teamA, int teamB,int[] arrayTA, int[] arrayTB) {
        ++operationCounter;
        System.out.println("====================================================");
        System.out.println("The first team players' list");
        arrayDisplay(arrayTA);
        System.out.println("\nThe second team players' list");
        arrayDisplay(arrayTB);
        System.out.println("====================================================");
        System.out.println("The first team's average age: " + teamA);
        System.out.println("The second team's average age: : " + teamB);
        System.out.println("====================================================");
        statusDisplay(teamA, teamB);
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
        int counter = 1;
        for(int j = 0; j < array.length; j++){
            System.out.println("Player #" + counter + " " + "Age: " + array[j]);
            ++counter;
        }
    }

    public static void statusDisplay(int numberA, int numberB) {
        if(numberA > numberB) {
            System.out.println("The first team players' average age has " + (numberA - numberB) + " more years.");
        } else if(numberA < numberB){
            System.out.println("The seconds team players' average age has " + (numberB - numberA) + " more years.");
        } else {
            System.out.println("Both teams have got the same arithmetic average of players' age!");;
        }
    }
}