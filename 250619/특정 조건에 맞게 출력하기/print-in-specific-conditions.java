import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                break;
            }
            if(arr[i] % 2 == 1) {
                System.out.print(arr[i] + 3 + " ");
            } else {
                System.out.print(arr[i] / 2 + " ");
            }
        }
    }
}