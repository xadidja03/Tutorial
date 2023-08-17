import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue2 {
    public static void main(String[] args) {
        Queue<Integer> smt=new LinkedList<>();//daxil edilen sira ile duzur
        Queue<Integer> smt1=new PriorityQueue<>();//1 ci en kicyi secir basa qoyur sonra random edir.
        Queue<Integer> smt2=new ArrayDeque<>();
        smt.add(2);//queue obyekt elave edir.
        smt.add(3);//queue obyekt elave edir.
        smt.add(4);//queue obyekt elave edir.
        smt.add(5);//queue obyekt elave edir.
        smt.add(6);//queue obyekt elave edir.
        System.out.println(smt.remove(4));//hemin deyeri silir
        System.out.println(smt.size());//olcusunu tapir
        System.out.println(smt.contains(2));//hemin obyektin queude yerlesib yerlesmediyini yoxlayr
        System.out.println(smt.isEmpty());//queue bos olub olmadigini yoxlayir
        System.out.println(smt.poll());//queue ilk obyektini silir ve qaytarir
        System.out.println(smt.peek());//ilk obyektini qaytarir
        System.out.println(smt);//cap edir.


    }
}
