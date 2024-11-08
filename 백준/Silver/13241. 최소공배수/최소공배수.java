import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        System.out.println(solve(A, B));
    }

    private static String solve(long A, long B) {
        StringBuilder sb = new StringBuilder();

        long gcd = GCD(A,B);

        sb.append(A*B/gcd);

        return sb.toString();
    }

    private static long GCD(long a, long b) {
        long remainder = b % a;
        if (remainder == 0) {
            return a;
        }else{
            return GCD(remainder, a);
        }
    }

}