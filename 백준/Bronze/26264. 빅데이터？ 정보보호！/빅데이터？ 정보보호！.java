import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();

        String s1 = s.replaceAll("security", "1");
        String s2 = s1.replaceAll("bigdata", "2");

        int counter = 0;
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (c == '1') {
                counter++;
            }else{
                counter--;
            }
        }
        String answer = counter == 0 ? "bigdata? security!" : counter > 0 ? "security!" : "bigdata?";
        System.out.println(answer);
    }
}
