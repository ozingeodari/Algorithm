import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] money = new int[n + 2];
        int[] t = new int[n + 1];
        int[] p = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }

        for (int i = n; i > 0; i--) {
            if (i + t[i] > n + 1) {
                money[i] = money[i + 1];
            } else {
                money[i] = Math.max(money[i + 1], p[i] + money[i + t[i]]);
            }
        }
        System.out.println(money[1]);
    }
}