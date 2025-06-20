import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[99];
        int[] cntArr = new int[10];

        for(int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
            if(arr[i] == 0) {
                break;
            }
            
            int numChk = arr[i] / 10;
            cntArr[numChk]++;
        }

        for(int i = 1; i < 10; i++) {
            if (cntArr[i] >= 0) {
                System.out.println(i + " - " + cntArr[i]);
            }
        }
    }
}