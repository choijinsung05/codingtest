import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();

        System.out.println(function(S, T));
    }

    static int function(String S, String T ){
        while(T.length() > S.length()){
            if(T.endsWith("A")){
                T = T.substring(0, T.length()-1);
            }else if(T.endsWith("B")){
                T = new StringBuilder(T.substring(0, T.length() - 1)).reverse().toString();
            }else{
                break;
            }
        }
        return T.equals(S) ? 1 : 0;
    }
}