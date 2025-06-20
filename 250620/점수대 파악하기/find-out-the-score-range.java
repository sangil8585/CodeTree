import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[11];

        while (true) {
            int num = sc.nextInt();
            
            if(num == 0) break;
            if(num >= 10) {
                int i = num / 10;
                score[i]++;
            }
        }

        for(int i = 10; i > 0; i--) {
            System.out.println((i*10) + " - " + score[i]);
        }
    }
}