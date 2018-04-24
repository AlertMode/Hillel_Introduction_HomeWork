import java.util.Scanner;
import java.math.BigDecimal;

public class SecondaryMethods {

    public static double checkForDouble() {

        boolean run = true;
        Scanner input = new Scanner(System.in);
        double number = 0.0;

        while(run = true) {
            if (input.hasNextDouble()){
                number = input.nextDouble();
                break;
            }
            System.out.println("Wrong input! Reprint-in decimal number, please!");
            input.nextLine();
        }
        return number;
    }

    public static BigDecimal checkForBigDecimal() {

        boolean run = true;
        Scanner input = new Scanner(System.in);
        BigDecimal number = new BigDecimal(0.0);

        while(run = true) {
            if (input.hasNextBigDecimal()){
                number = input.nextBigDecimal();
                break;
            }
            System.out.println("Wrong input! Reprint-in decimal number, please!");
            input.nextLine();
        }
        return number;
    }

    public static int checkerForInt (){

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int number = 0;



        while (run = true) {

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            }
            System.out.println("Wrong input! Reprint-in integer number, please!");
            scanner.nextLine();
        }
        return number;
    }

    public static String checkerForString (){

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        String word = new String();

        while (run = true) {
            if (scanner.hasNext()) {
                word = scanner.next();
                break;
            }
            System.out.println("Wrong data input!");
            System.out.println("Repeat the operation!\n");
            scanner.nextLine();
        }
        return word;
    }

    public static boolean repeatTheOperation() {
        boolean run = true;
        boolean result = true;

        while (run) {
            Scanner scanner = new Scanner(System.in);
            int option = 0;

            System.out.println("\nDo you want to repeat the operation?");
            System.out.println("0. No; 1. Yes;");
            System.out.print("Print-in the option: ");

            option = checkerForInt();

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
                run = true;
            }
            scanner.nextLine();
        }
        return result;
    }

    public static void pause() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nPress \"Enter\" to continue");
        scanner.nextLine();
    }
}