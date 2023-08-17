import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> NumberCars = new HashMap<String, Integer>();

        NumberCars.put("BAKU", 10);
        NumberCars.put("NAKHCIVAN", 75);

        System.out.println(NumberCars.get("BAKU"));

    }
}