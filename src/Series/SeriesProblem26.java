package Series;

import java.util.Scanner;

public class SeriesProblem26{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), k = scan.nextInt(), number, pow=1;
        for (int i = 0; i < n; i++) {
            number = scan.nextInt();
            for (int j = 0; j < k; j++) {
                pow *= number;
            }
            System.out.println(pow);
            pow=1;
        }
    }
}