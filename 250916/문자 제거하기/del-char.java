import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (s.length() <= 1) break;

            int pos = (num >= s.length()) ? s.length() - 1 : num;

            s = s.substring(0, pos) + s.substring(pos + 1);

            System.out.println(s);
        }
    }
}