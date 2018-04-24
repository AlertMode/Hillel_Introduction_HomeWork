public class MeltingPot {
    public static void main(String[] args) {
        UI display = new UI();
        UI.loginDisplay();
        display.landingPage();
        while(!display.exit()) {
            int playersQuantity = display.inputPort();
            int[] teamA = LogicalUnit.randomAssigner(playersQuantity);
            int[] teamB = LogicalUnit.randomAssigner(playersQuantity);
            int averageTeamA = LogicalUnit.arithmeticalAverage(teamA);
            int averageTeamB = LogicalUnit.arithmeticalAverage(teamB);
            display.outputPort(averageTeamA, averageTeamB, teamA, teamB);
            display.landingPage();
        }
    }
}