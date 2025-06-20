import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0, c = 0, d = 0; 

        for(int i = 0; i < 3; i++) {
            String chk = sc.next();
            int temp = sc.nextInt();
            
            if(chk.equals("Y") && temp > 36 ) {
                a++;
            } else if (chk.equals("N") && temp > 36) {
                b++;
            } else if (chk.equals("Y") && temp <= 36) {
                c++;
            } else {
                d++;
            }
            
        }
        System.out.print(a + " " + b + " " + c + " " + d);

        if (a >= 2) {
            System.out.print(" E");
        }
    }
}