import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        
        int len = a.length();
        a = a.substring(1, len) + a.substring(0, 1) ;
        System.out.print(a); 
    }
}