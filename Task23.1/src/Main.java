import java.util.function.Predicate;
public class Main{
    public static void main(String[] args) {
        Predicate<Integer> number = x -> (x > 9*8); //predicate yaradiriq
        System.out.println(number.test(27));    // predicate cagirib sertde yoxlayiriq
    }
}  