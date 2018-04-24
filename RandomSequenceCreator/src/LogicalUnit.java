public class LogicalUnit {
    public static int[] randomAssigner(int[] array) {
        int minimum = array[0];
        int maximum = array[1];
        int numer;
        int[] randomSequence = new int[maximum-minimum];
        for(int counter = 0; counter < randomSequence.length; counter++) {
            do{
                    numer = randomGenerator(minimum, maximum);
            }while(!arrayCopyDetector(numer, randomSequence));
            randomSequence[counter] = numer;
        }
        return randomSequence;
    }

    private static int randomGenerator(int minimum, int maximum) {
        int newID = (int) (Math.random() * (maximum - minimum + 1)) + minimum;
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
}