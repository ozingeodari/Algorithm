import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 1; i < n; i++) {
            int hap = i;
            String now = Integer.toString(i);
            for (int j = 0; j < now.length(); j++) {
                hap += now.charAt(j) - '0';
            }

            if (hap == n) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}