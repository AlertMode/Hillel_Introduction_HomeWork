public class MeltingPot {

    public static void main(String[] args) {

        UserInterface display = new UserInterface();
        Circle droneA;
        Circle droneB;

        UserInterface.loginDisplay();

        display.landingPage();
        while(!display.exit()) {
            droneA = display.dataInputDroneA();
            droneB = display.dataInputDroneB();
            boolean result = TrajectoryComputer.intersectionOfTwoCircles(droneA, droneB);
            display.finalDataDisplay(droneA, droneB, result);
            display.landingPage();
        }
    }
}