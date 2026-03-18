import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> cards = new PriorityQueue<>();

        for (int i=0; i<n; i++) {
            cards.add(sc.nextInt());
        }

        int result = 0;
        while (cards.size() > 1) {
            int c1 = cards.poll();
            int c2 = cards.poll();
            result += c1 + c2;
            cards.add(c1 + c2);
        }

        System.out.println(result);
    }
}