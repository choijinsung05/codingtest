import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] channel = new int[N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.equals("KBS1")) {
                channel[i] = 1;
            } else if (s.equals("KBS2")) {
                channel[i] = 2;
            } else {
                channel[i] = 3;
            }
        }
        StringBuilder sb = new StringBuilder();
        int k1 = 0;
        int k2 = 0;
        int temp = 0;
        while (channel[0] != 1) {
            if (channel[k1] != 1) {
                sb.append("1");
                k1++;
            } else {
                sb.append("4");
                temp = channel[k1];
                channel[k1] = channel[k1 - 1];
                channel[k1 - 1] = temp;
                k1--;
            }
        }
        while (channel[1] != 2) {
            if (channel[k2] != 2) {
                sb.append("1");
                k2++;
            } else {
                sb.append("4");
                temp = channel[k2];
                channel[k2] = channel[k2 - 1];
                channel[k2 - 1] = temp;
                k2--;
            }
        }
        System.out.println(sb);
    }
}