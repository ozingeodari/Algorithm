import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;
        int start = 1;
        int end = 1;
        int sum = 1;

        while (end != n) {
            if (sum == n) { // 합이 n과 같음
                count++;
                end++;
                sum += end;
            } else if (sum > n) { // 합이 n보다 큼
                sum -= start;
                start++;
            } else { // 합이 n보다 작음
                end++;
                sum += end;
            }
        }
        System.out.println(count);
    }
}