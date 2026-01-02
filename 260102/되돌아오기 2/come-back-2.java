import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cmd = br.readLine().trim();

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int dir = 0;
        int x = 0, y = 0;

        for (int t = 1; t <= cmd.length(); t++) {
            char c = cmd.charAt(t - 1);

            if (c == 'L') {
                dir = (dir + 3) % 4;
            } else if (c == 'R') {
                dir = (dir + 1) % 4;
            } else {
                x += dx[dir];
                y += dy[dir];
            }

            if (x == 0 && y == 0) {
                System.out.println(t);
                return;
            }
        }

        System.out.println(-1);
    }
}