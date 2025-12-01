import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums, 0, nums.length);
        
        int maxSum = 0;
        int numLen = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i] + nums[numLen - 1 - i];
            if(maxSum < sum) {
                maxSum = sum;
            }
        }

        System.out.print(maxSum);
    }
}