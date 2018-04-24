import java.util.Scanner;

public class MeltingPot {
    public static void main(String[] args){
        boolean lock = true;
        do{
            int value = Godzilla.value();
            Godzilla monster = new Godzilla(value);
            while(lock){
                lock = monster.consumption(food());
            }
        }while(SecondaryMethods.repeatTheOperation());
    }

    private static int food(){
        boolean result = true;
        int value = 0;
        while(result){
            System.out.print("Print-in the food's volume to feed Godzilla: ");
            value = SecondaryMethods.checkForInt();
            if(value >= 1){
                result = false;
            } else{
                System.out.println("The value is in the subtolerance point.");
                System.out.println("Repeat the operation, please!\n");
            }
        }
        return value;
    }
}
