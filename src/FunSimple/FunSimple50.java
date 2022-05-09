package FunSimple;

import java.util.Scanner;

public class FunSimple50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = 0, m = 0, s = 0;
        int t1 = scan.nextInt();
        int t2 = scan.nextInt();
        int t3 = scan.nextInt();
        TimeToHMS(t1, h, m, s);
        TimeToHMS(t2, h, m, s);
        TimeToHMS(t3, h, m, s);
    }

    static void TimeToHMS(int T, int h, int m, int s) {
        h = T / 3600;
        m = T % 3600 / 60;
        s = T % 60;
        System.out.printf("%02d:%02d:%02d", h, m, s);
        System.out.println();

    }
}
