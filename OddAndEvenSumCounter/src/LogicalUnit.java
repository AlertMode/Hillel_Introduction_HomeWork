public class LogicalUnit {
    public static int[] randomAssigner(int rangeNumber) {
        int blindID;
        int[] array = new int[rangeNumber];
        for(int j = 0; j < array.length; j++) {
            do{
                blindID = randomGenerator(rangeNumber);
            }while(!arrayCopyDetector(blindID, array));
            array[j] = blindID;
        }
        return array;
    }

    private static int randomGenerator(int rangeNumber) {
        int newID = (int) (Math.random() * rangeNumber + 1);
        return newID;
    }

    private static boolean arrayCopyDetector(int number, int[] array) {
        boolean result = true;
        for(int j = 0; j < array.length; j++){
            if(array[j] == number){
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

    public static int theEventCounter(int[] array) {
        int theTotalSum = 0;
        int counter = 1;
        for(int j = 0; j < array.length; j++) {
            if( counter % 2 == 0){
                theTotalSum += array[j];
            }
            ++counter;
        }
        return theTotalSum;
    }

    public static int theOddCounter(int[] array) {
        int theTotalSum = 0;
        int counter = 1;
        for(int j = 0; j < array.length; j++) {
            if(counter % 2 != 0){
                theTotalSum += array[j];
            }
            ++counter;
        }
        return theTotalSum;
    }
}
