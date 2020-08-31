package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing", 2000, 45.5,10000);
        Airplane plane2 = new Airplane("Cessna", 2010, 5.5,2000);
        Airplane.compare(plane1,plane2);

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
        player6.info();

        Player player7 = new Player();
        Player player8 = new Player();
        player1.info();
    }
}
