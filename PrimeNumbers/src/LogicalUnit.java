public class LogicalUnit {
    public static void assigner(int[] array) {
        int minimum = array[0];
        int maximum = array[1];
        int number = 0;
        for (int j = minimum; j < maximum; j++) {
            if (primeNumbers(j)) {
                number = j;
                System.out.println(number);
            }
        }
    }

    public static boolean primeNumbers(int number){
        for(int j = 2; j < number; ++j){
            if(number % j == 0){
                return false;
            }
        }
        return true;
    }
}