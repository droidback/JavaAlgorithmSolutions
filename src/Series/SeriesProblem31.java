package Series;

import java.util.Scanner;

public class SeriesProblem31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), k = scan.nextInt(), number, count = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                number = scan.nextInt();
                if (number == 2) count++;
            }
            sum += count;
        }
        System.out.println(sum);
    }
}