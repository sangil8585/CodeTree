import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        
        for(int j = 0; j < 3; j++) {
            for(int k = 0; k < 3; k++) {
                arr1[j][k] = sc.nextInt();
            }
        }

        for(int j = 0; j < 3; j++) {
            for(int k = 0; k < 3; k++) {
                arr2[j][k] = sc.nextInt();
            }
        }

        for(int j = 0; j < 3; j++) {
            for(int k = 0; k < 3; k++) {
                System.out.print(arr1[j][k] * arr2[j][k] + " ");
            }
            System.out.println();
        }
    }
}