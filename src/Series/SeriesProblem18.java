package Series;

import java.util.Scanner;

public class SeriesProblem18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, c = 0;
        int n = Integer.MAX_VALUE;
        boolean check = true;
        for (int i = 0; i < n; i++) {
            a = scan.nextDouble();
            if (a == c) {
                continue;
            }
            c = a;
            System.out.println(a);
        }
    }
}