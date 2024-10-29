import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int[] S;
    private static int[] nums = new int[10];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        S = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solve());
    }

    private static String solve() {
        StringBuilder sb = new StringBuilder();

        sb.append(twoPointer(0, 0, 0, 0, 0));

        return sb.toString();
    }

    private static int twoPointer(int start, int end, int count, int kind, int max) {
        if (end >= N) {
            return max;
        }
        if (nums[S[end]] == 0) {
            kind++;
        }
        count++;
        nums[S[end]]++;

        if (kind > 2) {
            if (--nums[S[start]] == 0) {
                kind--;
            }
            count--;
            start++;
        }
        max = Math.max(max, count);
        return twoPointer(start, end + 1, count, kind, max);
    }
}