import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        boolean tf = false;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == b.charAt(0)) {
                System.out.print(i);
                tf = true;
                break;
            }
        }
        if (!tf) {
            System.out.print("No");
        }
    }
}