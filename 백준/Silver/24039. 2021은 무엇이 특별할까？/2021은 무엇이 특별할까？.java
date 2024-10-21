import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] N = new int[10001];
        Arrays.fill(N, 1);
        N[0] = 0;
        N[1] = 0;
        for (int i = 2; i < N.length; i++) {
            if (N[i] == 1) {
                int k = i+i;
                while (k <= 10000) {
                    N[k] = 0;
                    k +=i;
                }
            }
        }
        int before = 2;
        int after = -1;
        for (int i = 3; i < N.length; i++) {
            if(N[i] == 1) {
                after = i;
                if(before*after > n){
                    System.out.println(before*after);
                    break;
                }
                before = after;
            }
        }
    }
}
