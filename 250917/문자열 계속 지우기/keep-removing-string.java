import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine(); 

        
        while (a.contains(b)) {
            int idx = a.indexOf(b);
            a = a.substring(0, idx) + a.substring(idx + b.length());
        }

        System.out.println(a);
    }
}