public class MeltingPot {

    public static void main(String[] args) {
        UserInterface display = new UserInterface();

        UserInterface.loginDisplay();
        display.landingPage();
        while(!display.exit()) {
            String name = display.inputPort();
            long number = UnicodeDecoder.decoderUnitMod(name);
            display.outputPort(number);
            display.landingPage();
        }
    }
}
