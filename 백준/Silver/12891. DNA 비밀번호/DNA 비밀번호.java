import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int p = sc.nextInt();
        String dna = sc.next();
        int numA = sc.nextInt();
        int numC = sc.nextInt();
        int numG = sc.nextInt();
        int numT = sc.nextInt();

        int[] countDNA = new int[4]; // A, C, G, T

        for (int i = 0; i < p; i++) {
            add(countDNA, dna.charAt(i));
        }

        int result = 0;
        if (check(countDNA, numA, numC, numG, numT)) {
            result++;
        }

        for (int i = p; i < s; i++) {
            remove(countDNA, dna.charAt(i - p));
            add(countDNA, dna.charAt(i));

            if (check(countDNA, numA, numC, numG, numT)) {
                result++;
            }
        }

        System.out.println(result);
    }

    static void add(int[] count, char dna) {
        switch(dna) {
            case 'A': count[0]++; break;
            case 'C': count[1]++; break;
            case 'G': count[2]++; break;
            case 'T': count[3]++; break;
        }
    }

    static void remove(int[] count, char dna) {
        switch(dna) {
            case 'A': count[0]--; break;
            case 'C': count[1]--; break;
            case 'G': count[2]--; break;
            case 'T': count[3]--; break;
        }
    }

    static boolean check(int[] count, int a, int c, int g, int t) {
        return (count[0] >= a && count[1] >= c && count[2] >= g && count[3] >= t);
    }
}