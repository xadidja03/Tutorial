import java.lang.*;
import java.util.*;
class Player {
    int number;
    String name, mail;
    public Player(int number, String name, String mail)
    {
        this.number = number;
        this.name = name;
        this.mail = mail;
    }
    public String toString()
    {
        return this.number + " " + this.name + " "
                + this.mail;
    }
}
class Sortbyname implements Comparator<Player> {

    public int compare(Player a, Player b) {

        return a.name.compareTo(b.name);
    }
}