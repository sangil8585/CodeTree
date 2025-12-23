import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        long a = 0;
        long b = 0;

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // System.out.print(c);
            if(c == '(') {
               a++; 
            } else {
                b += a;
            }
        }
        System.out.println(b);
    }
}