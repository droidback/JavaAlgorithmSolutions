package Series;

import java.util.Scanner;

public class SeriesProblem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, c;
        boolean count = true;
        int n = sc.nextInt();
        c = sc.nextDouble();
        for (int i = 0; i < n - 1; i++) {
            a = sc.nextDouble();
            if (a < c) {
                count = !count;
            }
            c = a;
        }
        System.out.println(count);
    }
}