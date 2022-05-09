package Series;

import java.util.Scanner;

public class SeriesProblem28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), number, pow = 1;
        for (int i = 1; i <= n; i++) {
            number = scan.nextInt();
            for (int j = 0; j <= n-i; j++) {
                pow *= number;
            }
            System.out.println(pow);
            pow = 1;
        }
    }
}

