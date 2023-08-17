import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        ArrayList<Integer> list1=new ArrayList();
        list.add(1);// arrayimize deyer elave edir.
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list1.equals(list));//2 listin beraber olub olmadigini yoxlayir.
        list.size();//listin uzunlugunu verir.
        System.out.println(list.get(3));// hemin indexde olan deyeri qaytarir
        list.remove(2);//hemin indexde olan deyeri silir.
        list.remove(new Integer(4));// yazilan deyeri silir.
        list.clone();//array copy edib yadddasda yeni yer acib ora menimsedir.
        System.out.println(list.isEmpty());//listin bos olub-olmadigini yoxlayir.

        System.out.println(list);




    }
}
