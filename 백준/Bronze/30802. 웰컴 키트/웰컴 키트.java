import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] size = new int[6];
        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        function(N, size, T, P);
    }

    private static void function(int n, int[] size, int t, int p) {
        int Tn = 0;
        for (int i = 0; i < size.length; i++) {
            if (size[i] % t == 0) {
                Tn += size[i] / t;
            } else {
                Tn += (size[i] / t) + 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Tn).append("\n");
        sb.append(n/p).append(" ").append(n%p).append("\n");
        System.out.println(sb);
    }
}