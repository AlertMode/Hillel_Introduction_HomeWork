import java.util.Date;

public class UI {
    private static int option;
    private static int operationCounter;
    private static long workingDay;
    private static long money;

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
            System.out.println("Salary Calculator");
            System.out.println("====================================================");
            System.out.println("[1] Enter the working days");
            System.out.println("[2] Enter the wage");
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
                case 2:
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

    public long inputPortDays() {

        do{
            System.out.println("----------------------------------------------------");
            System.out.println("Print-in the working days' quantity!");
            System.out.println("----------------------------------------------------");
            System.out.println();
            System.out.print("Input: ");
            workingDay = SecondaryMethods.checkForLong();
            System.out.println();
            if (workingDay > 0) {
                break;
            }
            System.out.println("Wrong input: negative value.");
            System.out.println("Enter the positive value, please!");
            SecondaryMethods.pause();
        }while(SecondaryMethods.repeatTheOperation());
        return workingDay;
    }

    public long inputPortMoney() {

        do{
            System.out.println("----------------------------------------------------");
            System.out.println("Print-in the final sum of money!");
            System.out.println("----------------------------------------------------");
            System.out.println();
            System.out.print("Input: ");
            money = SecondaryMethods.checkForLong();
            System.out.println();
            if (money > 0) {
                break;
            }
            System.out.println("Wrong input: negative value.");
            System.out.println("Enter the positive value, please!");
            SecondaryMethods.pause();
        }while(SecondaryMethods.repeatTheOperation());
        return money;
    }

    public void outputPortMoney(long salary) {
        ++operationCounter;
        System.out.println("====================================================");
        System.out.println("The working days' quantity: " + workingDay);
        System.out.println("The salary: " + salary);
        System.out.println("====================================================");
        if (operationCounter == 1) {
            System.out.println(operationCounter + " performed calculation.");
        } else {
            System.out.println(operationCounter + " performed calculations.");
        }
        System.out.println();
        SecondaryMethods.pause();
    }

    public void outputPortDays(long days) {
        ++operationCounter;
        System.out.println("====================================================");
        System.out.println("The salary: " + money);
        System.out.println("The working days' quantity: " + days);
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
