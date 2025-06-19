import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        
        arr[0] = 1;
        arr[1] = sc.nextInt();
        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if(arr[i] >= 100) {
                break;
            }
        }
    }
}