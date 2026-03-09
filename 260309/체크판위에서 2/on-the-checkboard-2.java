import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        char start = grid[0][0];
        char end = grid[R-1][C-1];

        if(start == end) {
            System.out.println(0);
            return;
        }

        int cnt = 0;
        for (int r1 = 1; r1 < R - 1; r1++) {
            for (int c1 = 1; c1 < C - 1; c1++) {
                if (grid[r1][c1] != grid[R - 1][C - 1]) continue;
                for (int r2 = r1 + 1; r2 < R - 1; r2++) {
                    for (int c2 = c1 + 1; c2 < C - 1; c2++) {
                        if (grid[r2][c2] == grid[0][0]) {
                            cnt++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}