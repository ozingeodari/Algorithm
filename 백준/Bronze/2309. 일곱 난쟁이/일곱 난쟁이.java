import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dwarf = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            dwarf[i] = sc.nextInt();
            sum += dwarf[i];
        }
        Arrays.sort(dwarf);

        int a = 0;
        int b = 0;
        for (int i = 0; i < dwarf.length - 1; i++) {
            for (int j = i + 1; j < dwarf.length; j++) {
                int result = sum - dwarf[i] - dwarf[j];
                if (result == 100) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        for (int height : dwarf) {
            if (height == dwarf[a] || height == dwarf[b]) {
                continue;
            }
            System.out.println(height);
        }
    }
}