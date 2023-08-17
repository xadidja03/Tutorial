import java.util.*;
class MapExample2 {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(2003, "Khadija Madnayeva");
        map.put(2006, "Murad Madnayev");
        map.put(2004, "Ali Rasul");
        for (Map.Entry k : map.entrySet()) {
            System.out.println(k.getKey() + " " + k.getValue());
        }
    }
}
