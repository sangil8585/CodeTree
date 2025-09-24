import java.util.Scanner;

public class Main {
    public static boolean cal2(int m) {
        String o = String.valueOf(m);
        if(o.contains("3") || o.contains("6") || o.contains("9")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean cal(int n) {
        return n % 3 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt = 0;
        
        for(int i = A; i <= B; i++) {
            if(cal(i)) {
                cnt++;
            } else if(cal2(i)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}