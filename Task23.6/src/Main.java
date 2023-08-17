import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.print("Maximum : ");
        Integer integer = list.stream().max(Integer::compare).get();
        System.out.print(integer);
        System.out.println("\n----------------------------------------");
        System.out.print("Minimum : ");
        Integer integer1 = list.stream().min(Integer::compare).get();
        System.out.print(integer1);
        System.out.println("\n-----------------------------------------");
        List<Integer> squareNum = list.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println("The square of numbers are:" + squareNum);
        System.out.println("---------------------------------------------");
        int sumNumbers = list.stream().reduce(0, Integer::max);
        System.out.println("The sum of numbers are: " + sumNumbers);
        List<Integer> factorialNumbers = list.stream()
                .map(n -> IntStream.rangeClosed(1, n).reduce(1, (int a, int b) -> a * b))
                .collect(Collectors.toList());
        System.out.println("Factorial of list: "+ factorialNumbers);



    }
}
