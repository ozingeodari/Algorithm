import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[n];
        int[] hap = new int[n];
        for (int i=0; i<n; i++) {
            time[i] = sc.nextInt();
        }
        
        for (int i=1; i<n; i++) {
            int point = i;
            int value = time[i];
            for (int j=i-1; j>=0; j--) {
                if (time[j] < time[i]) {
                    point = j + 1;
                    break;
                }
                
                if (j==0) {
                    point = 0;
                }
            }
            for (int j=i; j>point; j--) {
                time[j] = time[j - 1];
            }
            time[point] = value;
        }
        
        hap[0] = time[0];
        for (int i=1; i<n; i++) {
            time[i] = time[i - 1] + time[i];
        }
        
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += time[i];
        }

        System.out.println(sum);
    }
}