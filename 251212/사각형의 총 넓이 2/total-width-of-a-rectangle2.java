import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[][] grid = new boolean[201][201];
        
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int j = x1; j < x2; j++) {
                for(int k = y1; k < y2; k++) {
                    grid[j][k] = true;
                }
            }
        }
        
        int area = 0;
        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                if (grid[i][j]) {
                    area++;
                } 
            }
        }
        System.out.print(area);
    }
}