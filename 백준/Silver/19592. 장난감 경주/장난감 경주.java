import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        while(T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 유저수
            int X = Integer.parseInt(st.nextToken()); // 거리
            int Y = Integer.parseInt(st.nextToken()); // 부스터 최대치
            st = new StringTokenizer(br.readLine());
            int[] V = new int[N];
            for(int i = 0; i< V.length;i++){
                V[i] = Integer.parseInt(st.nextToken()); // 각 유저 속도
            }
            sb.append(function(N, X, Y, V)).append("\n");
        }
        System.out.println(sb);
    }

    private static int function(int n, int x, int y, int[] v) {
        int otherUserSpeed = 0;
        int mySpeed = v[n-1];
        double otherUserTime = 0;
        double myTime = 0;
        int answer = 0;
        for (int i = 0; i < n-1; i++) {
            if(otherUserSpeed < v[i]) otherUserSpeed = v[i];
        }
        otherUserTime = (double) x / otherUserSpeed;

        if(otherUserSpeed < mySpeed) return 0; // 부스터 없이 단독우승
        myTime = (double) (x-y) /mySpeed + 1;
        if(otherUserTime <= myTime) return -1;//부스터 최대치 단독우승 불가

        answer = x;
        for (int i = y; i >= mySpeed; i--) {
            myTime = (double) (x-i) / mySpeed + 1;
            if(otherUserTime <= myTime) {
                answer = i+1;
                return answer;
            }
        }
        return answer;
    }
}
