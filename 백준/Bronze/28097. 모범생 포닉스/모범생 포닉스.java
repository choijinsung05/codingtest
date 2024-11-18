import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        while (st.hasMoreTokens()) {
            int T = Integer.parseInt(st.nextToken());
            sum += T;
        }
        sum += 8 * (N - 1);
        int day = sum/24;
        int time = sum%24;
        StringBuilder sb = new StringBuilder();
        sb.append(day).append(" ").append(time).append("\n");
        System.out.println(sb);
    }
}
