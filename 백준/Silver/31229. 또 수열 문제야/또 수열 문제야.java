import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int k = 1;
        StringBuilder sb = new StringBuilder();
        while(N-->0){
            sb.append(k).append(" ");
            k+= 2;
        }
        System.out.println(sb);
    }
}