import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String l = a;
        System.out.println(l);
        for(int i = 0; i < a.length(); i++) {
            l = l.charAt(a.length()-1) + l.substring(0, a.length()-1);
            System.out.println(l);
        }
    }
}