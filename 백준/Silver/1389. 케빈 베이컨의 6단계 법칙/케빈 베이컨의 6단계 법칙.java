import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] friends = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    friends[i][j] = 0;
                } else {
                    friends[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            friends[a][b] = 1;
            friends[b][a] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (friends[j][i] != Integer.MAX_VALUE && friends[i][k] != Integer.MAX_VALUE) {
                        if (friends[j][k] > friends[j][i] + friends[i][k]) {
                            friends[j][k] = friends[j][i] + friends[i][k];
                        }
                    }
                }
            }
        }

        int min = Integer.MAX_VALUE;
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= n; j++) {
                sum += friends[i][j];
            }

            if (sum < min) {
                min = sum;
                answer = i;
            }
        }

        System.out.println(answer);
    }
}