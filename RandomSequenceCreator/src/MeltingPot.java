public class MeltingPot {
    public static void main(String[] args) {
        UI display = new UI();
        UI.loginDisplay();
        display.landingPage();
        while(!display.exit()) {
            int[] range = display.inputPort();
            int[] result = LogicalUnit.randomAssigner(range);
            display.outputPort(result);
            display.landingPage();
        }
    }
}