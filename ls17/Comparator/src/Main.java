import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> ar = new ArrayList<Player>();
        ar.add(new Player(002, "Khadija Madnayeva", "xadidjamadnaeva@mail.ru"));
        ar.add(new Player(001, "Murad Madnayev","muradxedice@mail.ru"));
        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        Collections.sort(ar, new Sortbyname());
        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}