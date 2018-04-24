public class KitchenClass {

    public static void main(String[] args) {

        Interface uiObject = new Interface();
        Detector outputObject = new Detector();

        Interface.dataDisplay();
        uiObject.landingPage();

        while (!uiObject.exit()) {
            uiObject.setNumber();
            if (outputObject.notZero(uiObject.getNumber())) {
                boolean result = outputObject.evenChecker(uiObject.getNumber());
                uiObject.resultOutput(uiObject.getNumber(), result);
            } else {
                uiObject.errorMessage();
            }
            uiObject.landingPage();
        }
    }
}
