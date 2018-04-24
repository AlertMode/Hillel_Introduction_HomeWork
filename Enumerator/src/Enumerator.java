public class Enumerator {
    public static int[] randomAssigner(int rangeNumber) {
        int shuttlesNumber = 100;
        int blindID = 0;
        int[] shuttlesID = new int[shuttlesNumber];
        for(int counter = 0; counter < shuttlesID.length; counter++) {
            do{
                do{
                    blindID = randomGenerator(rangeNumber);
                }while(!numberChecker(blindID));
            }while(!arrayCopyDetector(blindID, shuttlesID));
            shuttlesID[counter] = blindID;
        }
        return shuttlesID;
    }

    private static int randomGenerator(int rangeNumber) {
        int newID = (int) (Math.random() * rangeNumber + 1);
        return newID;
    }

    private static boolean numberChecker(int randomNumber) {
        while (randomNumber > 0){
        if (randomNumber %10 == 4 || randomNumber % 10 == 9){
            return false;
        }
        randomNumber /= 10;
    }
    return true;
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
