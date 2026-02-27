import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] array = new int[str.length()];
        for (int i=0; i<str.length(); i++) {
            array[i] = Integer.parseInt(str.substring(i, i + 1));
        }

        for (int i=0; i<str.length(); i++) {
            int max = i;
            for (int j=i+1; j<str.length(); j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            if (array[i] < array[max]) {
                int temp = array[i];
                array[i] = array[max];
                array[max] = temp;
            }
        }

        for (int i=0; i<str.length(); i++) {
            System.out.print(array[i]);
        }
    }
}