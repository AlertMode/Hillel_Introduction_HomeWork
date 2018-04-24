public class Analyser {
//    public static byte numberSeparator(long numberA) {
//        int codeStdLength = 12;
//        int[] digitStorage = new int[codeStdLength];
//        String numberB = Long.toString(numberA);
//        String[] numberC = numberB.split("");
//        for(int counter = 0; counter < digitStorage.length; counter++) {
//            digitStorage[counter] = Integer.parseInt(numberC[counter]);
//        }
//        return valueDetector(digitStorage);
//    }

    private static byte valueDetector(int[] array) {
        byte storage = 0;
        for(int counter = 0; counter < array.length; counter++){
            if(array[counter] > storage){
                storage = (byte) array[counter];
            }
        }
        return storage;
    }

    public static byte numberSeparator(long numberA) {
        long container;
        int[] digitStorage = new int[digitCounter(numberA)];
        for(int counter = 0; counter < digitStorage.length; counter++) {
            container = numberA % 10;
            numberA /= 10;
            digitStorage[counter] = (int) container;
        }
        return valueDetector(digitStorage);
    }

    private static int digitCounter(long aNumber) {
        int result = 1;
        while((aNumber /= 10) != 0) {
            ++result;
        }
        return result;
    }
}