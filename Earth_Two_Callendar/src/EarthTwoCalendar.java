import java.util.Date;
import java.util.Scanner;

public class EarthTwoCalendar {

    private final static int daysInOneYear = 420;
    private final static int weeksInOneYear = 60;
    private final static int monthsInOneYear = 10;
    private final static int daysInOneMonth = 42;
    private final static int weeksInOneMonth = 6;
    private final static int daysInOneWeek = 7;

    private static int option;
    private static int actionCounter;

    private int dateOne_Days;
    private int dateOne_Months;
    private int dateOne_Years;
    private int dateTwo_Days;
    private int dateTwo_Months;
    private int dateTwo_Years;

    private int totalDays;
    private int totalWeeks;
    private int totalMonths;

    private int finalDate_Days;
    private int finalDate_Months;
    private int finalDate_Years;

    public static void main(String[] args) {

        dataDisplay();

        EarthTwoCalendar theExecuteObject = new EarthTwoCalendar();

        theExecuteObject.landingPage();


    }

    private static void dataDisplay() {

        Date today = new Date();
        String userName = new String(System.getProperty("user.name"));

        System.out.println("Date: " + today);
        System.out.println("User: " + userName);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\n");

    }

    private void landingPage() {

        boolean run = true;

        while(run){

            System.out.println("Earth-2 Date Calculator       ver. 0.2b");
            System.out.println("[=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=]");
            System.out.println();

            System.out.println("Day's counter for Earth-2 Calendar type.");
            System.out.println("This program was created in the first day of Earth-2 colonisation.");
            System.out.println("From there, the date of planting Earth-2 is 01.01.01.");
            System.out.println("Logic does its best, doesn't it?");
            System.out.println();
            System.out.println("---------------------------------------------------------------------");
            System.out.println("WARNING!");
            System.out.println("Earth-2 Calendar type has the next specifications:");
            System.out.println("1 year = 10 months = 60 weeks = 420 days;");
            System.out.println("1 month = 6 weeks = 42 days");
            System.out.println("1 week = 7 days");
            System.out.println("The entered dates should correspond with the calendar specifications!");
            System.out.println("---------------------------------------------------------------------");
            System.out.println();
            System.out.println("[1] Enter the dates");
            System.out.println("[0] Exit");
            System.out.println();
            System.out.println("---------------------------------------------------------------------");

            if (actionCounter == 1) {
                System.out.println(actionCounter + " performed calculation of the date.");
            } else {
                System.out.println(actionCounter + " performed calculations of the date.");
            }

            System.out.println("---------------------------------------------------------------------");
            System.out.println();
            System.out.print("Choose the currency converter's option: ");
            option = SecondaryMethods.checkerForInt();
            System.out.println("[=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=]");
            System.out.println("\n");

            switch (option) {
                case 1: datesCollector();
                    break;
                case 0:
                    System.out.println(">>> Cancelling the program...");
                    System.out.println("\n");
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

    private void datesCollector () {

        do {

            System.out.println("---------------------------------------------------------------------");
            System.out.println("Enter two dates to calculate their difference in days.");
            System.out.println("\nPrint-in the first date!");

            dateOne_Days = checkerForDays(dateOne_Days);

            dateOne_Months = checkerForMonths(dateOne_Months);

            System.out.print("Year: ");
            dateOne_Years = SecondaryMethods.checkerForInt();

            System.out.println("---------------------------------------------------------------------");

            System.out.println("\nPrint-in the second date!");

            dateTwo_Days = checkerForDays(dateTwo_Days);

            dateTwo_Months = checkerForMonths(dateTwo_Months);

            System.out.print("Year: ");
            dateTwo_Years = SecondaryMethods.checkerForInt();

            System.out.print("\n");

            resultDisplay();

        }while(SecondaryMethods.repeatTheOperation());

    }


    private int checkerForDays (int days){

        boolean run = true;

        Scanner scanner = new Scanner(System.in);

        while (run = true) {

            System.out.print("Day: ");
            days = SecondaryMethods.checkerForInt();
            System.out.println();

            if ((days >= 1) & (days <= 42)) {
                break;
            }
            System.out.println("Wrong input!");
            System.out.println("According to Earth-2 calendar, there is only 42 days in a month.");
            System.out.println("Enter the appropriate value, please!");
            System.out.println("Press \"Enter\" to continue!");
            scanner.nextLine();
        }
        return days;
    }

    private int checkerForMonths (int months){

        boolean run = true;

        Scanner scanner = new Scanner(System.in);

        while (run = true) {

            System.out.print("Month: ");
            months = SecondaryMethods.checkerForInt();
            System.out.println();

            if ((months >= 1) & (months <= 10)) {
                break;
            }
            System.out.println("Wrong input!");
            System.out.println("According to Earth-2 calendar, there is only 10 month in a year.");
            System.out.println("Enter the appropriate value, please!");
            System.out.println("Press \"Enter\" to continue!");
            scanner.nextLine();
        }
        return months;
    }


    private void dateCounter() {

        int theFirstSum = dateOne_Years * daysInOneYear + dateOne_Months * daysInOneMonth + dateOne_Days;
        int theSecondSum = dateTwo_Years * daysInOneYear + dateTwo_Months * daysInOneMonth + dateTwo_Days;

        totalDays = theFirstSum - theSecondSum;
        totalDays = Math.abs(totalDays);

        totalWeeks = totalDays / daysInOneWeek;
        totalMonths = totalWeeks / weeksInOneMonth;

        finalDate_Years = totalDays / daysInOneYear;
        finalDate_Months = (totalDays - finalDate_Years * daysInOneYear) / daysInOneMonth;
        finalDate_Days = totalDays - finalDate_Years * daysInOneYear - finalDate_Months * daysInOneMonth;

    }

    private void resultDisplay() {

        dateCounter();

        boolean run = true;

        while(run) {   System.out.println("RESULTS");
            System.out.println("[=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=][=]");
            System.out.println();
            System.out.println("The first entered date: " + dateOne_Days + "." + dateOne_Months + "." + dateOne_Years);
            System.out.println("The second entered date: " + dateTwo_Days + "." + dateTwo_Months + "." + dateTwo_Years);
            System.out.println("---------------------------------------------------------------------");
            System.out.println();
            System.out.println("THE DIFFERENCE");
            System.out.println();

            if(totalDays == 1) {
                System.out.println(totalDays + " day has passed.");
            } else {
                System.out.println(totalDays + " days have passed.");
            }

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            if(totalWeeks == 1) {
                System.out.println(totalWeeks + " week has passed.");
            } else {
                System.out.println(totalWeeks + " weeks have passed.");
            }

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            if(totalMonths == 1) {
                System.out.println(totalMonths + " month has passed.");
            } else {
                System.out.println(totalMonths + " months have been passed.");
            }

            System.out.println("---------------------------------------------------------------------");
            System.out.println();
            System.out.println("SORTED INFO: ");
            System.out.println();

            if(finalDate_Days == 1) {
                System.out.println("Day: " + finalDate_Days);
            } else {
                System.out.println("Days: " + finalDate_Days);
            }

            if(finalDate_Months == 1) {
                System.out.println("Month: " + finalDate_Months);
            } else {
                System.out.println("Months: " + finalDate_Months);
            }

            if(finalDate_Years == 1) {
                System.out.println("Year: " + finalDate_Years);
            } else {
                System.out.println("Years: " + finalDate_Years);
            }

            ++actionCounter;

            System.out.println("---------------------------------------------------------------------");
            System.out.println();
            System.out.print("Print-in '0' to return to the main menu: ");

            option = SecondaryMethods.checkerForInt();

            switch(option) {
                case 0:
                    System.out.println("\nReturninng to the main menu...");
                    System.out.println("\n");
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
}