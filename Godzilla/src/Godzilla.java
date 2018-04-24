public class Godzilla {
    private int stomachVolume;
    private int theVolume;

   public Godzilla(int stomachVolume){
       this.stomachVolume = stomachVolume;
   }

   public boolean consumption(int nutrition){
       theVolume += nutrition;
       if(theVolume > stomachVolume){
           int odd = theVolume - stomachVolume;
           System.out.println("Godzilla's stomach is overloaded: " + theVolume + "The odd food: " + odd + "\n");
           return false;
       }else if(theVolume == stomachVolume){
           System.out.println("Godzilla's stomach is fool: " + stomachVolume + "/" + theVolume + "\n");
           return false;
       }else{
           System.out.println("Godzilla has eaten some food: " + nutrition);
           System.out.println("Godzilla's stomach still has got some place: " + stomachVolume + "/" + theVolume);
           System.out.println("Godzilla wants more!\n");
           return true;
       }
   }

    public static int value(){
        boolean result = true;
        int value = 0;
        while(result){
            System.out.print("Print-in Godzilla's stomach volume: ");
            value = SecondaryMethods.checkForInt();
            if(value >= 100 && value <= 1000){
                result = false;
            }else{
                System.out.println("The value if out of the tolerance range!");
                System.out.println("Repeat the operation, please!\n");
            }
        }
        return value;
    }
}