import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        boolean[] primeNumber = init();
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int K = Integer.parseInt(br.readLine());
            sb.append(findThreePrimes(primeNumber, K)).append("\n");
        }
        System.out.println(sb);
    }

    private static String findThreePrimes(boolean[] primeNumber, int K) {
        for (int i = 2; i < primeNumber.length; i++) {
            if (primeNumber[i]) {
                for (int j = 2; j < primeNumber.length; j++) {
                    if (primeNumber[j]) {
                        for (int k = 2; k < primeNumber.length; k++) {
                            if (primeNumber[k] && i + j + k == K) {
                                return i + " " + j + " " + k;
                            }
                        }
                    }
                }
            }
        }
        return "0";
    }

    private static boolean[] init() {
        boolean[] result = new boolean[1000];
        Arrays.fill(result, true);
        result[0] = false;
        result[1] = false;
        for (int i = 2; i < 1000; i++) {
            if (result[i]) {
                int j = i;
                int n = 2;
                while (j * n < 1000) {
                    result[j * n++] = false;
                }
            }
        }
        return result;
    }
}