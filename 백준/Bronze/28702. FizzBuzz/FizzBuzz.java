import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        System.out.println(function(s1, s2, s3));
    }

    private static String function(String s1, String s2, String s3) {
        int n = -1;
        if (isNumberic(s3)) {
            n = Integer.parseInt(s3) + 1;
        }
        if (isNumberic(s2)) {
            n = Integer.parseInt(s2) + 2;
        }
        if (isNumberic(s1)) {
            n = Integer.parseInt(s1) + 3;
        }
        StringBuilder sb = new StringBuilder();
        if(n % 3 == 0) sb.append("Fizz");
        if(n % 5 == 0) sb.append("Buzz");
        if(sb.isEmpty()) sb.append(n);
        return sb.toString();
    }

    private static boolean isNumberic(String str) {
        return str.chars().allMatch(Character::isDigit);
    }
}