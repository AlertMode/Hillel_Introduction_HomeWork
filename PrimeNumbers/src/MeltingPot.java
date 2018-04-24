public class MeltingPot {
    public static void main(String[] args) {
        UI display = new UI();
        UI.loginDisplay();
        display.landingPage();
        int minimum = 2;
        int maximum = 1000;
        while(!display.exit()) {
            int[] range = {minimum, maximum};
            display.outputPort(range);
            display.landingPage();
        }
    }
}