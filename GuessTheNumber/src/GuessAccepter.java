public class GuessAccepter {
    public static String numberChecker(int aNumber, int theNumber){
        System.out.println(theNumber);
        if(aNumber < theNumber){
            return "The number is greater than your guess!";
        } else if(aNumber > theNumber){
            return "The number is smaller than your guess!";
        } else {
            return "You've nailed it!";
        }
    }

    public static int randomGenerator(int[] rangeNumbers) {
        int newID = (int) (Math.random() * (rangeNumbers[1] - rangeNumbers[0]) + rangeNumbers[0]);
        return newID;
    }
}
