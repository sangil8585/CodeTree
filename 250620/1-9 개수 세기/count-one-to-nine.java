import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] arrCnt = new int[10];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            arrCnt[arr[i]]++;
        }
        
        for (int i = 1; i < 10; i++) {
            System.out.println(arrCnt[i]);
        }
    }
}