package Series;

import java.util.Scanner;

public class SeriesProblem29{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt(), k = scan.nextInt(), number;
        double sum =0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                number = scan.nextInt();
                sum +=number;
            }
        }
        System.out.println(sum);
    }
}