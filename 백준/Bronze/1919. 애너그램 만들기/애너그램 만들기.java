import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] first = sc.nextLine().toCharArray();
        char[] second = sc.nextLine().toCharArray();

        int[] alpha = new int[26];
        for (char ch : first) {
            alpha[ch - 'a']++;
        }
        for (char ch : second) {
            alpha[ch - 'a']--;
        }

        int result = 0;
        for (int count : alpha) {
            result += Math.abs(count);
        }

        System.out.println(result);
    }
}