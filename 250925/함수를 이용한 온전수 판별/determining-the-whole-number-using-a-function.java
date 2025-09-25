import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        
        System.out.print(chk(m, d));
    }

    public static int chk(int a, int b) {
        int cnt = 0;
        for(int i = a; i <= b; i++) {
            if(i % 2 != 0 && i % 10 != 5 && !(i % 3 == 0 && i % 9 != 0)) {
                cnt++;
            }
        }
        return cnt;
    }
}