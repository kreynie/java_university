import java.util.*;

public class DrunkTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DrunkGuy drunkGuy = new DrunkGuy();

        System.out.println("Введите карты первого игрока:");
        String player1Cards = scanner.nextLine().trim();
        drunkGuy.setPlayer1(player1Cards);

        System.out.println("Введите карты второго игрока:");
        String player2Cards = scanner.nextLine().trim();
        drunkGuy.setPlayer2(player2Cards);

        drunkGuy.drunkGuyQueue();
    }
}