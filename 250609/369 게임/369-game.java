import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            
            if(i%3 == 0 || i%10 == 3 || i%10 == 6 || i%10 == 9) {
                System.out.print(0 + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}