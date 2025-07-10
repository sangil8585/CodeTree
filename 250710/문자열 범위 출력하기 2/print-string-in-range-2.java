import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int m = sc.nextInt();

        int count = Math.min(m, n.length());

        for(int i = n.length() - 1; i >= n.length() - count; i--) {
            System.out.print(n.charAt(i));
        }
    }
}