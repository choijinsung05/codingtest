import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        double sum = 0;
        double credits = 0;
        Map<String, Double> map = new HashMap<String, Double>(){
            {
                put("A+", 4.5);
                put("A0", 4.0);
                put("B+", 3.5);
                put("B0", 3.0);
                put("C+", 2.5);
                put("C0", 2.0);
                put("D+", 1.5);
                put("D0", 1.0);
                put("F", 0.0);
            }
        };
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String s1 = st.nextToken();
            double s2 = Double.parseDouble(st.nextToken());
            String s3 = st.nextToken();

            if(map.keySet().contains(s3)){
                sum += s2 * map.get(s3);
                credits += s2;
            }
        }
        System.out.println(sum /= credits);
    }
}