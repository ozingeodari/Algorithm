import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n];
        for (int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        int[] B = new int[n];
        for (int i=0; i<n; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(B);

        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += A[i] * B[n - i - 1];
        }

        System.out.println(sum);
    }
}