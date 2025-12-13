import java.io.*;
import java.util.*;

public class Main {
    static int dayOfYear(int m, int d, int[] lastDay) {
        int sum = 0;
        for (int i = 1; i < m; i++) sum += lastDay[i];
        return sum + d;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        int[] lastDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int day1 = dayOfYear(m1, d1, lastDay);
        int day2 = dayOfYear(m2, d2, lastDay);

        int diff = day2 - day1;
        int idx = (1 + diff) % 7;
        if (idx < 0) idx += 7;

        System.out.println(days[idx]);
    }
}