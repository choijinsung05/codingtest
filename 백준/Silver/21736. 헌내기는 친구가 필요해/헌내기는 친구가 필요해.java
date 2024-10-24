import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int [][] maze;
    static boolean[][] visited;
    static int [] dx = {-1, 0, 1, 0};
    static int [] dy = {0, -1, 0, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];
        visited = new boolean[N][M];
        int p = 0;
        int q = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                char c = s.charAt(j);
                if(c == 'I'){
                    maze[i][j] = 1;
                    p = i;
                    q = j;
                }else if(c == 'P') maze[i][j] = 2;
                else if(c == 'X') maze[i][j] = -1;
            }
        }
        int answer = bfs(p,q);
        System.out.println(answer == 0 ? "TT" : answer);
    }

    private static int bfs(int p, int q) {
        Queue<node> que = new LinkedList<>();
        int count = 0;
        que.add(new node(p,q));
        visited[p][q] = true;
        while(!que.isEmpty()){
            node cur = que.poll();
            int nowX = cur.x;
            int nowY = cur.y;
            
            if(maze[nowX][nowY] == 2){
                count++;
                maze[nowX][nowY] = 3;
            }else if(maze[nowX][nowY] == 0){
                maze[nowX][nowY] = 3;
            }
            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if(nextX <0 || nextY < 0 || nextX >=N || nextY >=M){
                    continue;
                }else if((maze[nextX][nextY] == 0 || maze[nextX][nextY] == 2) && !visited[nextX][nextY]){
                    que.add(new node(nextX,nextY));
                    visited[nextX][nextY] = true;
                }
            }
        }
        return count;
    }

    static class node {
        int x;
        int y;
        public node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
