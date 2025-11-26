import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print(max(arr, 0));
    }

    public static int max(int[] arr, int startArr) {
        if(startArr == arr.length - 1) return arr[startArr];
        
        return Math.max(arr[startArr], max(arr, startArr + 1));
    }
}