import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        sb.append(A+B-C).append("\n");
        int answer = Integer.parseInt(Integer.toString(A) + Integer.toString(B)) -C;

        sb.append(answer).append("\n");
        System.out.println(sb);
    }
}