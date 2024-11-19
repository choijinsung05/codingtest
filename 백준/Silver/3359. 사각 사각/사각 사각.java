import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][] arr = new int[N + 1][2];
        for (int i = 1; i < N+1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int answer = function(arr, N);
        System.out.println(answer);
    }

    private static int function(int[][] arr, int n) {
        int [][] dp = new int[n+1][2];
        dp[1][0] = arr[1][0];
        dp[1][1] = arr[1][1];

        for (int i = 2; i < n+1; i++) {
            dp[i][0] = Math.max(
                    dp[i-1][0] + arr[i][0] + Math.abs(arr[i][1] - arr[i-1][1]),
                    dp[i-1][1] + arr[i][0] + Math.abs(arr[i][1] - arr[i-1][0]));
            dp[i][1] = Math.max(
                    dp[i-1][0] + arr[i][1] + Math.abs(arr[i][0] - arr[i-1][1]),
                    dp[i-1][1] + arr[i][1] + Math.abs(arr[i][0] - arr[i-1][0]));
        }
        return Math.max(dp[n][0], dp[n][1]);
    }
}