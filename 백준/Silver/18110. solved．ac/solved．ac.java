import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int startIndex = Math.round((float) (n * 15) / 100);
        int endIndex = startIndex != 0 ? n - startIndex: n;

        int average = (int) Math.round(Arrays.stream(arr,startIndex, endIndex)
                .average().orElse(0));

        System.out.println(average);
    }
}
