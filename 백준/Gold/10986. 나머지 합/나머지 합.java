import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] sum = new long[n];
        long[] count = new long[m];
        long answer = 0;

        sum[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int remainder = (int) (sum[i] % m);
            if (remainder == 0) {
                answer++;
            }
            count[remainder]++;
        }

        for (int i = 0; i < m; i++) {
            if (count[i] > 1) {
                answer += count[i] * (count[i] - 1) / 2;
            }
        }

        System.out.println(answer);
    }
}