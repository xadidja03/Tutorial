import java.util.*;
public class Main{
    public static void main(String args[]){
        ArrayList<Player> al=new ArrayList<Player>();
        al.add(new Player(1,"Khadija",20));
        al.add(new Player(2,"Murad",12));
        al.add(new Player(3,"Tunar",21));

        Collections.sort(al);
        for(Player pl:al){
            System.out.println(pl.number+" "+pl.name+" "+pl.age);
        }
    }
}