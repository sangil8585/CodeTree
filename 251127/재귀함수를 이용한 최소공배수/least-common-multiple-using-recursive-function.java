import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // 최소공배수 = 두 자연수의 곱 / 최대공약수

        // 최대 공약수
        System.out.println(result(arr, 0));
    }

    // 최대공약수
    private static int gcd(int a, int b) {
        if(b == 0) return a;

        return gcd(b, a%b);
    }

    // 최소공배수
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a,b);
    }

    private static int result(int[] arr, int num) {
        if(num == arr.length-1) {
            return arr[num];
        }
        // 인덱스 arr[0], arr[1]을 gcd(arr[0], arr[1])로 돌리고 돌린다.
        // arr[0], arr[1]의 값을 더한다 => plusNum
        // plusMun / gcd(arr[0], arr[1])
        return lcm(arr[num], result(arr, num+1));
    }
}