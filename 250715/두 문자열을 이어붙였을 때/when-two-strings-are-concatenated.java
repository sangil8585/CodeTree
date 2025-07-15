import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();

        boolean tf = true;
        
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) != a.charAt(i % a.length())) {
                tf = false;
                break;
            }
        }
        System.out.print(tf);
    }
}