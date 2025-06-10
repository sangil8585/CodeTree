import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        for (int i = 0; i < 10; i++){
            int num = sc.nextInt();

            if (num % 2 == 1) {
                count++;
            }
        }
        System.out.print(count);
        
    }
}