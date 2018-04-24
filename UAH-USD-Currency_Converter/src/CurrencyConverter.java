import java.math.BigDecimal;
import java.util.Date;

public class CurrencyConverter {

    private BigDecimal unitedStatesDollar;
    private BigDecimal ukranianHrivnya;
    private BigDecimal sellingDollarsIndex = new BigDecimal("26.270");
    private BigDecimal buyingDollarsIndex = new BigDecimal("25.950");
    private int option;
    private static int actionCounter;

    public static void main(String [] args) {

        dataDisplay();
        CurrencyConverter theExecuteObject = new CurrencyConverter();

        theExecuteObject.landingPage();

    }

     private static void dataDisplay() {

        Date today = new Date();
        String userName = System.getProperty("user.name");

         System.out.println("Date: " + today);
         System.out.println("User: " + userName);
         System.out.println();

     }

     private void landingPage() {

        boolean run = true;

        while(run) {
            System.out.println("CURRENCY CONVERTER                ver. 0.2c");
            System.out.println("===========================================");
            System.out.println();
            System.out.println("Selling Rate: 1 USD || " + sellingDollarsIndex + " UAH");
            System.out.println("Buying Rate: 1 USD || " + buyingDollarsIndex + " UAH");
            System.out.println();
            System.out.println("[1] USD to UAH");
            System.out.println("[2] UAH to USD");
            System.out.println("[3] Currency Rate Settings");
            System.out.println("[0] Exit");
            System.out.println("-------------------------------------------");

            if (actionCounter == 1 ) {
                System.out.println(actionCounter + " performed translation of currency.");
            } else {
                System.out.println(actionCounter + "performed translations of currency.");
            }

            System.out.println("-------------------------------------------");

            System.out.println();
            System.out.print("Choose the currency converter's option: ");
            option = SecondaryMethods.checkerForInt();
            System.out.println("===========================================");
            System.out.println("\n");

            switch(option) {
                case 1: sellingDollars();
                    break;
                case 2: buyingDollars();
                    break;
                case 3: currencyRateSettings();
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

     private void sellingDollars() {

        do{

            ++actionCounter;

            System.out.print("Print-in amount of USD: ");
            unitedStatesDollar = SecondaryMethods.checkForBigDecimal();

            ukranianHrivnya = unitedStatesDollar.multiply(sellingDollarsIndex);
            ukranianHrivnya = ukranianHrivnya.setScale(2, BigDecimal.ROUND_HALF_UP);

            System.out.println("Amount of the bought currency: " + ukranianHrivnya + " ₴");
            System.out.println();

        }while(SecondaryMethods.repeatTheOperation());

     }

     private void buyingDollars() {

        do {

            ++actionCounter;

            System.out.print("Print-in amount of UAH: ");

            ukranianHrivnya = SecondaryMethods.checkForBigDecimal();
            unitedStatesDollar = ukranianHrivnya.divide(buyingDollarsIndex, 2, BigDecimal.ROUND_HALF_UP);;

            System.out.println("Amount of the bought currency: " + unitedStatesDollar + " $");
            System.out.println();

        }while(SecondaryMethods.repeatTheOperation());

     }

     private void currencyRateSettings() {

        boolean run = true;

        while(run) {

            System.out.println("----------Currency Rate Settings-----------");
            System.out.println(">><<>><<>><<>><<>>><<>>><<<>><<>><<>><<>><<");
            System.out.println("[1] Set up Currency Rate");
            System.out.println("[2] Default settings");
            System.out.println("[0] Exit");

            System.out.println("-------------------------------------------");
            System.out.print("Choose the option to proceed: ");

            option = SecondaryMethods.checkerForInt();

            System.out.println(">><<>><<>><<>><<>>><<>>><<<>><<>><<>><<>><<");
            System.out.println("\n");

            switch(option) {
                case 1: setCurrencyRate();
                    break;
                case 2: defaultCurrencyRateSetting();
                    break;
                case 0:
                    System.out.println(">>> Returning to the main menu...");
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

    private void defaultCurrencyRateSetting() {

        boolean run = true;

        while(run){

            System.out.println("-----------Default Settings Activator-----------");
            System.out.println("|//||//||//||//||//||//||//||//||//||//||//||//|");
            System.out.println("Current settings: ");
            System.out.println("1 USD selling rate: " + sellingDollarsIndex + " ₴");
            System.out.println("1 USD buying rate:  " + buyingDollarsIndex + " ₴");
            System.out.println();
            System.out.println("------------------------------------------------");
            System.out.println("The Default settings: ");
            System.out.println("1 USD selling rate: 26.270 ₴");
            System.out.println("1 USD buying rate: 25.950 ₴");
            System.out.println();
            System.out.println("------------------------------------------------");
            System.out.println("[1] Use the default Currency Rate settings");
            System.out.println("[0] Exit");
            System.out.println();
            System.out.print("Choose the option to proceed: ");

            option = SecondaryMethods.checkerForInt();

            System.out.println("|//||//||//||//||//||//||//||//||//||//||//||//|");
            System.out.println("\n");

            switch(option) {
                case 1:
                    sellingDollarsIndex = new BigDecimal("26.270");
                    buyingDollarsIndex = new BigDecimal("25.950");

                    sellingDollarsIndex = sellingDollarsIndex.setScale(3, BigDecimal.ROUND_DOWN);
                    buyingDollarsIndex = buyingDollarsIndex.setScale(3, BigDecimal.ROUND_DOWN);

                    System.out.println();
                    System.out.println("ATTENTION! The default settings have been applied!");
                    System.out.println();
                    break;
                case 0:
                    System.out.println();
                    System.out.println(">>> Returning to Currency Rate Settings...");
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

     private void setCurrencyRate() {

        do{

            System.out.println("--------------Currency Rate----------------");
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

            System.out.print("Print-in USD selling rate in UAH: ");
            sellingDollarsIndex = SecondaryMethods.checkForBigDecimal();
            System.out.println();

            System.out.print("Print-in USD buying rate in UAH: ");
            buyingDollarsIndex = SecondaryMethods.checkForBigDecimal();
            System.out.println();

            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
            System.out.println("\n");

        }while(SecondaryMethods.repeatTheOperation());
     }
}