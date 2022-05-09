package FunSimple;

import java.util.Scanner;

public class FunSimple51 {
    static void LncTime(int h, int m, int s, int t) {
        System.out.printf("%02d:%02d:%02d", h, m, s);
        System.out.println();

        int general = h * 3600 + m * 60 + s + t;
        h = general / 3600;
        m = general % 3600 / 60;
        s = general % 60;
        System.out.printf("%02d:%02d:%02d", h, m, s);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int t = in.nextInt();
        LncTime(h, m, s, t);
    }
}
