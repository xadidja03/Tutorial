import java.util.function.Supplier;

public class Main {
    public static void main(String args[])
    {
        Supplier<Integer> value1 = () -> Math.max(12,23);
        Supplier<Double> value2 = () -> Math.min(1.1,11.5);
        System.out.println(value1.get());
        System.out.println(value2.get());
    }
}
