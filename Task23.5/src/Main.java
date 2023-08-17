import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> list=List.of(
                new User("Khadija","Madnayeva"),
                new User("Elchin","Huseynov"),
                new User("Nihat","Quliyev"),
                new User("Farid","Tahmazov"),
                new User("Ilyas","Bayramov")
        );
        List<String >list1=list.stream()
                .filter(x->x.getName().length()>5)
                .map(user -> user.getName())
                .collect(Collectors.toList());
        System.out.println("The list is: "+ list1);
    }
    }