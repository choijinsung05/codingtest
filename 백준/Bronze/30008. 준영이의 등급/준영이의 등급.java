import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//학생수
        int K = Integer.parseInt(st.nextToken());//과목수

        StringTokenizer Gi = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (K-- > 0) {
            int g = Integer.parseInt(Gi.nextToken());
            sb.append(checkGrade(g, N)).append(" ");
        }
        System.out.println(sb);
    }

    private static int checkGrade(int g, int n) {
        int p = g * 100 / n;
        if(p <= 4){
            return 1;
        } else if (p <= 11) {
            return 2;
        } else if (p <= 23) {
            return 3;
        } else if (p <= 40) {
            return 4;
        } else if (p <= 60) {
            return 5;
        }else if (p <= 77) {
            return 6;
        }else if (p <= 89) {
            return 7;
        }else if (p <= 96) {
            return 8;
        }else {
            return 9;
        }
    }
}