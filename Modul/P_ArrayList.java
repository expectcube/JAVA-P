package Modul;
import java.util.ArrayList;
class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class P_ArrayList  {
    public static void main(String args[])  {
            System.out.println("====[Leaderboard Player]====");

            ArrayList<Player> orang = new ArrayList<>();

                orang.add(new Player("Mas Mas Berkumis", 120));
                orang.add(new Player("Om Botak", 200));
                orang.add(new Player("Pak kumis", 150));
                orang.add(new Player("Mau Tidur", 180));
                orang.add(new Player("Epen", 90));

        for (Player p : orang) {
                System.out.println(p.name + " - " + p.score);
        }

    }
}