import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();

        long value = 0;
        for (int i = 0; i < N.length(); i++) {
            int digit = N.charAt(i) - '0';
            value = value * A + digit;
        }

        if (value == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();
        while (value > 0) {
            sb.append(value % B);
            value /= B;
        }

        System.out.println(sb.reverse());
    }
}