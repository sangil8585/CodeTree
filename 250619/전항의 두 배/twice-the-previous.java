import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i = 0; i < 2; i++ ) {
            arr[i] = sc.nextInt();
        }
        System.out.print(arr[0] + " " + arr[1] + " ");

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + (arr[i-2] * 2);
            System.out.print(arr[i] + " ");
        }
    }
}