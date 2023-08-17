import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User>list=List.of(
                new User("Xedice",19),
                new User("Elchin",19),
                new User("Nihat",19),
                new User("Leman",19)
        );
        List<Integer>list1=list.stream()
                .filter(x->x.getName().equals("Xedice"))
                .map(user -> user.getAge())
                .collect(Collectors.toList());
        System.out.println(list1);
    }

}