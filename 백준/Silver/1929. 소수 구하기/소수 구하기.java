import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean[] noPrime = new boolean[n + 1];
        noPrime[0] = true;
        noPrime[1] = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (noPrime[i]) {
                continue;
            }
            for (int j = i + i; j <= n; j += i) {
                noPrime[j] = true;
            }
        }

        for (int i = m; i <= n; i++) {
            if (!noPrime[i]) {
                System.out.println(i);
            }
        }
    }
}