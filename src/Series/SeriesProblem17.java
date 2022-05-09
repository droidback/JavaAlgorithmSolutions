package Series;

import java.util.Scanner;

public class SeriesProblem17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double a, b = scan.nextDouble();
        for (int i = 0; i < n; i++) {
            a = scan.nextDouble();
            System.out.println(a);
        }
        System.out.println(b);
    }
}