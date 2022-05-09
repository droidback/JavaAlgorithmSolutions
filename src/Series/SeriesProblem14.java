package Series;

import java.util.Scanner;

public class SeriesProblem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, count = 0;
        int n = Integer.MAX_VALUE;
        double k = sc.nextDouble();
        boolean ckeck = true;
        for (int i = 0; i < n && ckeck; i++) {
            a = sc.nextDouble();
            if (a < k && ckeck) {
                count++;
            }
            if (a == 0) {
                ckeck = !ckeck;
            }
        }
        System.out.println(count);
    }
}