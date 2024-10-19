import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(T--> 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int [] a = new int[n];
            int [] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            int k = 1;
            for (int i = 0; i < n; i++) {
                if(a[i] == k){
                    k++;
                }
                b[i] = k++;
            }
            sb.append(b[n-1]).append("\n");
        }
        System.out.println(sb);
    }
}