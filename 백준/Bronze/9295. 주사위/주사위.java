import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            String s = String.format("Case %d: %d\n", i + 1, Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append(s);
        }
        System.out.println(sb);
    }
}
