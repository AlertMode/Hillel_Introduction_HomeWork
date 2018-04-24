public class MeltingPot {
    public static void main(String[] args) {
        UI display = new UI();

        UI.loginDisplay();
        display.landingPage();
        while(!display.exit()) {
            long code = display.inputPortSerialNumber();
            byte result = Analyser.numberSeparator(code);
            display.outputPort(result);
            display.landingPage();
        }
    }
}