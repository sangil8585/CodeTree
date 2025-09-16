import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int n = a.length();

        String result = a.substring(0, 1) + a.substring(2, n-2) + a.substring(n-1);
        System.out.println(result);
    }
}