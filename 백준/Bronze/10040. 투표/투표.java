import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//경기수
        int M = Integer.parseInt(st.nextToken());//의원수

        int [] Ai = new int[N];
        int [] An = new int [N];
        for (int i = 0; i < N; i++) {
            Ai[i] = Integer.parseInt(br.readLine());
        }
        for (int j = 0; j < M; j++) {
            int Bj = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                if(Ai[i] <= Bj){
                    An[i] +=1;
                    break;
                }
            }
        }
        int check = 0;
        int answer = 0;
        for (int i = 0; i < N; i++) {
            if(An[i] > check){
                check = An[i];
                answer = i;
            }
        }
        System.out.println(answer+1);
    }
}