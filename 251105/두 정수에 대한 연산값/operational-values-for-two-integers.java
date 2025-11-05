import java.util.Scanner;

class IntWrap {
    int val;

    public IntWrap(int val) {
        this.val = val;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrap aWrap = new IntWrap(a);
        IntWrap bWrap = new IntWrap(b);

        calcu(aWrap, bWrap);

        a = aWrap.val;
        b = bWrap.val;

        System.out.print(a + " " + b);
    }

    public static void calcu(IntWrap a, IntWrap b) {
        if (a.val > b.val) {
            b.val *= 2;
            a.val += 25;
        } else {
            a.val *= 2;
            b.val += 25;
        }

        return;
    }
}