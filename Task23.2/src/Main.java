import java.util.function.Consumer;

public class Main {
    public static void main(String args[])
    {
        //Generics olan T(istediyimiz type) tipinde  bir parametr alir, geriye deyer qaytarmir.
        Consumer<String > display1=msg1 -> System.out.println(msg1);
        Consumer<Integer > display2=msg2 -> System.out.println(msg2);
        display1.accept("Hello World!");
        display2.accept(123457);
    }
}