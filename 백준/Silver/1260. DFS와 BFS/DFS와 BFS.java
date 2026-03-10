import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        graph = new ArrayList[n + 1];

        for (int i=1; i<=n; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph[s].add(e);
            graph[e].add(s);
        }

        for (int i=1; i<=n; i++) {
            Collections.sort(graph[i]);
        }

        visited = new boolean[n + 1];
        dfs(start);
        System.out.println();

        visited = new boolean[n + 1];
        bfs(start);
    }

    private static void dfs(int node) {
        System.out.print(node + " ");
        visited[node] = true;

        for (int to : graph[node]) {
            if (!visited[to]) {
                dfs(to);
            }
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int next : graph[current]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}