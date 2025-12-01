import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[2 * N];

        for (int i = 0; i < 2 * N; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int result = 0;

        for (int i = 0; i < N; i++) {
            int sum = nums[i] + nums[2 * N - 1 - i];
            result = Math.max(result, sum);
        }

        System.out.println(result);
    }
}
