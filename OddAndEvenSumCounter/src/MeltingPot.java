public class MeltingPot {
    public static void main(String[] args) {
        UI display = new UI();

        UI.loginDisplay();
        display.landingPage();
        while(!display.exit()) {
            int playersQuantity = display.inputPort();
            int[] teamStats = LogicalUnit.randomAssigner(playersQuantity);
            int theEvenScore = LogicalUnit.theEventCounter(teamStats);
            int theOddScore = LogicalUnit.theOddCounter(teamStats);
            display.outputPort(theEvenScore, theOddScore, teamStats);
            display.landingPage();
        }
    }
}