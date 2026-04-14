import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        Stack<Integer> numbers = new Stack<>();
        for (int i=0; i<k; i++) {
            int now = sc.nextInt();
            if (now == 0) {
                numbers.pop();
                continue;
            }
            numbers.push(now);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}