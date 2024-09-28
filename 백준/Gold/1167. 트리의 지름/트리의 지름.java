import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Node> [] list;
    static boolean [] visted;
    static int answer = Integer.MIN_VALUE;
    static int node;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int V = Integer.parseInt(br.readLine());
        list = new ArrayList[V+1];
        for (int i = 1; i < V+1; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < V; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            while(true){
                int end = Integer.parseInt(st.nextToken());
                if(end == -1) break;
                int cost = Integer.parseInt(st.nextToken());
                list[start].add(new Node(end,cost));
            }
        }
        visted = new boolean[V+1];
        dfs(1,0);

        visted = new boolean[V+1];
        dfs(node,0);

        System.out.println(answer);
    }
    static class Node{
        int e;
        int cost;

        public Node(int e, int cost) {
            this.e = e;
            this.cost = cost;
        }
    }
    public static void dfs(int x, int len){
        if(len > answer){
            answer = len;
            node = x;
        }
        visted[x] = true;
        for(int i =0;i < list[x].size();i++){
            Node node = list[x].get(i);
            if(!visted[node.e]){
                dfs(node.e, node.cost+len);
                visted[node.e] = true;
            }
        }
    }
}
