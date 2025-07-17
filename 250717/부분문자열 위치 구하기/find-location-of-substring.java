import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int cnt = -1;
        
        for (int i = 0; i <= a.length() - b.length(); i++) {
            if (a.substring(i, i + b.length()).equals(b)) {
                cnt = i;
                break;
            }
        }
        
        System.out.print(cnt);
    }
}