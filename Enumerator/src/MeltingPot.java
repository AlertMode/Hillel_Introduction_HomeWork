public class MeltingPot {
    public static void main(String[] args) {
        UI display = new UI();

        UI.loginDisplay();
        display.landingPage();
        while(!display.exit()) {
            int diapason = display.inputPortShuttlesQuantity();
            int[] shuttlesID = Enumerator.randomAssigner(diapason);
            display.outputPort(shuttlesID);
            display.landingPage();
        }
    }
}