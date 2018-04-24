public class MeltingPot {
    public static void main(String[] args) {
        UI display = new UI();
        UI.loginDisplay();
        display.landingPage();
        while(!display.exit()) {
            char[] symbols = display.inputPortLetters();
            int arrayLength = display.inputPortArrayLength();
            int[][] theContainer = LogicalUnit.arrayPacker(symbols, arrayLength);
            display.outputPort(theContainer, symbols);
            display.landingPage();
        }
    }
}