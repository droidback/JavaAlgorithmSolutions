package Series;

import java.util.Scanner;

public class SeriesProblem22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, c, count = 0;
        int n = scan.nextInt();
        c = scan.nextDouble();
        boolean check = true;
        for (int i = 0; i < n - 1; i++) {
            a = scan.nextDouble();
            if (a < c && check) {
                count = i + 1;
                check = !check;
            }
            c = a;
        }
        System.out.println(count);
    }
}