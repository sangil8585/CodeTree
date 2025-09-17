import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String e = "e";

        a = a.substring(0, a.indexOf(e)) + a.substring(a.indexOf(e)+1, a.length());
        
        System.out.println(a);
    }
}