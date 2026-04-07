import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> guitars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            guitars.add(sc.next());
        }

        guitars.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }

                int sumo1 = 0;
                int sumo2 = 0;
                for (int i = 0; i < o1.length(); i++) {
                    int charo1 = o1.charAt(i) - '0';
                    if (charo1 > 0 && charo1 < 10) {
                        sumo1 += charo1;
                    }

                    int charo2 = o2.charAt(i) - '0';
                    if (charo2 > 0 && charo2 < 10) {
                        sumo2 += charo2;
                    }
                }
                if (sumo1 == sumo2) {
                    return o1.compareTo(o2);
                }
                return sumo1 - sumo2;
            }
        });

        for (String string : guitars) {
            System.out.println(string);
        }
    }
}