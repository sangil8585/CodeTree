import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int cnt1 = 0;
        int cnt2 = 0;
        
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.substring(i, i + 2).equals("ee")) {
                cnt1++;
            }
            if (a.substring(i, i + 2).equals("eb")) {
                cnt2++;
            }
        }

        System.out.print(cnt1 + " " + cnt2);
        
    }
}