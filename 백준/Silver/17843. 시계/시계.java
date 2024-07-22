import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());

            double result = getResult(H, M, S);
            sb.append(result + "\n");
        }
        System.out.println(sb);
    }

    private static double getResult(int H, int M, int S) {
        int [] arr = new int[3];
        arr[0] = 3600 * H + 60 * M + S;
        arr[1] = 720 * M + 12 * S;
        arr[2] = 720 * S;
        Arrays.sort(arr);

        double result = (double) Math.min(Math.min(arr[1] - arr[0], arr[2] - arr[1]), 43200 + arr[0] - arr[2]) / 120;
        return result;
    }
}