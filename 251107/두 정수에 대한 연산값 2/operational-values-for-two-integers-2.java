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

        IntWrap aIntWrap = new IntWrap(a);
        IntWrap bIntWrap = new IntWrap(b);

        calcu(aIntWrap, bIntWrap);

        a = aIntWrap.val;
        b = bIntWrap.val;

        System.out.print(a + " " + b);
    }

    public static void calcu(IntWrap a, IntWrap b) {
        if (a.val > b.val) {
            b.val += 10;
            a.val *= 2;
        } else {
            a.val += 10;
            b.val *= 2;
        }

        return;
    }
}