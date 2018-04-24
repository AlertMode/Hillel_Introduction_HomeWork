import java.util.Random;

public class LogicalUnit {

    public static int[][] arrayPacker(char[] characterArray, int length) {
        Random generator = new Random();
        int[] array = new int[length];
        int[] counter = new int[characterArray.length];
        int number;
        for(int j = 0; j < array.length; j++){
            number = generator.nextInt(characterArray.length);
            switch(number){
                case 0:
                    array[j] = (int)characterArray[0];
                    ++counter[0];
                    break;
                case 1:
                    array[j] = (int)characterArray[1];
                    ++counter[1];
                    break;
                case 2:
                    array[j] = (int)characterArray[2];
                    ++counter[2];
                    break;
                case 3:
                    array[j] = (int)characterArray[3];
                    ++counter[3];
                    break;
            }
        }
        int[][] theContainer = {array, counter};
        return theContainer;
    }

    public static int[] theBiggestNumberArray(int[][] array, int slot, char[] charArray) {
        int slots = 2;
        int tempVar = array[slot][0];
        int letter = 0;
        int quantity = 0;
        for(int j = 0; j < array[slot].length; j++){
            if(tempVar < array[slot][j]){
                tempVar = array[slot][j];
            }
        }
        for(int i = 0; i < array[slot].length; i++){
            if(tempVar == array[slot][i]){
                letter = charArray[i];
                quantity = array[slot][i];

            }
        }
        int [] theContainer = {letter, quantity};
        return theContainer;
    }
}