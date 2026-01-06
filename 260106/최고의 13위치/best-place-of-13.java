import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.

        int ans = 0;

        for(int i = 0; i < n; i++) {
            for (int j = 0; j + 2 < n; j++) {
                int sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
                if (sum > ans) ans = sum;
            }
        }

        for (int i = 0; i + 2 < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = grid[i][j] + grid[i + 1][j] + grid[i + 2][j];
                if (sum > ans) ans = sum;
            }
        }

        System.out.println(ans);
    }

    
}