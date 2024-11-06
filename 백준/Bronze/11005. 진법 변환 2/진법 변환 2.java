import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(solve(N, B));
    }

    private static String solve(int n, int b) {
        if(n == 0) return "";
        int quotient = n/b;
        int remainder = n%b;
        char c;
        if(remainder < 10){
            c = (char) (remainder + 48);
        }else{
            c = (char) (remainder + 55);
        }
        return solve(quotient, b) + c;
    }
}