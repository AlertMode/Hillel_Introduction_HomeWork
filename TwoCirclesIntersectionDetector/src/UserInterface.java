import java.util.Date;
import java.math.BigDecimal;

public class UserInterface {

    private static int option;
    private static int operationCounter;

    public void landingPage() {

        boolean run = true;

        while(run) {

            System.out.println("Drone Anti-Collision System         ver. 0.2");
            System.out.println("============================================");
            System.out.println();
            System.out.println("Choose one option:");
            System.out.println("--------------------------------------------");
            System.out.println("[1] Enter the data");
            System.out.println("[0] Exit");
            System.out.println();
            System.out.print("Choose one option: ");
            option = SecondaryMethods.checkForInt();
            System.out.println("--------------------------------------------");

            System.out.println();

            switch (option) {
                case 1:
                    System.out.println(">><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<");
                    return;
                case 0:
                    System.out.println("============================================");
                    System.out.println("Cancelling the program...");
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

    public static void loginDisplay() {
        Date today = new Date();
        String userName = System.getProperty("user.name");

        System.out.println("Date: " + today);
        System.out.println("User: " + userName);
        System.out.println("\n");
    }

    public Circle dataInputDroneA() {

        Circle droneA = new Circle();

        do {
            System.out.println("Print-in the 1st drone's coordinates and radius!");
            System.out.println();
            System.out.print("The 1st drone X coordinate: ");
            droneA.setCoordinateX();
            System.out.print("The 1st drone Y coordinate: ");
            droneA.setCoordinateY();
            System.out.print("The 1st drone radius: ");
            droneA.setRadius();
            System.out.println();
        } while(SecondaryMethods.repeatTheOperation());

        return droneA;
    }

    public Circle dataInputDroneB() {

        Circle droneB = new Circle();

        do {
            System.out.println("Print-in the 2nd drone's coordinates and radius!");
            System.out.println();
            System.out.print("The 2nd drone X coordinate: ");
            droneB.setCoordinateX();
            System.out.print("The 2nd drone Y coordinate: ");
            droneB.setCoordinateY();
            System.out.print("The 2nd drone radius: ");
            droneB.setRadius();
            System.out.println(">><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<");
            System.out.println();
        } while(SecondaryMethods.repeatTheOperation());

        return droneB;
    }

    public void finalDataDisplay(Circle objectA, Circle objectB, boolean result ) {
        System.out.println("--------------------------------------------");
        System.out.println();
        System.out.println("The 1st drone's coordinates");
        System.out.println("X-axis: " + objectA.getCoordinateX());
        System.out.println("Y-axis: " + objectA.getCoordinateY());
        System.out.println("Radius: " + objectA.getRadius());
        System.out.println();
        System.out.println("The 2nd drone's coordinates");
        System.out.println("X-axis: " + objectB.getCoordinateX());
        System.out.println("Y-axis: " + objectB.getCoordinateY());
        System.out.println("Radius: " + objectB.getRadius());
        System.out.println();
        System.out.println("--------------------------------------------");

        ++operationCounter;

        if(result) {
            System.out.println();
            System.out.println("WARNING!");
            System.out.println("The drones will run across each other.");
            System.out.println("Change the drones' patrolling coordinates!");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("The drones won't run across each other.");
            System.out.println();
        }

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
