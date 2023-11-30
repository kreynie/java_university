import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DrunkGuy {

    private int count = 0;
    private Queue<Integer> player1 = new LinkedList<>();
    private Queue<Integer> player2 = new LinkedList<>();

    public void setPlayer1(String cards) {
        player1 = parseCards(cards);
    }

    public void setPlayer2(String cards) {
        player2 = parseCards(cards);
    }

    private Queue<Integer> parseCards(String cards) {
        Queue<Integer> queue = new LinkedList<>();
        for (char c : cards.toCharArray()) {
            queue.add(Character.getNumericValue(c));
        }
        return queue;
    }

    private Queue<Integer> addToBottom(Queue<Integer> queue, int element) {
        queue.add(element);
        return queue;
    }

    public void drunkGuyQueue() {
        while (true) {
            if (count == 106) {
                System.out.println("botva");
                break;
            }

            Integer card1 = player1.poll();
            Integer card2 = player2.poll();

            if (card1 == null || card2 == null) {
                break;
            }

            if (card1.equals(card2)) {
                player1 = addToBottom(player1, card1);
                player2 = addToBottom(player2, card2);
            } else if ((card1 == 9 && card2 == 0) || (card1 < card2)) {
                player2 = addToBottom(player2, card1);
                player2 = addToBottom(player2, card2);

                if (player1.isEmpty()) {
                    System.out.println("second " + (count + 1));
                    break;
                }
                count++;
            } else {
                player1 = addToBottom(player1, card1);
                player1 = addToBottom(player1, card2);

                if (player2.isEmpty()) {
                    System.out.println("first " + (count + 1));
                    break;
                }
                count++;
            }
        }
    }
}