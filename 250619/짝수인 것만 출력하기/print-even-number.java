import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}