package Series;

import java.util.Scanner;

public class SeriesProblem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, count = 0;
        int n = Integer.MAX_VALUE;
        int k = sc.nextInt();
        boolean check = true;
        for (int i = 1; i < n; i++) {
            a = sc.nextInt();
            if (a > k && check) {
                count = i;
                check = !check;
            }
            if (a == 0) {
                break;
            }
        }
        System.out.println(count);
    }
}