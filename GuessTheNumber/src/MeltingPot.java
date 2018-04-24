public class MeltingPot {
    public static void main(String[] args) {
        UI display = new UI();

        UI.loginDisplay();
        display.landingPage();
        while(!display.exit()) {
            int[] data = display.inputPortTheValueRange();
            int theNumber = GuessAccepter.randomGenerator(data);
            boolean result;
            do{
                int aNumber = display.inputPortTheGuess();
                String answer = GuessAccepter.numberChecker(aNumber, theNumber);
                result = display.outputPort(answer);
            }while(!result);
            display.landingPage();
        }
    }
}