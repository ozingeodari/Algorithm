import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> notListen = new HashSet<>();
        for (int i = 0; i < n; i++) {
            notListen.add(br.readLine());
        }

        List<String> notSeeListen = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (notListen.contains(name)) {
                notSeeListen.add(name);
            }
        }

        Collections.sort(notSeeListen);

        System.out.println(notSeeListen.size());
        for (String names : notSeeListen) {
            System.out.println(names);
        }
    }
}