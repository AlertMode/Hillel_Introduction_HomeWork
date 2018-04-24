public class MeltingPot {
    public static void main(String[] args) {
        UI display = new UI();

        UI.loginDisplay();
        display.landingPage();
        while(!display.exit()) {
            int suspectsQuantity = display.inputPort();
            int[] suspects = Detector.randomAssigner(suspectsQuantity);
            int theSuspect = Detector.theArrayIndex(suspects);
            display.outputPort(theSuspect);
            display.landingPage();
        }
    }
}