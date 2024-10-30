import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N == 0){
            System.out.println(1);
        }else{
            System.out.println(solve(1,N));
        }
    }

    private static BigInteger solve(int start, int end) {
        if(start == end) return BigInteger.valueOf(end);

        return solve(start, (start + end) / 2).multiply(solve((start + end) / 2 + 1, end));
    }
}