import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char f = a.charAt(0);
        char s = a.charAt(1);
        String result = a.replace(s, f);

        System.out.print(result);
    }
}