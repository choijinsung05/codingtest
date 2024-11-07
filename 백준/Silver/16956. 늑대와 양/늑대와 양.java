import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int R, C;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];

        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                char c = s.charAt(j);
                map[i][j] = c;
            }
        }
        System.out.println(solve());
    }

    private static String solve() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                char c = map[i][j];
                if(c == 'W'){
                    int nowX = i;
                    int nowY = j;
                    for (int k = 0; k < 4; k++) {
                        int nx = nowX + dx[k];
                        int ny = nowY + dy[k];
                        if (nx < 0 || ny < 0 || nx >= R || ny >= C) {
                            continue;
                        }
                        if(map[nx][ny] == 'S'){
                            return "0";
                        }else if(map[nx][ny] == '.'){
                            map[nx][ny] = 'D';
                        }
                    }
                }
            }
        }
        sb.append("1\n");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}