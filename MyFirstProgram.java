public class MyFirstProgram {
    
    public static void main(String[] args) {

        String h = "hello";
        String w = "world";
        System.out.println(h + " " + w);

        Numbers n1 = new Numbers();
        Numbers n2 = new Numbers();
        n2.number1 = 7;
        System.out.println( n1.getNumbers() );

        Numbers.sayHi();

    }

}


class Numbers {

    int number1 = 1;
    int number2 = 2;

    int getNumbers() {
        return number1 + number2;
    }

    static void sayHi() {
        System.out.println("Hi!");
    }
}