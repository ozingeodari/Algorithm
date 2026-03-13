import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int m = sc.nextInt();
        for (int i=0; i<m; i++) {
            int target = sc.nextInt();
            boolean result = false;

            int start = 0;
            int end = a.length-1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (a[mid] > target) {
                    end = mid - 1;
                } else if (a[mid] < target) {
                    start = mid + 1;
                } else {
                    result = true;
                    break;
                }
            }

            if (result) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}