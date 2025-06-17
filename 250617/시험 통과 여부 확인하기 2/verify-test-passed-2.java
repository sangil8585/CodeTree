import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentCnt = sc.nextInt();
        int[] sumArr = new int[studentCnt];
        int[] avgArr = new int[studentCnt];
        int count = 0;

        for(int i=0; i<studentCnt; i++) {
            int sum = 0;
            for(int j=0; j<4; j++) {
                sum += sc.nextInt();
            }
            sumArr[i] = sum;
            avgArr[i] = sumArr[i]/4;
            
            if(avgArr[i] >= 60) {
                count++;
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }

        System.out.println(count);

    }
}
