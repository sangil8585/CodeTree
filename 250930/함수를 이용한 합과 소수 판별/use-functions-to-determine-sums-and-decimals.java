import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        calSum(a, b);
    }

    public static void calSum(int x, int y) {
        int sum = 0;
        int count = 0;
        int cnt = 0; 
        for(int i = x; i <= y; i++) {
            if(i < 2) {
                continue;
            } 
            for (int m = 2; m <= i; m++) {
                if(i % m == 0) {
                    int calA = i / 10;
                    int calB = i % 10;

                    if((calA + calB) % 2 == 0) {
                        count++;
                    }
                }
            }
            if (count == 1) {
                cnt++;
            }
            count = 0;
        }
        System.out.println(cnt);
    }
}