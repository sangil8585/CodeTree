import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        boolean[] tf = new boolean[C + 1];
        tf[0] = true;

        for (int i = 0; i <= C; i++) {
            if (!tf[i]) continue;
            if (i + A <= C) tf[i + A] = true;
            if (i + B <= C) tf[i + B] = true;
        }

        for (int x = C; x >= 0; x--) {
            if (tf[x]) {
                System.out.println(x);
                return;
            }
        }
    }
}