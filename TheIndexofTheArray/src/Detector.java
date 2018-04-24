public class Detector {

    public static int[] randomAssigner(int rangeNumber) {
        int blindID;
        int[] array = new int[rangeNumber];
        for(int counter = 0; counter < array.length; counter++) {
            do{
                blindID = randomGenerator(rangeNumber);
            }while(!arrayCopyDetector(blindID, array));
            array[counter] = blindID;
        }
        return array;
    }

    private static int randomGenerator(int rangeNumber) {
        int newID = (int) (Math.random() * rangeNumber + 1);
        return newID;
    }

    private static boolean arrayCopyDetector(int number, int[] array) {
        boolean result = true;
        for(int counter = 0; counter < array.length; counter++){
            if(array[counter] == number){
                result = false;
            }
        }
        return result;
    }

    public static int theArrayIndex(int[] array) {
        int storage = 0;
        int number = 0;
        for(int counter = 0; counter < array.length; counter++){
            if(array[counter] > storage){
                storage = array[counter];
                number = counter + 1;
            }
        }
        return number;
    }
}