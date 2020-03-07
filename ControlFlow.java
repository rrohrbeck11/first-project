public class ControlFlow {

    public static void main(String[] args){

        // If-Else Statements
        System.out.print("Hello, my name is ");
        
/*
This comment is
multilined
*/

        int x = 1;
// == means if true run the part of code 
        if( x == 1) {
            System.out.println("Magic Mike");
        }
        else if( x > 400){
            System.out.println("Louis");
        }
        else if( x < 20 ){
            System.out.println("Jannet");
        }
        else if( x != 50 || x != 40 ) {
            System.out.println("John");
        // ! means not; if x is not equal to 50 
        // || means or 
        }
        else if( (x > 0) && (x == 32) ){
            System.out.println("Celest");
        // the () runs inside it first 
        // && means coniditions on both sides must be true 
        }
        else {
            System.out.println("UNKNOWN");
        }

        if( x % 2 == 0){
            System.out.println("YEET");
        }

        /* Loops */
        int[] stingRay = {1, 2, 3, 4, 5};
        String[] array2 = { "Sentance1",
                            "Sentance2",
                            "Sentance3",
                            "Sentance4",
                            "Sentance5"};

        /*  Special short cut:
            It's really common to want to add or subtract a number by 1.
            For this reason, many programming languages provide a short cut.
            You can write x++; instead of writing x = x+1; or
            x--; instead of writing x = x-1;
            This is super useful inside of loops
        */

        // For Loop - does something for each loop
        for(int i=0; i < stingRay.length; i++){
            System.out.print(stingRay[i] + " ");
            System.out.println(array2[i]);
        }
    }

}