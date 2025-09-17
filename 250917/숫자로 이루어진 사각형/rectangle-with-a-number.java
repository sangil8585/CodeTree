import java.util.Scanner;
public class Main {
    public static void loop(int num) {
        int cnt = 1;
        for(int i = 0; i < num; i++) {
            for(int y = 0; y < num; y++) {
                if(cnt == 10) {
                    cnt = 1;
                }
                System.out.print(cnt++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        loop(n);
    }
}