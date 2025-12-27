import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            
            int k = 0;
            if(direction == 'E') {
                k = 0;
            } else if(direction == 'W') {
                k = 1;
            } else if(direction == 'S') {
                k = 2;
            } else if(direction == 'N') {
                k = 3;
            }

            x += dx[k] * distance;
            y += dy[k] * distance;
        }

        System.out.println(x + " " + y);
    }
}