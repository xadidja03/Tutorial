import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        Map<String,String> map1=new TreeMap<>();
        Map<String,String> map2=new LinkedHashMap<>();
        map.put("Xedice",2003);//key ve valuelerimiz yerlesdiririk
        map.put("Nihat",2003);//key ve valuelerimiz yerlesdiririk
        map.put("Elcin",2003);//key ve valuelerimiz yerlesdiririk
        map.put("Leman",2002);//key ve valuelerimiz yerlesdiririk
        map.put("Ferid",2003);//key ve valuelerimiz yerlesdiririk
        System.out.println(map);
        System.out.println(map.get("Ferid"));//hemin value de olan deyeri qaytarir
        System.out.println(map.containsKey("Xedice"));//obyektin yerlesib yerlesmediyini yoxlayr
        System.out.println(map.size());//olcusunu verir
        System.out.println(map.keySet());//key ve value ni birlikde verir
        map.remove("Nihat",2003);//yazdigimiz obyekti silir
        map.replace("Leman",2003);//replace edir
        System.out.println(map);
    }
}