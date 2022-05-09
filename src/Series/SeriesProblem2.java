package Series;

import java.util.Scanner;

public class SeriesProblem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number, multiplication = 1;
        for (int i = 0; i < 5; i++) {
            number = scan.nextDouble();
            multiplication *= number;
        }
        System.out.println(multiplication);
    }
}