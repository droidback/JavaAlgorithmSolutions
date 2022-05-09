package Series;

import java.util.Scanner;

public class SeriesProblem1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number, sum=0;
        for (int i = 0; i < 10; i++) {
            number = scan.nextDouble();
            sum += number;
        }
        System.out.println(sum);
    }
}