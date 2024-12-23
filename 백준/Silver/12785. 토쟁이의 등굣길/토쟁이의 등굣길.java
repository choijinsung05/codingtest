import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long [][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        dp = new long[h][w];

        for (int i = 0; i < h; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < w; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < h; i++) {
            for (int j = 1; j < w; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1_000_007;
            }
        }
        System.out.println((dp[y - 1][x - 1] * dp[h - y][w - x]) % 1_000_007);
    }
}