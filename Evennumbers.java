public class Evennumbers{

    public static void main (String [] args){
        int[] dog = {1,2,3,4,5,6,7,8,9,10};
        
        for (int i = 0; i < dog.length; i++){

            if ( dog[i] % 2 == 1){
                System.out.println(dog[i]);
            }
            
        }
    }
}