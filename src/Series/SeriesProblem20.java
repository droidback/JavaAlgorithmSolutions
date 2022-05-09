package Series;

import java.util.Scanner;

public class SeriesProblem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, c, count = 0;
        int n = sc.nextInt();
        c = sc.nextDouble();
        for (int i = 0; i < n - 1; i++) {
            a = sc.nextDouble();
            if (a > c) {
                count++;
                System.out.println(c);
            }
            c = a;
        }
        System.out.println(count);
    }
}