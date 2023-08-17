import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        set.add("Mercedes");
        set.add("BMW");
        set.add("AUDI");
        set.add("TOYOTA");
        set.add("PORSCHE");
        System.out.println(set.remove("BMW"));
        System.out.println(set);
    }
}