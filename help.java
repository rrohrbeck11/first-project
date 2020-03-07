public class help {

    public static void main (String[] args){

        String k = "hello";
        String r = "world";
      
        System.out.println(createSentence(k , r));
    }

    static String createSentence (String k , String r) {
        return k + " " + r;
    }

}