import java.util.Scanner;
import java.math.BigDecimal;

public class SecondaryMethods {

    public static double checkForDouble() {

        boolean run = true;
        Scanner input = new Scanner(System.in);
        double number = 0.0;

        while(run) {
            if (input.hasNextDouble()){
                number = input.nextDouble();
                break;
            }
            System.out.println("\nWrong input! ");
            System.out.println("Reprint-in a decimal number, please!");
            input.nextLine();
            System.out.print("\nData entry-field: ");
        }
        return number;
    }

    public static BigDecimal checkForBigDecimal() {

        boolean run = true;
        Scanner input = new Scanner(System.in);
        BigDecimal number = new BigDecimal(0.0);

        while(run) {
            if (input.hasNextBigDecimal()){
                number = input.nextBigDecimal();
                break;
            }
            System.out.println("\nWrong input!");
            System.out.println("Reprint-in a decimal number, please!");
            input.nextLine();
            System.out.println("\nData entry-field: ");
        }
        return number;
    }

    public static int checkForInt (){

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (run) {

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            }
            System.out.println("\nWrong input!");
            System.out.println("Reprint-in an integer number!");
            scanner.nextLine();
            System.out.print("\nData entry-field: ");
        }
        return number;
    }

    public static String checkerForStringLine (){

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        String word = new String();

        while (run) {
            if (scanner.hasNextLine()) {
                word = scanner.nextLine();
                break;
            }
            System.out.println("\nWrong data input!");
            System.out.println("Repeat the operation!");
            scanner.nextLine();
            System.out.print("\nData entry-field: ");
        }
        return word;
    }

    public static String checkerForString (){

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        String word = new String();

        while (run) {
            if (scanner.hasNext()) {
                word = scanner.next();
                break;
            }
            System.out.println("\nWrong data input!");
            System.out.println("Repeat the operation!");
            scanner.nextLine();
            System.out.print("\nData entry-field: ");
        }
        return word;
    }

    public static boolean repeatTheOperation() {
        boolean run = true;
        boolean result = true;

        while (run) {
            Scanner scanner = new Scanner(System.in);
            int option = 0;

            System.out.println("Do you want to repeat the operation?");
            System.out.println("0. No; 1. Yes;");
            System.out.print("Print-in the option: ");

            option = checkForInt();

            System.out.println();

            if (option == 0) {
                result = false;
                run = false;
                break;
            } else if(option == 1) {
                result = true;
                run = false;
                break;
            } else {
                System.out.println("Wrong data input!");
                System.out.println("Repeat the operation!");
                System.out.println();
                System.out.println("Press \'ENTER\' to continue!");
                run = true;
            }
            scanner.nextLine();
        }
        return result;
    }

    public static void pause() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press \"Enter\" to continue");
        scanner.nextLine();
    }
}