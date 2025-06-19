import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int num = sc.nextInt();
        int count = 0;

        for(int i = 1; i < 101; i++) {
            arr[i-1] = num * i;
            System.out.print(arr[i-1] + " ");
            if( arr[i-1] % 5 == 0) {
                count++;
            }

            if(count == 2 ){
                break;
            }
        }

    }
}