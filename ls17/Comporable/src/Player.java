class Player implements Comparable<Player> {
    int number;
    String name;
    int age;

    Player(int number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Player pl){
        if(age==pl.age)
            return 0;
        else if(age>pl.age)
            return 1;
        else
            return -1;
    }
}
