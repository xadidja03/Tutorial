import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();//obyektlerimiz hash kimi yerlesir.
        Set<String> set1 = new LinkedHashSet<>();//obyektlerimiz sira ile yerlesir.
        Set<String> set2 = new TreeSet<>();//elave etdiyimiz obyektler ardicil sira ile duzulur.
        set2.add("Xedice");//elave edirik
        set2.add("Murad");//elave edirik
        System.out.println(set2);
        System.out.println(set2.size());//setin olcusu verir.
        System.out.println(set2.remove("Murad"));// yazdigimiz obyekti remov edir edibse true verir/
        System.out.println(set2.equals("Eli"));//yazdigmiz obyektin setde olan obyekte beraber olub olmadigini yoxlayir eledise true deilse false verir
        System.out.println(set2.contains("Veli"));//yazgimiz obyekt set de yerlesirmi boolean cavab verir
        System.out.println(set.isEmpty());//bosdusa true verir , deyilse false
        set2.clear();//seti tamamen silir boolean deyer verir
        System.out.println(set2);


    }
}