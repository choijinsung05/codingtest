import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            String answer = function(st);
            if (answer.isEmpty()) break;
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }

    private static String function(StringTokenizer st) {
        int[] nums = new int[st.countTokens()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        if(Arrays.stream(nums).sum() == 0){
            return "";
        }else if(nums[2] >= nums[0]+ nums[1]){
            return "Invalid";
        }else if(nums[0] == nums[1] && nums[1] == nums[2]){
            return "Equilateral";
        }else if(nums[0] == nums[1] || nums[1] == nums[2]){
            return "Isosceles";
        }else{
            return "Scalene";
        }
    }
}