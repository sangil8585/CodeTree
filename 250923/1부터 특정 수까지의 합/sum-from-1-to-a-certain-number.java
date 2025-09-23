import java.util.Scanner;
public class Main {
    public static int cal(int a) {
        int calcul = 0;
        for(int i = 1; i <= a; i++) 
            return calcul += i;    
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(cal(n));

    }
}