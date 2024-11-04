import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] parent;
    static boolean isComplete;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        StringTokenizer st;

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= N; j++) {
                int x = Integer.parseInt(st.nextToken());

                if (x == 1) {
                    union(i, j);
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        int first = 0;
        isComplete = true;

        for (int i = 1; i <= M; i++) {
            int a = Integer.parseInt(st.nextToken());

            if (i == 1) {
                first = a;
            }

            if (parent[first] != find(a)) {
                isComplete = false;
                break;
            }
        }

        System.out.println(isComplete? "YES" : "NO");
    }

    static void union(int i, int j) {
        i = find(i);
        j = find(j);

        if (i < j) {
            parent[j] = i;
        } else {
            parent[i] = j;
        }
    }

    static int find(int v) {
        if (parent[v] == v) {
            return v;
        } else {
            return parent[v] = find(parent[v]);
        }
    }
}