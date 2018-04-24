public class UnicodeDecoder {

    public static long decoderUnitMod(String word) {

        long number = 0;

        System.out.println("Character || Code: ");
        System.out.println("----------------------------------------------------");
        for(int counter = 0; counter < word.length(); counter++) {
            char character = word.charAt(counter);
            number += (int) character;
            System.out.println(character + "||" + (int) character);
        }
        System.out.println();
        return number;
    }

}
