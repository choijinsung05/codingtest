import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] startTime = st.nextToken().split(":");
        int start = Integer.parseInt(startTime[0])*60 + Integer.parseInt(startTime[1]);
        String[] endTime = st.nextToken().split(":");
        int end = Integer.parseInt(endTime[0])*60 + Integer.parseInt(endTime[1]);

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int day = 0;
        int time = start;
        for (int i = 0; i <= N; i++) {
            if(time + M < end){
                time += M;
            }else{
                time = start + M;
                day++;
            }
        }
        System.out.println(day);
        String s = String.format("%02d:%02d", time / 60 , time % 60);
        System.out.println(s);
    }
}
