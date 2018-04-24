public class LogicalUnit {
    public static int[] randomAssigner(int rangeNumber) {
        int blindID;
        int[] array = new int[rangeNumber];
        for(int j = 0; j < array.length; j++) {
                blindID = randomGenerator();
            array[j] = blindID;
        }
        return array;
    }

    private static int randomGenerator() {
        int minimum = 20;
        int maximum = 40;
        int newID = (int) (Math.random() * (maximum - minimum) + 1) + minimum;
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

    public static int arithmeticalAverage(int[] array){
        int counter;
        int theTotalSum = 0;
        for(counter = 0; counter < array.length; counter++){
            theTotalSum += array[counter];
        }
        return theTotalSum / counter;
    }
}