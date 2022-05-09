package Series;

import java.util.Scanner;

public class SeriesProblem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number, mean = 0;
        int i;
        for (i = 0; i < 10; i++) {
            number = scan.nextDouble();
            mean += number;
        }
        mean /= i;
        System.out.println(mean);
    }
}