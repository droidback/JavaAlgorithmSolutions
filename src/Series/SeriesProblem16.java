package Series;

import java.util.Scanner;

public class SeriesProblem16 {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        int a, count = 0;
        int n = Integer.MAX_VALUE;
        int k = check.nextInt();
        for (int i = 1; i < n; i++) {
            a = check.nextInt();
            if (a > k) {
                count = i;
            }
            if (a == 0) {
                break;
            }
        }
        System.out.println(count);
    }
}