import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < arr.length; i++) {
            arr[i] += sc.nextInt();
            arr[i] *= arr[i];
            System.out.print(arr[i] + " ");
        }
    }
}